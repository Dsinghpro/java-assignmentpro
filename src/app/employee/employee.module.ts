
import {NgModule} from '@angular/core';
import { EmployeeListComponent } from './employee-list.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { EmployeeService } from './employee.service';
import { SalaryRange } from '../salaryrange.pipe';
import { EmployeeListComponent2 } from './employee-list.component2';
import { EmployeeComponent } from './employee.component';
import { EmployeeCurdComponent } from './employe-curd.component';
@NgModule({
    declarations:[EmployeeListComponent,SalaryRange,EmployeeListComponent2,EmployeeComponent,EmployeeCurdComponent],
    imports:[FormsModule ,CommonModule],
    exports:[EmployeeListComponent,EmployeeListComponent2],//So other module can use
    providers:[EmployeeService]
})
export class EmployeeModule{
    
}