import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: String = 'IBM-CRS-Demo';
  test : String = 'hello';
  today : Date = new Date();

  // write the event with properties here 
  clickMessage:string='Training status';

   onClickMe(){

    console.log('event is fired');

    this.clickMessage='Session is up';
   }
}
