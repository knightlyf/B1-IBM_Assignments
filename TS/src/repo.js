"use strict";
exports.__esModule = true;
exports.repo = void 0;
var repo = /** @class */ (function () {
    // constructor(name:string,description:string,url:string,size:number,forkCount:number){
    //     this.name = name;
    //     this.description = description;
    //     this.url = url;
    //     this.size = size;
    //     this.forkCount = forkCount;
    // }
    function repo(repoResponse) {
        this.name = repoResponse.name;
        this.description = repoResponse.description;
        this.url = repoResponse.html_url;
        this.size = repoResponse.size;
        this.forkCount = repoResponse.forks_count;
    }
    return repo;
}());
exports.repo = repo;
