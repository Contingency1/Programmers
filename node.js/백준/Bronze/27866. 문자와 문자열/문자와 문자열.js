let fs = require("fs");
let input = fs.readFileSync("./dev/stdin").toString().trim().split("\n");

console.log(input[0][+input[1] - 1]);
