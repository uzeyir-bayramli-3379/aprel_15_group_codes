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

}


