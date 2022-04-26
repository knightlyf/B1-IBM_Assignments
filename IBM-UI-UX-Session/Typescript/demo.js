// first code of TS here 
// TS itself a javascript & support all the Syntax of JS by Typescript 
console.log('my first typescript here');
// data type declaration in Typescript 
var myvar = 45000;
console.log(typeof (myvar));
console.log('value of the myvar-->' + myvar);
var myvar1 = 'sun is up';
console.log(typeof (myvar1));
console.log('value of string here-->' + myvar1);
//any
var test = 45;
console.log(typeof (test));
console.log('value of test here-->' + test);
//methods
// with Default param 
function details(id, name, mail_id) {
    console.log("ID-->" + id);
    console.log("Name-->" + name);
    if (mail_id != undefined) {
        console.log("Email-Id-->" + mail_id);
    }
}
details(123, "Varun");
details(123, "Varun", "Varun.vinod@ibm.com");
// Noraml Method 
function addValue(value1, value2) {
    console.log('addition of the value of both param');
    return value1 + value2;
}
console.log(addValue(6, 9));
// default parameter in typescript 
// defual parameter in methods 
function discount(price, rate) {
    if (rate === void 0) { rate = 0.50; }
    var discount = price * rate;
    console.log("Discount AMount --->" + discount);
    return discount;
}
console.log(discount(5000));
console.log(discount(1000, 0.40));
//
var myConstants;
(function (myConstants) {
    myConstants[myConstants["pi"] = 3.14] = "pi";
    myConstants[myConstants["e"] = 2.73] = "e";
    myConstants[myConstants["log2"] = 0.3] = "log2";
    myConstants[myConstants["log3"] = 0.7] = "log3";
    myConstants[myConstants["n1"] = 2] = "n1";
    myConstants[myConstants["n2"] = 3] = "n2";
    myConstants[myConstants["n3"] = 5] = "n3";
})(myConstants || (myConstants = {}));
console.log("finding the ENUM");
console.log(2 * myConstants.n3);
