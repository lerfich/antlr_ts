import TypescriptToPythonVisitor from "../lib/TypescriptToPythonVisitor.js";
import { findMargin } from "./helpers.js";

export class Visitor extends TypescriptToPythonVisitor {
  //   visitor: any;
  //   contextLevel: any;
  //   visit: any;
  //   visitChildren: (ctx: any) => any;

  constructor() {
    super();
    this.contextLevel = 0;
  }

  visitStart(ctx) {
    return this.visit(ctx.methodDeclarations());
  }

  visitBody(ctx) {
    // let pythonLines: string[] = [];
    let pythonLines = []
    for (
      let statementNum = 0;
      statementNum < ctx.statement().length;
      statementNum += 1
    ) {
      pythonLines.push(
        findMargin(this.contextLevel) +
          this.visit(ctx.statement()[statementNum])
      );
      if (pythonLines[pythonLines.length - 1].slice(-1) == ",") {
        pythonLines[pythonLines.length - 1] = pythonLines[
          pythonLines.length - 1
        ].slice(0, -1);
      }
    }
    return pythonLines.join("\n");
  }

  visitDeclarations(ctx) {
    let pythonMethods = [];
    pythonMethods = this.visitChildren(ctx);
    return pythonMethods.join("\n");
  }

  visitDeclaration(ctx) {
    let header = ctx.header();
    let pythonMethodHeader = findMargin(this.contextLevel) + this.visit(header);
    this.contextLevel += 1;
    let body = ctx.body();
    let pythonMethodBody = this.visit(body);
    this.contextLevel -= 1;
    return `${pythonMethodHeader}\n${pythonMethodBody}`;
  }

  visitStatement(ctx) {
    let python_comments = "";
    if (ctx.comments()) {
      python_comments = this.visit(ctx.comments());
    }
    return this.visit(ctx.deepStatement()) + " " + python_comments;
  }

  visitVariableDeclation(ctx) {
    let varName = ctx.variable().getText();
    let varValue = this.visit(ctx.valueOfVariable());

    let result = `${varName} `;

    if (varValue != null) {
      switch (varValue) {
        case "true":
          result += `= True`;
          break;
        case "false":
          result += `= False`;
          break;
        case "null":
          result += `= None`;
          break;
        case "undefined":
          result += `= None`;
          break;
        default:
          result += `= ${varValue}`;
      }
    }

    return result;
  }

  visitValueOfVariable(ctx) {
    if (ctx.structure()) {
      let pythonStructureName = ctx
        .structure()
        .structureDeclaration()
        .getText();
      let pythonStructureArgs = ctx.structure().structureArguments().getText();
      switch (pythonStructureName) {
        case "newMap":
          return "{}";
        case "newSet":
          return `set(${pythonStructureArgs})`;
      }
    } else {
      return ctx.getText();
    }
  }

  visitMethodExec(ctx) {
    let methodName = ctx.methodName().getText();
    if (ctx.methodCallAgruments) {
      let pythonMethodCallArguments = ctx.methodArgs().getText();
      return `${methodName}(${pythonMethodCallArguments})`;
    } else {
      return `${methodName}()`;
    }
  }

  visitHeader(ctx) {
    if (ctx.declarationArgs()) {
      let pythonMethodDecArgs = ctx.declarationArgs().getText();
      return `def ${ctx.methodName().getText()}(${pythonMethodDecArgs}):`;
    } else {
      return `def ${ctx.methodName().getText()}():`;
    }
  }

  visitComments(ctx) {
    return "# " + ctx.getText().slice(2);
  }

  visitConditionIf(ctx) {
    let pythonConditionHeader = this.visit(ctx.conditionBar());
    this.contextLevel += 1;
    let pythonConditionBody = this.visit(ctx.body());
    this.contextLevel -= 1;
    if (ctx.elseCondition()) {
      let pythonConditionElse = this.visit(ctx.elseCondition());
      return `${pythonConditionHeader}\n${pythonConditionBody}\n${pythonConditionElse}`;
    } else {
      return `${pythonConditionHeader}\n${pythonConditionBody}`;
    }
  }

  visitConditionBar(ctx) {
    let pythonCompareRule = ctx.conditionBarRule().getText();
    if (pythonCompareRule == "===") {
      pythonCompareRule = "==";
    }
    if (pythonCompareRule == "!==") {
      pythonCompareRule = "!=";
    }
    return `${ctx.leftBar().getText()} ${pythonCompareRule} ${ctx
      .rightBar()
      .getText()}:`;
  }

  visitElseCondition(ctx) {
    let pythonConditionElse = findMargin(this.contextLevel) + "else:\n";
    this.contextLevel += 1;
    pythonConditionElse += this.visit(ctx.body());
    this.contextLevel -= 1;
    return pythonConditionElse;
  }

  visitOperationsWithVariable(ctx) {
    let pythonOperationLeft = ctx.leftOperation().getText();
    let pythonOperationRight = ctx.rightOperation().getText();
    return pythonOperationLeft + pythonOperationRight;
  }

  visitProtectedMethod(ctx) {
    let pythonMethodCall = "";
    if (ctx.consoleLog()) {
      pythonMethodCall = "print";
    }
    let pythonArguments = "";
    if (ctx.methodArgs()) {
      pythonArguments = ctx.methodArgs().getText();
    }
    return `${pythonMethodCall}(${pythonArguments})`;
  }

  visitObjectMethodExec(ctx) {
    let pythonVariableName = ctx.variable().getText();
    let pythonMethodName = ctx.methodName().getText();
    let pythonArguments = "";
    if (ctx.methodArgs()) {
      pythonArguments = ctx.methodArgs().getText();
    }
    switch (pythonMethodName) {
      case "push":
        pythonMethodName = "extend";
        return `${pythonVariableName}.${pythonMethodName}([${pythonArguments}])`;
      case "delete":
        pythonMethodName = "discard";
        return `${pythonVariableName}.${pythonMethodName}(${pythonArguments})`;
      case "remove":
        pythonMethodName = "del";
        return `${pythonMethodName} ${pythonVariableName}[${pythonArguments}]`;
      case "pop":
        pythonMethodName = "pop";
        return `${pythonVariableName}.${pythonMethodName}()`;
      case "shift":
        pythonMethodName = "pop";
        return `${pythonVariableName}.${pythonMethodName}(0)`;
      case "set":
        pythonMethodName = "update";
        return `${pythonVariableName}.${pythonMethodName}({${pythonArguments}})`;
      case "has":
        return `${pythonArguments} in ${pythonVariableName}`;
      default:
        return `${pythonVariableName}.${pythonMethodName}(${pythonArguments})`;
    }
  }

  visitObjectProperty(ctx) {
    let pythonVariableName = ctx.variable().getText();
    let pythonProperty = ctx.propertyTitle().getText();
    switch (pythonProperty) {
      case "length":
        return `len(${pythonVariableName})`;
      case "size":
        return `len(${pythonVariableName})`;
      default:
        return `${pythonVariableName}.${pythonProperty}`;
    }
  }

  visitReturnFunctionValue(ctx) {
    return `return ${ctx.resultValue().getText()}`;
  }
}
