
import { Employee } from './employee';
import {empData} from './employee-data'
export class EmployeeService{
    public getAllEmployees() :Employee []{
        return empData;
    }
}