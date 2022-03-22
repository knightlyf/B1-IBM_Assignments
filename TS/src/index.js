"use strict";
exports.__esModule = true;
// imports
var ServiceAPI_1 = require("./ServiceAPI");
console.log("GitHub API Demo");
var srvr = new ServiceAPI_1.ServiceAPI();
srvr.getUserInfo("knightlyf", function (usr) {
    console.log(usr);
});
