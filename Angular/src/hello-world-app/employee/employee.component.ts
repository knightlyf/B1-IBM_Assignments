import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor(private _employeeService : EmployeeService) { }

  ngOnInit(): void {
    this.aircrafts = this._employeeService.getAircrafts().subscribe(data => this.aircrafts = data);
  }
public aircrafts : any;
}
