import { Component, OnInit } from '@angular/core';
import { ProfessorServiceService } from './professor-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-professor',
  templateUrl: './professor.component.html',
  styleUrls: ['./professor.component.css']
})
export class ProfessorComponent implements OnInit {
  items: any[] = [];
  constructor(private _httpservice : ProfessorServiceService,public  router: Router) { }

  
  ngOnInit(): void {
  }
  getRegisteredStudent(){
    this._httpservice.getRegisteredStudent().subscribe((res : any[])=>{
             console.log(res);
             this.items = res;
             
    });
  }

  onSelect() {
    this.router.navigate(['/prof/grade']);
  }
  onSelect1(){
    this.router.navigate(['/prof/viewStudents']);
  }
  

}
