import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

import polydemo.Circle;
import polydemo.Rectangle;
import polydemo.Shape;
import polydemo.ShapeFactory;

import java.time.LocalDateTime;
class Test {
	public static void main(String[] args) {
//		LocalDate Id=LocalDate.now();
//		System.out.println(Id.getDayOfMonth()+"/"+Id.getMonthValue()+"/"+Id.getYear());
//		LocalDate dob=LocalDate.of(1999,11,14);
//		System.out.println(dob.getDayOfMonth()+"/"+dob.getMonthValue()+"/"+dob.getYear());
//		LocalTime td=LocalTime.now();
//		System.out.println(td.getHour()+":"+td.getMinute()+":"+td.getSecond());
//		LocalTime tob=LocalTime.of(18,30,45);
//		System.out.println(tob.getHour()+":"+tob.getMinute()+":"+tob.getSecond());
////		LocalDateTime ldt=LocalDateTime.now();
//		LocalDateTime ldt=LocalDateTime.of(2000,10,2,18,30,45);
//		
//		System.out.println(ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond());
//		System.out.println(ldt.getDayOfMonth()+"/"+ldt.getMonthValue()+"/"+ldt.getYear());
//		
//		Account a1=new Account(7001,15000.00,"Ajay Saxena",LocalDate.now());
//		Account a2=new Account(7001,15000.00,"Ajay Saxena",LocalDate.now());
		//Account class is a sub class of a object
//		System.out.println(a1.equals(a2));
		Loan l=LoanMela.approvalLoan();
		System.out.println(l.CalculateEMI());
		System.out.println(l.getClass());
	}
			
	
	
}
