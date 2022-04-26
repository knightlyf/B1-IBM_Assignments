import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class GradeserviceService {
  headers = new HttpHeaders().set('Content-Type', 'application/json').set('Access-Control-Allow-Origin','*');
  constructor(private http:HttpClient) { }
    
  //this is a post method in angular to fetch the detail from the user
  gradeStudent(student:Student): Observable<Student[]>{
    let getStudentUrl:string = "http://localhost:8081/post/students/grades";
    const body = JSON.stringify(student);
    return this.http.post<Student[]>(getStudentUrl,body,{headers: this.headers});
  }
}
