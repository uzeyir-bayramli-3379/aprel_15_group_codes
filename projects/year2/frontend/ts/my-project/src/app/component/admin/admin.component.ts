import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';
import { Product } from 'src/app/model/models';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
products:Product[]=[];
  constructor(private adminService:AdminService) { }

  ngOnInit() {
    this.adminService.findAllProducts().subscribe(
      response=>{
      this.products=response;
      }
    );
  }

}
