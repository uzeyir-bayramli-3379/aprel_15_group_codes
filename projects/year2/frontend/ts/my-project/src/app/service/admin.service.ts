import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../model/models';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }


  findAllProducts(){
    return this.http.get<Product[]>('http://localhost:8089/products');
  }
}
