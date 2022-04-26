class Person{
    public personId:number;
    private orderId:number;
    protected refId:number;

    constructor(a:number){
        this.personId=a;
        this.orderId=201;
        this.refId=301;
        console.log("Person obj initialised");
        console.log("Person Id-->" +this.personId);
    }
    
//public method
    public createperson():string{
        console.log( "Person Object created"+ " " +this.personId);
        return "Person Object created with order id"+ " " +this.personId+ " and orderId " +this.orderId;
    }

//private method
private testPrivateMethod():string{

    return 'this is my private one';
  }
// access private using previledged here 

public testPreviledged():string{

    console.log('access private using previledged here -->');
    return this.testPrivateMethod();
  }

    //   static impl
    static testStatic():string{
        console.log('call static impl');
        return 'this is static method';
    }
}

//create another class Student
class Student extends Person{
    public testChildren(){
        console.log('refId-->' +this.refId);
        return 'student is created with refId:' +this.refId;
    }
}


// let p=new Person(153);
let s = new Student(123);
console.log("public method:" +s.createperson());

console.log('Access private outside the scope of class-->' +s.testPreviledged());

console.log('Access static method-->' +Person.testStatic());

console.log('Access child class-->' +s.testChildren());