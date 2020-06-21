import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Product } from '../model/models';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
selectedProductId:number=0;
  constructor(private http:HttpClient) { }


  addProduct(product:Product){
    return this.http.post('http://localhost:8089/products',product,{
      headers:new HttpHeaders({
        Authorization:'Basic '+window.btoa('eli:12')
      })
    });
  }


  findById(id:number){
    return this.http.get<Product>(`http://localhost:8089/products/${id}`,{
      headers:new HttpHeaders({
        Authorization:'Basic '+window.btoa('eli:12')
      })
    });
  }


  updateProduct(product:Product){
    return this.http.put('http://localhost:8089/products',product,{
      headers:new HttpHeaders({
        Authorization:'Basic '+window.btoa('eli:12')
      })
    });
  }



}
