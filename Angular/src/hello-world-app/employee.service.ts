import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {Intaircraft} from './src/app/aircraft/Intaircraft';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }
  private url ="/assests/data/aircraft.json";
  getAircrafts(): Observable<Intaircraft[]>{
    return this.http.get<Intaircraft[]>(this.url);
    // .catch(this.errorHandler);
    // return [
    //   {"id":101, "name":"VT-DJC", "age":30,"type":"Vickers 768D Viscount"},
    //   {"id":102,"name":"VT-MXF","age":2, "type":"Boeing 737 MAX 8"},
    //   {"id":103,"name":"VT-IFN","age":12, "type":"Airbus A320 Neo"},
    //   {"id":104,"name":"N434UP","age":23, "type":"Boeing 757-200F"},
    //   {"id":105,"name":"N111AF","age":41, "type":"1981 Cessna 550"},
    // ];
  }
  // errorHandler(error: HttpErrorResponse) {
  //   return Observable.throw(error.message || "Server Error");
  // }
}
