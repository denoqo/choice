function test(paras) {
    console.log(paras);
    return paras + 1;
}

var res = test(10);

(function () {
    console.log("xxxx");
})()
function fname () {
    console.log("function name");
}
fname();

var fn = function(num1, num2) {
    return (num1 + num2);
}
fn()

console.log(fn)
console.log(fn(1,2))

