import {Component} from '@angular/core';
import { Employee } from './employee';
import { empData } from './employee-data';
import { EmployeeService } from './employee.service';

@Component({
    selector:'emp-list',
    templateUrl:'./employee-list.component.html'
})
export class EmployeeListComponent{
   
    public constructor(private employeeService:EmployeeService){
        this.empList  =  this.employeeService.getAllEmployees();

    }
    	
    empList:Employee[] = empData;
    public deleteEmployeeRow(index:number){
        this.empList.splice(index,1);
    }
}