import { CommonTokenStream, FileStream } from "antlr4";
import TypescriptToPythonLexer from "./lib/TypescriptToPythonLexer.js";
import TypescriptToPythonParser from "./lib/TypescriptToPythonParser.js";
import * as fs from "fs";
import { Visitor } from "./codeGenerator/PythonGenerator.js";

const input = new FileStream("input/input_ts_code.js");
const lexer = new TypescriptToPythonLexer(input);

const tokenStream = new CommonTokenStream(lexer);
const parser = new TypescriptToPythonParser(tokenStream);

const program = parser.program();
const result = new Visitor().visit(program);

fs.writeFileSync("results/output_python_code.py", result[0]);
