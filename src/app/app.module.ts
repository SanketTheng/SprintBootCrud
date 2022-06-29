import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthComponent } from './auth/auth.component';
import { ShowDataComponent } from './show-data/show-data.component';
import { HttpClientModule } from '@angular/common/http';
import { UserRegisterService } from './user-register.service'
import { FormsModule } from '@angular/forms';
import { AddDataComponent } from './add-data/add-data.component';


@NgModule({
  declarations: [
    AppComponent,
    AuthComponent,
    ShowDataComponent,
    AddDataComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserRegisterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
