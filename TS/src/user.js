"use strict";
exports.__esModule = true;
exports.user = void 0;
var user = /** @class */ (function () {
    function user(userResponse) {
        this.login = userResponse.login;
        this.fullname = userResponse.name;
        this.repoCount = userResponse.public_repos;
        this.followers = userResponse.followers;
        // this.repos ?;
    }
    return user;
}());
exports.user = user;
