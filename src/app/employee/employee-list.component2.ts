import { AfterViewInit, Component, OnChanges, OnInit, SimpleChanges } from "@angular/core";
import { Employee } from "./employee";
import { EmployeeService } from "./employee.service";
@Component({
    selector: 'emp-list2',
    templateUrl:'./employee-list.component2.html',

})
export class EmployeeListComponent2 implements OnChanges,OnInit,AfterViewInit{
    empList:Employee[]=[];
    constructor(private employeeService:EmployeeService){
        this.empList =employeeService.getAllEmployees();
    }
    deleteEmployee(empid:number){
        for(var i=0;i<this.empList.length;i++){
            if(this.empList[i].empid==empid){
                this.empList.splice(i,1);
                return;
            }
        }
    }

    addEmployee(emp:Employee):void{
        this.empList.push(emp);
    }
    ngOnChanges(changes: SimpleChanges): void {
        console.log('EmployeeListComponent2 is changed');
    }
    ngOnInit(): void {
        console.log('EmployeeListComponent2 is Initialized');
    }
    ngAfterViewInit(){
        console.log('View is Intialized');
    }
}