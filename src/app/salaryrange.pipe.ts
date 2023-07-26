import { Pipe,PipeTransform } from "@angular/core";
import { Employee } from "./employee/employee";
@Pipe({name:'salaryrange'})
export class SalaryRange implements PipeTransform{
   
   transform(_value:Employee[]) {
   /* var ptr=0;
    var elist:Employee[]=[];
        for(var i=0;i<_value.length;i++)
            if(_value[i].salary>=3000 && _value[i].salary<=5000>)
                elist[ptr]=_value[i];
                return elist;*/
          return _value;
            
   }
}

