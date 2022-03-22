"use strict";
exports.__esModule = true;
exports.ServiceAPI = void 0;
var request = require("request");
var user_1 = require("./user");
var repo_1 = require("./repo");
//header
var options = {
    headers: {
        'User-Agent': 'request'
    },
    json: true
};
var ServiceAPI = /** @class */ (function () {
    function ServiceAPI() {
    }
    ServiceAPI.prototype.getUserInfo = function (userName, callback) {
        //request user info
        request.get("https://api.github.com/users/" + userName, options, function (error, response, body) {
            // console.log(response);
            // console.log(body);
            // console.log(error);
            var usr = new user_1.user(body);
            // let usr = new user(JSON.parse(body));
            console.log(usr);
        });
    };
    ServiceAPI.prototype.getRepo = function (userName) {
        // request repo info
        request.get("https://api.github.com/users/" + userName + "/repos", options, function (error, response, body) {
            var rep = new repo_1.repo(body);
            console.log(rep);
        });
    };
    return ServiceAPI;
}());
exports.ServiceAPI = ServiceAPI;
