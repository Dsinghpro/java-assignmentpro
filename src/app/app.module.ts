import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { SquarePipe } from './square.pipe';
import { ReverseStringPipe } from './reversestring.pipe';
import { AppChildComponent } from './app-child.component';
import { EmployeeModule } from './employee/employee.module';


@NgModule({
  declarations: [
    AppComponent,SquarePipe,ReverseStringPipe,AppChildComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	  FormsModule,
	  EmployeeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
