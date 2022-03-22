"use strict";
exports.__esModule = true;
exports.person = void 0;
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    person.prototype.join = function () {
        return this.name + this.age;
    };
    person.prototype.justprint = function (str) {
        console.log(str);
    };
    return person;
}());
exports.person = person;
;
