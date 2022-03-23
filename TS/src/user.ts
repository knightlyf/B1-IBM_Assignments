import {Repo} from "./repo";

export class user{
    login:string;
    fullname:string;
    repoCount:number;
    followers:number;
    repos ?:Repo[];

    constructor(userResponse:any){
        this.login = userResponse.login;
        this.fullname = userResponse.name;
        this.repoCount = userResponse.public_repos;
        this.followers = userResponse.followers;
        // this.repos ?;
        
    }
}
