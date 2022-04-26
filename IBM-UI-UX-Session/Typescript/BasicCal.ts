class Calculator {
    public num1: number;
    public num2: number;
                

    constructor(num1: number, num2: number) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //public methods
    add() {
        return this.num1 + this.num2;
    }
    sub() {
        return this.num1 - this.num2;
    }
    mul() {
        return this.num1 * this.num2;
    }
    div() {
        return this.num1 / this.num2;
    }
    
}

let cal = new Calculator(10, 20);
console.log("Addition of "+cal.num1+" & "+cal.num2+"="+cal.add());
console.log("Subtraction of "+cal.num1+" & "+cal.num2+"="+cal.sub());
console.log("Multiplication of "+cal.num1+" & "+cal.num2+"="+cal.mul());
console.log("Division of "+cal.num1+" & "+cal.num2+"="+cal.div());