import { Component,Input, Output,EventEmitter, OnInit, OnDestroy } from "@angular/core";
import { Employee } from "./employee";
@Component({
    selector:'emp-component',
    template:`<table border="1" width="50%"><tr>
                <th>Employee Id</th>
                <td>{{eobj.empid}}</td>
                </tr>
                <tr>
                <th>Employee Name</th>
                <td>{{eobj.ename}}</td>
                </tr>
                <tr>
                <th>Employee Salary</th>
                <td>{{eobj.salary}}</td>
                </tr>
                <tr>
                <th>Employee DepartmentNo</th>
                <td>{{eobj.deptno}}</td>
                </tr>
                <tr>
                <th>Action</th>
                <td><input type="button" value="Delete" (click)="delete(eobj.empid)"></td>
                </tr>
                </table>`
})
export class EmployeeComponent implements OnInit,OnDestroy{
    
    @Input()
    eobj:any;
    @Output()
    deleteEvent:EventEmitter<number>=new EventEmitter<number>();
    delete(empid:number)
    {
        this.deleteEvent.emit(empid);

    }
    ngOnInit(): void {
        console.log('Employee component is Initialized');
    }
    ngOnDestroy(){
        console.log('Employee Component is Removed');
    }
}