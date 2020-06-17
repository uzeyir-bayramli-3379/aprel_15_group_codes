import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';
import { Product } from 'src/app/model/models';
import { MatDialog } from '@angular/material';
import { AddProductComponent } from '../add-product/add-product.component';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
products:Product[]=[];
  constructor(private adminService:AdminService,private matD:MatDialog) { }

  ngOnInit() {
   this.load();
  }
  onAddProduct(){
 let dialog=this.matD.open(AddProductComponent);
 dialog.afterClosed().subscribe(
   resp=>{
this.load();
   }
 );
  }

 load(){
  this.adminService.findAllProducts().subscribe(
    response=>{
    this.products=response;
    }
  );
 }
}
