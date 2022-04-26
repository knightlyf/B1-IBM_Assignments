import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ProfessorServiceService {
  headers = new HttpHeaders().set('Content-Type', 'application/json').set('Access-Control-Allow-Origin','*');
  constructor(private http:HttpClient) { }
    
  //this is a get method in angular to fetch the detail from the server
     getRegisteredStudent(): Observable<any>{
    let getStudentUrl:string = "http://localhost:8080/students/registrations";
    return this.http.get(getStudentUrl,{headers: this.headers});
    
  }
 
}
