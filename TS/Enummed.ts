enum days{
    Sun,Mon,Tue,Wed,Thu,Fri,Sat,day=7
}
let today:days;
today = days.day;
console.log(today);

let sum = (x:number,y:number):number=>{return x+y}
console.log(sum(10,20));