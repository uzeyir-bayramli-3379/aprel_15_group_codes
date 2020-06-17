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
  constructor(private productService:ProductService) { }

  ngOnInit() {
  }
  onAddProduct(){
this.productService.addProduct(this.product).subscribe();
  }
}
