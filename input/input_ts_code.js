// мы можем создавать множество;

let NEW_SET = new Set();

let another_set = new Set("a", "b", "cdcd");

// операции 

NEW_SET.add("element")
NEW_SET.has("some el")
another_set.clear()
another_set.delete(1)
another_set.clear()


// мы можем создавать словарь
let dict = new Map();

// операции

dict.set(0, 1);
dict.get(0);
dict.remove(12912);
dict.has(999);
dict.size;


// массивы

let s = [2, 4, 5]
const array = ["new", "array", "of syms"]

// операции

array.length;
s.push("s");
s.shift();
s.pop();
s[3] = "3"


// функции

function add_numbers(number1, number2){
    const sum = [number1];
    return sum;
};

// if (a > 5){
//     console.log(a)
// }
// else{
//     console.log("Hello it's working!!!");
// }

function add_3(num1){
    return 3;
}

a = add_3(0) + 3**3;


// блоки с условием if

const aa = 5;
let cc = 5;

if (cc === 5) {
    console.log(2)
}

if (aa !== cc) {
    console.log(cc);
} else {
    if (aa >= cc) {
        console.log("wow?");
    }
}
