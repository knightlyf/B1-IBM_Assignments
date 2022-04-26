import { Component, OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';
import { GradeserviceService } from './gradeservice.service';
import { Student } from './student';

@Component({
  selector: 'app-grade',
  templateUrl: './grade.component.html',
  styleUrls: ['./grade.component.css']
})
export class GradeComponent implements OnInit {
getData: Student[] = [];
studArray:Array<Student> = [];
model = new Student(0,0,'');
// model = new Student( );

  constructor(private _httpService : GradeserviceService) { }

  ngOnInit(): void {
  }

  // addGrade(){
  //   this._httpService.addGrade(this.model).subscribe((res : Student[])=>{
  //     console.log(res);
  //     this.getData = res;
  //   });
  // }
  gradeStudent(){
    this._httpService.gradeStudent(this.model).subscribe(data=>{
      this.getData = data;
      
    }
    );
    this.studArray.push(new Student(this.model.studentId,this.model.courseId,this.model.grade));
  }

}
