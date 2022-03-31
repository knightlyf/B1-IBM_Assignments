import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  // template:
  // `<h2 class="text-success">
  // <input type="text" bind-value=name  bind-disabled = "isDisabled"/>
  // <input type="text" value='hello'  [disabled] = "isDisabled"/>
  // <input type="text" value='bye' />
  // </h2>
  // <p class="text-bold" [class]="flag1"> Hi {{name}} </p>
  // <p class="text-special" [class]="successClass">CSS DEMO on Angular</p>
  // <p [class.text-danger] = "hasError"> warning {{name | lowercase}} </p>
  // <h2 [ngClass] = "messageClasses">ngclass demo</h2>
  
  // <h2 [style.color] = "'orange'">style binding demo</h2>
  // <h2 [style.color] = "hasError ? 'red' : 'green'">style binding demo 1</h2>
  // <h2 [style.color] = "highlightColor">style binding demo 2</h2>
  // <h2 [ngStyle]="totalStyles">XXXXXXXXXXX</h2>
  // <button (click)="onClick()">Click me</button>{{message}}
  // <button (click)="onClick2($event)">GREET</button>{{greetings}}
  // `,
  
//   styles:[`
//   .text-success{color:green}
//   .text-danger{color:red}
//   .text-special{font-style:italic}
//   .text-bold{font-weight:bold}
//   `]
//   // styleUrls: ['./app.component.css']
// })
})
export class AppComponent {

  public isDisabled = false;
  title = 'hello-world-app';
  highlightColor = 'yellow';

  name = 'User 1';
  flag1 = true;
  hasError = true;
  isItalic = true;
  successClass = 'text-success';
  public message="";
  greetings="MORNING";
  msgs="";
  greetUser(){
    return this.title+' coders';
  }
  messageClasses = {
    "text-success": !this.hasError,
    "text-danger": this.hasError,
    "text-special": this.isItalic
  }

  totalStyles = {
    color: 'magenta',
    fontStyle: 'italic',
    fontWeight: 'bold'
  }

  onClick(){
    console.log('button clicked');
    this.message = 'not today';
    // console.log(event);
  }

  onClick2(event: { type: any; }){
    console.log(event.type);
    this.greetings = 'EVENT 1 has been executed !!';
  }
  
  logMessage(value : any){
    console.log(value);
  }

  public laptopName = "ROG GL503VD";
}
