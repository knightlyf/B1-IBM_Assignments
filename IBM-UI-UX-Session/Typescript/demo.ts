// first code of TS here 
// TS itself a javascript & support all the Syntax of JS by Typescript 
console.log('my first typescript here');

// data type declaration in Typescript 

let myvar:number=45000;
console.log(typeof(myvar));
console.log('value of the myvar-->' +myvar);

var myvar1:string='sun is up';
console.log(typeof(myvar1));
console.log('value of string here-->' +myvar1);


//any
let test:any=45;
console.log(typeof(test));
console.log('value of test here-->' +test);

//methods
// with Default param 

function details(id:number,name:string,mail_id?:string){

    console.log("ID-->" +id);
    console.log("Name-->" +name);
  
    if(mail_id!=undefined){
  
      console.log("Email-Id-->" +mail_id);
          
      }
    }
  
  details(123,"Varun");
  details(123,"Varun","Varun.vinod@ibm.com");


// Noraml Method 

function addValue(value1:number, value2:number):number{

    console.log('addition of the value of both param');
   
    return value1 + value2;
   
   }
   
   console.log(addValue(6,9));

// default parameter in typescript 

// defual parameter in methods 

function discount(price:number,rate:number=0.50):number{


    let discount =price * rate;
    
    console.log("Discount AMount --->" +discount);
    
    return discount
    }
    
    console.log(discount(5000));
    console.log(discount(1000,0.40));

//
enum myConstants {

    pi=3.14,
    e=2.73,
    log2=0.3,
    log3=0.7,
    n1=2,
    n2=3,
    n3=5
 }
 
 console.log("finding the ENUM");
 console.log(2*myConstants.n3);