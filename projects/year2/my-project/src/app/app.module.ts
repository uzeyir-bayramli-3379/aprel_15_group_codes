import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { SalesPersonListComponent } from './sales-person-list/sales-person-list.component';
import { MenuComponent } from './component/menu/menu.component';
import { AdminComponent } from './component/admin/admin.component';
import {HttpClientModule} from '@angular/common/http';
import { LoginComponent } from './component/login/login.component';
import { LogoutComponent } from './component/logout/logout.component';
import { CustomerComponent } from './component/customer/customer.component';
import { OrdersComponent } from './component/orders/orders.component';
import { AddProductComponent } from './component/add-product/add-product.component';
import { SignupComponent } from './component/signup/signup.component';
import { ShowImageComponent } from './component/show-image/show-image.component';
import { BasketComponent } from './component/basket/basket.component';
import { ConfirmOrderComponent } from './component/confirm-order/confirm-order.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatInputModule, MatDialogModule, 
  MatProgressSpinnerModule, MatButtonModule } from '@angular/material';
@NgModule({
  declarations: [
    AppComponent,
    SalesPersonListComponent,
    MenuComponent,
    AdminComponent,
    LoginComponent,
    LogoutComponent,
    CustomerComponent,
    OrdersComponent,
    AddProductComponent,
    SignupComponent,
    ShowImageComponent,
    BasketComponent,
    ConfirmOrderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,HttpClientModule, BrowserAnimationsModule,
    MatInputModule, MatDialogModule, 
  MatProgressSpinnerModule, MatButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents:[AddProductComponent]
})
export class AppModule { }
