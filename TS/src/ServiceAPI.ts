import * as request from 'request';
import { user } from './user';
import { repo } from './repo';

//header
const options: any = {
    headers:{
    'User-Agent': 'request'
    },
    json:true
}

export class ServiceAPI{
    
    getUserInfo(userName:string,callback:(usr:user)=>any){
        
        //request user info
        request.get("https://api.github.com/users/"+userName,options,(error:any,response:any,body:any)=>{
            // console.log(response);
            // console.log(body);
            // console.log(error);
            let usr = new user(body);
            // let usr = new user(JSON.parse(body));
            console.log(usr);
        });
    }

    getRepo(userName:string){
        // request repo info
        request.get("https://api.github.com/users/"+userName+"/repos",options,(error:any,response:any,body:any)=>{
            let rep = new repo(body);
            console.log(rep);
        });
    }
}