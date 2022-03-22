let arr:string[]=["a","b","c"];
let arr1:number[]=[1,2,3];
let arr2:string[][]=[["a","b","c"],["d","e","f"]];
for(var i=0;i<arr2.length;i++){
    for(var j=0;j<arr2[i].length;j++){
        arr2[i][j]=i+" "+j;
        console.log(arr2[i][j]);
    }
}
arr.unshift("<end>");
arr.push("<start>");
console.log(arr.reverse());

console.log("Does array1 contain 'a'? ");
// console.log(arr1.includes(1));

console.log("------All Elements------");
console.log(arr.join(" "));