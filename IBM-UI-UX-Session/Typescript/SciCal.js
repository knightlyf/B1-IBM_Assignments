var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var SciCalculator = /** @class */ (function () {
    function SciCalculator(num1, num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.prv1 = 100;
        this.prv2 = 45;
        this.str1 = "CALCULATOR";
    }
    //static method
    SciCalculator.calStatic = function () {
        console.log("calculator static method--->");
        return 'SciSciCalculator static method';
    };
    //private methods
    SciCalculator.prototype.sin = function () {
        console.log("private method for SIN\n");
        return "sin of " + this.prv1 + " is " + Math.sin(this.prv1);
    };
    SciCalculator.prototype.cos = function () {
        console.log("private method for COS\n");
        return "cos of " + this.prv1 + " is " + Math.cos(this.prv1);
    };
    SciCalculator.prototype.tan = function () {
        console.log("private method for TAN\n");
        return "tan of " + this.prv2 + " is " + Math.tan(this.prv2);
    };
    //public methods
    SciCalculator.prototype.sqrt = function () {
        return "sqrt of " + this.num1 + " is:" + Math.sqrt(this.num1);
    };
    SciCalculator.prototype.preMethod = function () {
        console.log("Call private using privileged method\n");
        console.log("Sin(" + this.prv1 + ")=" + this.sin());
        console.log("Cos(" + this.prv1 + ")=" + this.cos());
        console.log("Tan(" + this.prv2 + ")=" + this.tan());
    };
    return SciCalculator;
}());
//inheritence
var Computer = /** @class */ (function (_super) {
    __extends(Computer, _super);
    function Computer() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Computer.prototype.status = function () {
        console.log("Protectes variable accessed -->" + this.str1);
        console.log("Inheritence--->");
        return 'Computer is calculating';
    };
    return Computer;
}(SciCalculator));
// let sciCal = new SciCalculator(10, 20);
var sciCal = new Computer(10, 20);
console.log(SciCalculator.calStatic());
console.log("Private method call\n" + sciCal.preMethod());
console.log("Public method call\n" + sciCal.sqrt());
console.log(sciCal.status());
