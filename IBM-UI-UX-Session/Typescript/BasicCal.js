var Calculator = /** @class */ (function () {
    function Calculator(num1, num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //public methods
    Calculator.prototype.add = function () {
        return this.num1 + this.num2;
    };
    Calculator.prototype.sub = function () {
        return this.num1 - this.num2;
    };
    Calculator.prototype.mul = function () {
        return this.num1 * this.num2;
    };
    Calculator.prototype.div = function () {
        return this.num1 / this.num2;
    };
    return Calculator;
}());
var cal = new Calculator(10, 20);
console.log("Addition of " + cal.num1 + " & " + cal.num2 + "=" + cal.add());
console.log("Subtraction of " + cal.num1 + " & " + cal.num2 + "=" + cal.sub());
console.log("Multiplication of " + cal.num1 + " & " + cal.num2 + "=" + cal.mul());
console.log("Division of " + cal.num1 + " & " + cal.num2 + "=" + cal.div());
