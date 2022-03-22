export class repo{
    name:string;
    description:string;
    url:string;
    size:number;
    forkCount:number;
    // constructor(name:string,description:string,url:string,size:number,forkCount:number){
    //     this.name = name;
    //     this.description = description;
    //     this.url = url;
    //     this.size = size;
    //     this.forkCount = forkCount;
    // }
    constructor(repoResponse:any){
        this.name = repoResponse.name;
        this.description = repoResponse.description;
        this.url = repoResponse.html_url;
        this.size = repoResponse.size;
        this.forkCount = repoResponse.forks_count;
    }
}