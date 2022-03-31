import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {
  @Input()
  public parentData : any;
  displayName = true;
  displayColor = "red";
  public random_text = "Hello from the other side";
  public person ={
    "name":"John",
    "age":30,
    "city":"New York"
  };
  public date = new Date();

  @Output()
  public childEvent = new EventEmitter();
  private _employeeService: any;
  public aircrafts: any;
  constructor() { }
  ngOnInit(): void {
    this.aircrafts = this._employeeService.getAircrafts().subscribe((data: any) => this.aircrafts = data);
  }
  
  fireEvent(){
     this.childEvent.emit("Hello from the other side");
  }
  public cities =["Columbia","Mumbai","Chennai","Bangalore"];
}
