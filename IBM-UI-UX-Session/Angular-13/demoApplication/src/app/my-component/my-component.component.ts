import { Component, OnInit } from '@angular/core';
import { Customer } from './customer';
import { MyserviceService } from './myservice.service';
@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent implements OnInit {
  custArray:Array<Customer>=new Array();

  // declare the model object here for Initilized the Default value 
  getData: any[] = [];
  model=new Customer('', 0);

  constructor(private _httpService : MyserviceService) { }

  ngOnInit(): void {
  }
  // CreateCustomer here 

  createCustomer(){

      
    console.log('Customer Creation here--->');
    // later on develop the logic here

     this.custArray.push(new Customer(this.model.name,this.model.age));
     console.log(JSON.stringify(this.custArray));

 }

  deleteCustomer(cust: Customer){
      
      console.log('Customer Deletion here--->');
      this.custArray.splice(this.custArray.indexOf(cust),1);
      console.log(JSON.stringify(this.custArray));
  
    }
  
  updateCustomer(cust: Customer){
        
        console.log('Customer Update here--->');
    
        this.custArray.splice(this.custArray.indexOf(cust),1);
        console.log(JSON.stringify(this.custArray));
        this.custArray.push(new Customer(this.model.name,this.model.age));
        console.log(JSON.stringify(this.custArray));
    
      }

      getRegisteredStudent(){

        this._httpService.getRegisteredStudent().subscribe((res : any[])=>{
                 console.log(res);
                 this.getData = res;
      
      });
      }
}
