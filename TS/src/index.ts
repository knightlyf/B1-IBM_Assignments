// imports
import {ServiceAPI} from "./ServiceAPI";
import {user} from "./user";

console.log("GitHub API Demo");
let srvr = new ServiceAPI();
srvr.getUserInfo("knightlyf",(usr:user)=>{
    console.log(usr);
});
