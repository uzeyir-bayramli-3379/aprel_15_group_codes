import { Component } from '@angular/core';
import { Product } from './model/models';
 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-project';

  name:string='Ferid';   
  buttonPressed(age:number){
    alert('duymeye basildi, age='+age)
 
  }


showComponent:boolean=true;

  hideComponent(){
this.showComponent=false;
  }

  showComponentMethod(){
    this.showComponent=true;
      }
price:number=8465814.646456456;
}


