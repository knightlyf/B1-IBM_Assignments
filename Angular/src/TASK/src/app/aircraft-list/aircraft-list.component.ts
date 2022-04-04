import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-aircraft-list',
  templateUrl: './aircraft-list.component.html',
  styleUrls: ['./aircraft-list.component.css']
})
export class AircraftListComponent implements OnInit {
  aircrafts = [
    {"reg":'VT-AXX', 'type':'Boeing 737-8HG', 'Operator':'Air India Express','sno':'10424056'},
    {"reg":'VT-SQE', 'type':'Bombardier Dash-8 Q400', 'Operator':'SpiceJet','sno':'10110287'},
    {"reg":'ET-APX', 'type':'Boeing 777-36N(ER)', 'Operator':'Ethiopian Airlines','sno':'10516461'},
    {"reg":'VT-IVQ', 'type':'Airbus A320-271 Neo', 'Operator':'IndiGO','sno':'9145352'},
    {"reg":'VT-CSP', 'type':'Cessna 560XL Citation Excel', 'Operator':'Private Owner','sno':'8681341'}
  ];

  constructor(private route: Router) { }

  ngOnInit(): void {
  }
  onSelect(aircraft:any){
    this.route.navigate(['/aircrafts', aircraft.reg]);
  }

}
