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
var Person = /** @class */ (function () {
    function Person(a) {
        this.personId = a;
        this.orderId = 201;
        this.refId = 301;
        console.log("Person obj initialised");
        console.log("Person Id-->" + this.personId);
    }
    //public method
    Person.prototype.createperson = function () {
        console.log("Person Object created" + " " + this.personId);
        return "Person Object created with order id" + " " + this.personId + " and orderId " + this.orderId;
    };
    //private method
    Person.prototype.testPrivateMethod = function () {
        return 'this is my private one';
    };
    // access private using previledged here 
    Person.prototype.testPreviledged = function () {
        console.log('access private using previledged here -->');
        return this.testPrivateMethod();
    };
    //   static impl
    Person.testStatic = function () {
        console.log('call static impl');
        return 'this is static method';
    };
    return Person;
}());
//create another class Student
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Student.prototype.testChildren = function () {
        console.log('refId-->' + this.refId);
        return 'student is created with refId:' + this.refId;
    };
    return Student;
}(Person));
// let p=new Person(153);
var s = new Student(123);
console.log("public method:" + s.createperson());
console.log('Access private outside the scope of class-->' + s.testPreviledged());
console.log('Access static method-->' + Person.testStatic());
console.log('Access child class-->' + s.testChildren());
