import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ProfessorComponent } from './professor/professor.component';
import { ViewStudentsComponent } from './view-students/view-students.component';
import { GradeComponent } from './grade/grade.component';
import { LoginComponent } from './login/login.component';
const routes: Routes = [
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'prof',component: ProfessorComponent},
  {path: 'prof/viewStudents',component: ViewStudentsComponent},
  {path: 'prof/grade',component: GradeComponent},
  {path: '**', redirectTo: 'login'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
