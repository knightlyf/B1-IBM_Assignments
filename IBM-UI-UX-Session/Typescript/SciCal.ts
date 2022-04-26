class SciCalculator {
    public num1: number;
    public num2: number;
    private prv1:number;
    private prv2: number;
    protected str1: string;

    constructor(num1:number, num2:number) {
        this.num1 = num1;
        this.num2 = num2;
        this.prv1 = 100;
        this.prv2 = 45;
        this.str1 = "CALCULATOR";
    }

    //static method
    static calStatic() :string {
        console.log("calculator static method--->");
        return 'SciSciCalculator static method';
    
    }

    //private methods
    private sin():string {
        console.log("private method for SIN\n");
        return "sin of "+this.prv1+" is "+Math.sin(this.prv1);
    }
    private cos():string{
        console.log("private method for COS\n");
        return "cos of "+this.prv1+" is "+Math.cos(this.prv1);
    }
    private tan():string{
        console.log("private method for TAN\n");
        return "tan of "+this.prv2+" is "+Math.tan(this.prv2);
    }

    //public methods
    public sqrt() :string{
        return "sqrt of "+this.num1+" is:"+Math.sqrt(this.num1);
    }

    public preMethod(){
        console.log("Call private using privileged method\n");
        console.log("Sin("+this.prv1+")="+this.sin());
        console.log("Cos("+this.prv1+")="+this.cos());
        console.log("Tan("+this.prv2+")="+this.tan());
    }

}
//inheritence
class Computer extends SciCalculator{
    public status():string{
        console.log("Protectes variable accessed -->"+this.str1);
        console.log("Inheritence--->");
        return 'Computer is calculating';
    }

}

// let sciCal = new SciCalculator(10, 20);
let sciCal = new Computer(10, 20);
console.log(SciCalculator.calStatic());
console.log("Private method call\n"+sciCal.preMethod());
console.log("Public method call\n"+sciCal.sqrt());
console.log(sciCal.status());
