import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Product } from '../model/models';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }


  addProduct(product:Product){
    return this.http.post('http://localhost:8089/products',product,{
      headers:new HttpHeaders({
        Authorization:'Basic '+window.btoa('eli:12')
      })
    });
  }


}
