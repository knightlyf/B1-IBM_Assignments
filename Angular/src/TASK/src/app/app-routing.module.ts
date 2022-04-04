import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AircraftDetailComponent } from './aircraft-detail/aircraft-detail.component';
import { AircraftListComponent } from './aircraft-list/aircraft-list.component';
import { AirportComponent } from './airport/airport.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  // { path: '', component: DepartmentListComponent },
  {  path: '', redirectTo: '/airport', pathMatch: 'full'},
  {  path: 'airport', component: AirportComponent},
  {  path: 'aircrafts/:reg', component: AircraftDetailComponent},
  {  path: 'aircrafts', component: AircraftListComponent },
  {  path:'**', component:PageNotFoundComponent}];
  

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
