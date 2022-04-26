import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginClass } from './login-class';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

 // declare the model object here for Initilized the Default value 
 getData: LoginClass[] = [];
 UserArray: Array<LoginClass> = new Array();
 model = new LoginClass('','');
 constructor(private _httpService : LoginService,public  router: Router) { }

 onSelect() {
  this.router.navigate(['/prof']);
}

 ngOnInit(): void {
 }

  getLoginDetails(){
      this._httpService.getLoginDetails().subscribe(data => {
        this.getData = data;
        
      })
      var count =0;
      for (let i = 0; i < this.getData.length; i++) {
       if (this.getData[i].email == this.model.email && this.getData[i].password == this.model.password) {
         console.log(JSON.stringify(this.model.email+" "+this.model.password));
         alert("Login Successful");
         this.onSelect();
         count =1;
         break;
       }
     
    }
    if(count!=1){
      alert("Login Failed");
    }
    

}

 getDataFromServer(){
   this.UserArray.push(new LoginClass(this.model.email,this.model.password));
   console.log(JSON.stringify((this.UserArray)));
   this.getLoginDetails();
 }

     // getRegisteredStudent(){

     //   this._httpService.getRegisteredStudent().subscribe((res : any[])=>{
     //            console.log(res);
     //            this.getData = res;
     
     // });
     // }

}
