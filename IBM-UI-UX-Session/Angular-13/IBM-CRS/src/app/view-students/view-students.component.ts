import { Component, OnInit } from '@angular/core';
import { ViewserviceService } from './viewservice.service';

@Component({
  selector: 'app-view-students',
  templateUrl: './view-students.component.html',
  styleUrls: ['./view-students.component.css']
})
export class ViewStudentsComponent implements OnInit {

  items: any[] = [];
  constructor(private _httpservice : ViewserviceService) { }

  
  ngOnInit(): void {
    this._httpservice.getRegisteredStudent().subscribe((res : any[])=>{
              console.log(res);
              this.items = res;
              
     });
  }
  getRegisteredStudent(){
    this._httpservice.getRegisteredStudent().subscribe((res : any[])=>{
             console.log(res);
             this.items = res;
             
    });
  }
}
