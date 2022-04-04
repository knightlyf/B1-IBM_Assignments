import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { AirportComponent } from './airport/airport.component';
import { AircraftDetailComponent } from './aircraft-detail/aircraft-detail.component';
import { AircraftListComponent } from './aircraft-list/aircraft-list.component';

@NgModule({
  declarations: [
    AppComponent,
    AirportComponent,
    AircraftDetailComponent,
    AircraftListComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
