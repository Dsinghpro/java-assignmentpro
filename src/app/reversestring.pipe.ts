import { Pipe,PipeTransform } from "@angular/core";
@Pipe({name:'reverse'})
export class ReverseStringPipe implements PipeTransform{
   transform(str:string) : string {
       var strcp:string="";
       for(var i=str.length-1;i>=0;i--)
            strcp=strcp+str.charAt(i);
        return strcp;
   }
}