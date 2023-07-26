import { Component } from '@angular/core';
import { Employee } from './employee/employee';
//import {empData} from './employee-data';
//import {Employee} from './employee';
//Employee binding
//Interpolation binding
/*@Component({
  selector: 'app-component',
  templateUrl: 'app.component.html',
  styles: []
})
export class AppComponent {
 empid:number=7001;
 ename:string="Ajay Saxena";
 salary:number=5000;
 deptno:number=10;
}*/
//One way binding
/*@Component({
  selector: 'app-component',
  template: '<input type="text" [value]="myname"/>',
  styles: []
})
export class AppComponent {
 myname:string='Silvester Standlone';
}*/
//event binding
/*@Component({
  selector: 'app-component',
  template: `<input type="text" #txt1/>
			<button type="button"  (click)="assignValue(txt1.value)">Click</button><br/>
			Good Evening Miss.  {{myname}}`,
			
  styles: []
})
export class AppComponent {
 myname:string='';
 public assignValue(val:string) :void
 {
	this.myname=val;
	}
}*/

/*@Component({
  selector: 'app-component',
  template: `<input type="text" [value]=num/><br/>
			<input type="button" value="++" (click)="increment()"/>
			<input type="button" value="--" (click)="decrement()"/>`,
			
  styles: []
})
export class AppComponent {
	num:number=1;
	public increment() :void{
		this.num++;
		}
	public decrement() :void{
		this.num--;
		}
	}*/
	
//two way binding	
/*@Component({
  selector: 'app-component',
  templateUrl: 'app.component.html',
			
  styles: []
})
export class AppComponent {
	Firstnum:number=0;
	Secondnum:number=0;
	result:number=0;
	public add() :void{
		this.result=(this.Firstnum) + (this.Secondnum);
		}
	public sub() :void{
		this.result=this.Firstnum - this.Secondnum;
		}
	}*/

	/*@Component({
		selector: 'app-component',
		template: `
				<div *ngIf="flag;then trueBlock ; else falseBlock"></div>
				<ng-template #trueBlock>
		<h1 >Hello Universe</h1>
	</ng-template>
		<ng-template #falseBlock>
			<h1> Hello World</h1>
		</ng-template>`,
				  
		styles: []
	  })
	  export class AppComponent {
		 flag:boolean=false;
		}*/

	/*	@Component({
			selector: 'app-component',
			template: `
					<div [ngSwitch]="mycolor">
						<div *ngSwitchCase="'blue'">Blue Color</div>
						<div *ngSwitchCase="'green'">Green Color</div>
						<div *ngSwitchDefault>Red Color</div>
		</div>`,
					  
			styles: []
		  })
		  export class AppComponent {
			 mycolor:string ='blue';
			}*/

/*@Component({
	selector: 'app-component',
		template: `<h1 [style.color]="mycolor" [style.fontFamily]="myFont" [style.fontSize]="myFontSize">Angular Welcome you</h1>`,
						  
		styles: []
		})
		export class AppComponent {
			mycolor:string ='blue';
			myFont:string='arial';
			myFontSize:string='50px';
		}
			 */
		/*@Component({
			selector: 'app-component',
				template: `<h1 [ngStyle]="myStyles">Angular Welcome you.....</h1>`,
								  
				styles: []
				})
				export class AppComponent {
					myStyles={
						color:'blue',
						fontFamily:'arial',
						FontSize:'50px',

					}
				
				} */
/*@Component({
	selector: 'app-component',
		templateUrl: './app.component.html',
										  
		styles: []
		})
		export class AppComponent {
			empList=[
					{"empid":101,"ename":"Android","salary":1000,"deptno":10},
					{"empid":102,"ename":"stalone","salary":2000,"deptno":20},
					{"empid":103,"ename":"Kyler","salary":3000,"deptno":30},
					{"empid":104,"ename":"Ajohnson","salary":4000,"deptno":40},
		
		
			];
						
		} */
		// @Component({
		// 	selector: 'app-component',
		// 		templateUrl: './app.component.html',
												  
		// 		styles: []
		// 		})
		// 		export class AppComponent {
					
		// 			empList:Employee[]=empData;
		// 			public deleteEmployeeRow(index:number){
		// 				this.empList.splice(index,1);
		// 			}
						
								
		// 		} 
		// @Component({
		// 	selector: 'app-component',
		// 		templateUrl: './app.component.html',
												  
		// 		styles: []
		// 		})
		// 		export class AppComponent {
				
		// 			}
//Pipe
/*@Component({
	 	selector: 'app-component',
	 		template: `{{myname | uppercase}}<br/>
			{{myname | lowercase}}<br/>
			{{myname |titlecase}}`,
											  
	 		styles: []
	 		})
			export class AppComponent {
				myname:string="Diksha Singh";
	 			}*/
/*@Component({
	selector: 'app-component',
	template: `{{emp|json}}`,
														 
		styles: []
		})
		export class AppComponent {
		emp:Employee=new Employee(7001,"Ajay",25000,8);
	}*/

/*@Component({
		selector: 'app-component',
		template: `{{salary|currency:"INR":'symbol':'6.2-4'}}`,
			//INR will convert it into Indian Rupees,by default US dollar												 
			styles: []
			})
			export class AppComponent {
			salary:number=15000.00;
		}*/
//Decimalpipe
/*@Component({
	selector: 'app-component',
	template: `{{salary|number:'6.2-4'}}`,
													 
		styles: []
		})
		export class AppComponent {
		salary:number=15000.123456;
	}*/
//Datepipe,percentpipe
/*@Component({
	selector: 'app-component',
	// template: `{{doj | date:'long'}}<br/>
	// 			{{doj | date:'short'}}<br/>
	// 			{{doj | date:'medium'}}<br/>
	// 			{{doj | date:'dd/MMM/yyyy  hh:mm:ss'}}<br/>`,
	template: `{{myshare | percent:'3.4-5'}}<br/>`,
														 
		styles: []
		})
		export class AppComponent {
		//doj=new Date();
		myshare:number =0.251111;
	}*/
	//Slicepipe
	/*@Component({
		selector: 'app-component',
		template: `{{myname | slice :2:12}}`,
				 
			styles: []
			})
			export class AppComponent {
			myname:string="Harry Potter";
		}*/
//Arraypipe
/*@Component({
	selector: 'app-component',
	template: `{{myArr |slice :2:5}}`,
														 
		styles: []
		})
		export class AppComponent {
		myArr:number[]=[10,20,30,40,50];
	}*/
//userdefine pipe
	/*@Component({
		selector: 'app-component',
		template: `{{15 | square}}<br/>
					{{12 | square}}<br/>
					{{myName | reverse}}`,
															 
			styles: []
			})
			export class AppComponent {
			myName:string ="Harry Potter";
		}*/

// @Component({
// 	selector: 'app-component',
// 	template: `<app-child-component pmessage="Hello Child" (childEvent)="receiveMessage($event)">
// 	</app-child-component><br/>
// 	<h1>Message from child is {{childMessage}} </h1>`,
														 
// 		styles: []
// 		})
// 		export class AppComponent {
// 			childMessage:string='';
// 		receiveMessage(message:string){
// 			this.childMessage=message;
// 		}
// 	}
@Component({
	selector: 'app-component',
	template:'<emp-list2></emp-list2>',
														 
		styles: []
		})
		export class AppComponent {
			childMessage:string='';
		receiveMessage(message:string){
			this.childMessage=message;
		}
	}
					
						
					
						
								
				
				  
		  
	  
	  
		  
	  
	  
	  
	  



