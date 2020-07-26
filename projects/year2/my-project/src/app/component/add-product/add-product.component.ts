import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/model/models';
import { ProductService } from 'src/app/service/product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
product:Product=new Product();
  constructor(private ps:ProductService) { }

  ngOnInit() {
let id:number=this.ps.selectedProductId;
if(id==0){

}else{
  this.ps.findById(id).subscribe(
    resp=>{
      this.product=resp;
    }
  );
}
  }
  onAddProduct(){
    if(this.product.id>0){
      this.ps.updateProduct(this.product).subscribe();
    }else{
      this.ps.addProduct(this.product).subscribe();
    }

  }
}
