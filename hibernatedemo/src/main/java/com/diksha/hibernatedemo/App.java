package com.diksha.hibernatedemo;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.diksha.hibernate.dao.EmployeeDAO;
import com.diksha.hibernate.entity.Address;
import com.diksha.hibernate.entity.Employee;
import com.diksha.hibernate.entity.Person;
import com.diksha.hibernate.util.HibernateUtil;
import org.hibernate.*;



public class App 
{
    public static void main( String[] args )
    {
      SessionFactory factory=HibernateUtil.buildSessionFactory();
      if(factory.isClosed()) System.out.println("Closed"); else System.out.println("Open");
      Session session = factory.openSession();
    //for inserting
//      Employee e1=new Employee(102,"Riya",2800,20);
//      Employee e2=new Employee(103,"Divya",3500,30);
//      Transaction trans=session.beginTransaction();
//      session.save(e1);
//      session.save(e2);
     // trans.commit();
//      Employee e=session.get(Employee.class,102);
//      if(e!=null)
//    	  System.out.println(e.getEname()+"  "+e.getSalary()+"  "+e.getDeptno());
//      else
//    	  System.out.println("Employee with id 102 does not exist");
//      session.close(); 
     // HibernateUtil.shutdown();
      
      
     //Checking update
//      Transaction trans=session.beginTransaction();
//      Employee e=session.get(Employee.class,102);
//      if(e!=null)
//    	  e.setEname("Riya Dubey");
//      System.out.println("is session Dirty " + session.isDirty());
//      trans.commit();
//      System.out.println("is session Dirty "+ session.isDirty());
//      session.close(); 
      
      //Another way of updating
//      Transaction trans=session.beginTransaction();
//      Employee e=new Employee(102,"New Riya",2200,20);
//      session.update(e);
//      trans.commit();//trans.commit internally call session.flush
//      session.close(); 
      
      //saveOrUpdate()
//      Transaction trans=session.beginTransaction();
//      Employee e=new Employee(102,"Riya Dubey",2200,20);
//      session.saveOrUpdate(e);
//      trans.commit();//trans.commit internally call session.flush
//      session.close(); 
      
      //Delete
      //Transaction trans=session.beginTransaction();
      //Employee e=new Employee(102,"Riya Dubey",2200,20);
      //delete when record is not existing
//      Employee e= session.get(Employee.class,102);
//      if(e!=null)
//    	 session.delete(e);
//      else
//    	  System.out.println("Employee with id 102 does not exist");
//      e.setEmpid(102);
//      session.delete(e);
//      trans.commit();//trans.commit internally call session.flush
//      session.close(); 
      
      //session example
//      Employee e1=session.get(Employee.class, 101);
//      Employee e2=session.get(Employee.class, 102);
//      session.close(); 
      
//      EmployeeDAO edao=new EmployeeDAO(factory);
//      edao.insertEmployee(new Employee(102,"Charan",2000,20));
//      Employee e= edao.getEmployee(101);
//      if(e!=null)
//    	  System.out.println(e.getEname()+"  "+e.getSalary()+"  "+e.getDeptno());
//      edao.modifyEmployee(new Employee(103,"Divya kumari",3500,30));
//      edao.deleteEmployee(new Employee(101,"",0,0));
//      
      
      
      //OnetoOne
      //Person p=session.get(Person.class, 787);
      /*
      if(p!=null) {
    	  System.out.println(p.getSsn()+"  "+p.getPname()+"  "+p.getPersonAge()+" "+p.getGender());
    	 System.out.println(p.getAddress());
      }
      */
      Address a=session.get(Address.class,7003 );
      if(a!=null) {
    	  System.out.println(a.getPerson());
    	 /*
    	  System.out.println(a.getHouseNo()+" "+a.getStateName());
    	  System.out.println(a.getCityName()+" "+a.getStateName());
    	  System.out.println(a.getPerson().getGender()+" "+a.getPerson().getPersonAge()+" "+p.);
      	*/
      }
      session.close();
    	 
    }
}
