import com.diksha.model.Address;
import com.diksha.model.Company;
import com.diksha.model.Department;
import com.diksha.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e= new Employee(7001,"Diksha",7560,new Address("1-2-3","MG Street","Banglore","Karnataka"));
//		System.out.println("Employee id:-"+e.getEmpId());
//		System.out.println("Employee Name:-"+e.getEmpName());
//		System.out.println("Salary    :-"+e.getSalary());
//		System.out.println("Hno   :-"+e.getAddress().getHno());
//		System.out.println("Street  :-"+e.getAddress().getStreet());
//		System.out.println("City    :-"+e.getAddress().getCity());
//		System.out.println("State   :-"+e.getAddress().getState());
		Employee[] elist1=new Employee[3];
		elist1[0]=new Employee(102,"Babu",2000,new Address("7-8-6","MG Street","Banglore","karnataka"));
		elist1[1]=new Employee(103,"Charan",3000,new Address("1-2-3","Anna Street","chennai","Tamilnadu"));
		elist1[2]=new Employee(101,"Ajay",1000,new Address("3-2-1","Bank Street","Hyderabad","Telgana"));
		Employee[] elist2=new Employee[3];
		elist2[0]=new Employee(102,"diksha",4000,new Address("0-8-6","MG Street","Banglore","karnataka"));
		elist2[1]=new Employee(103,"harsh",5000,new Address("5-2-3","Anna Street","chennai","Tamilnadu"));
		elist2[2]=new Employee(101,"jay",6000,new Address("8-2-1","Bank Street","Hyderabad","Telgana"));
		Employee[] elist3=new Employee[3];
		elist3[0]=new Employee(102,"meghna",4000,new Address("9-8-6","MG Street","Banglore","karnataka"));
		elist3[1]=new Employee(103,"sakshi",5000,new Address("8-2-3","Anna Street","chennai","Tamilnadu"));
		elist3[2]=new Employee(101,"joy",6000,new Address("7-2-1","Bank Street","Hyderabad","Telgana"));
		
		Department[] d=new Department[3];
		d[0]=new Department(207,"Sales","Hyderabad",elist1);
		d[1]=new Department(404,"Engineering","Vadodara",elist2);
		d[2]=new Department(505,"HR","Delhi",elist3);
		Company c=new Company("Prolifics","Hyderabad",d);
		System.out.println("--------Company Details--------");
		System.out.println("Company Name :"+c.getName());
		System.out.println("Company Location :"+c.getLocation());
		for(Department dp:d) {
		System.out.println("--------Department Details--------");
		System.out.println("Department no :"+dp.getDeptNo());
		System.out.println("Department Name :"+dp.getName());
		System.out.println("Department Location :"+dp.getLocation());
		
		for(Employee e:dp.getEmployees()) {
			System.out.println("empId: "+e.getEmpId());
			System.out.println("Emp Name"+e.getEmpName());
			System.out.println("Salary  :"+e.getSalary());
			
			System.out.println("----------Address-------");
			System.out.println("Hno:"+e.getAddress().getHno());
			System.out.println("Street:"+e.getAddress().getStreet());
			System.out.println("City:"+e.getAddress().getCity());
			System.out.println("State:"+e.getAddress().getState());
			System.out.println();
			
		}
		}
		
		
	}

}
