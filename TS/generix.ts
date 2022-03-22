import {person} from "./impexp";

function echo<T>(arg: T): T {
    return arg;
}

var a = echo("Typescript");
var b = echo(34)

class Boi extends person{}
class Gal extends person{}

let boi = new Boi("Boi", 34);
let gal = new Gal("Gal", 34);

console.log(boi.join());
gal.justprint("November111AlphaFoxtrot");

function Employee<T extends person>(arg: T): T {
    return arg;
}
console.log(Employee(boi).join());