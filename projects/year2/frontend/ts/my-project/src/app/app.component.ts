import { Component } from '@angular/core';
import { Product } from './model/models';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-project';
products:Product[]=[];
  name:string='Ferid';
  buttonPressed(age:number){
    alert('duymeye basildi, age='+age)
 
  }

  showProducts(){
let p1:Product=new Product();
p1.id=1;
p1.name="Alma";
p1.price=3.4;
p1.image='alma.jpg';

this.products.push(p1);
let p2:Product=new Product();
p2.id=2;
p2.name="Nar";
p2.price=9.4;
p2.image='nar.jpg';

this.products.push(p2);


  }
}


