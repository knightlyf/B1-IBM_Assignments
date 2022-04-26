import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LoginClass } from './login-class';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  headers = new HttpHeaders().set('Content-Type', 'application/json').set('Access-Control-Allow-Origin','*');
  constructor(private http:HttpClient) { }
    
  //this is a get method in angular to fetch the detail from the server
     getLoginDetails(): Observable<LoginClass[]>{
    let getLoginUrl:string = "http://localhost:8082/users/all";
    // return this.http.get(getLoginUrl,{headers: this.headers});
    return this.http.get<LoginClass[]>(getLoginUrl,{headers: this.headers});
  }
}
