import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-aircraft-detail',
  templateUrl: './aircraft-detail.component.html',
  styleUrls: ['./aircraft-detail.component.css']
})
export class AircraftDetailComponent implements OnInit {
  public aircraftId: any;
  public airplane : any;
  public serial: any;
  public url: any;
  public op: any;
  constructor(private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    let id = this.activatedRoute.snapshot.paramMap.get('reg');
    this.aircraftId = id;
    let sno = this.activatedRoute.snapshot.paramMap.get('sno');
    this.serial = sno;
    // this.url ='assets/'+sno;
    let ops = this.activatedRoute.snapshot.paramMap.get('Operator');
    this.op = ops;
    console.log(this.airplane);
    let model = this.activatedRoute.snapshot.paramMap.get('type');
    this.airplane = model;
    // console.log(typeof(sno));
  }

}
