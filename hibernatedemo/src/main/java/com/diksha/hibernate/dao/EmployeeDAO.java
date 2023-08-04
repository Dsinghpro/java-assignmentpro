package com.diksha.hibernate.dao;

import org.hibernate.SessionFactory;
import com.diksha.hibernate.entity.Employee;
import org.hibernate.*;

public class EmployeeDAO {
	SessionFactory factory=null;
	public EmployeeDAO(SessionFactory factory) {
		this.factory=factory;
	}
	public void insertEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction trans =session.beginTransaction();
		try {
			session.save(employee);
			trans.commit();
			
		}
		catch(Exception ex) {
			trans.rollback();
			ex.printStackTrace();
		}
	}
	public void deleteEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction trans =session.beginTransaction();
		try {
			session.delete(employee);
			trans.commit();
			
		}
		catch(Exception ex) {
			trans.rollback();
			ex.printStackTrace();
		}
	}
	public void modifyEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction trans =session.beginTransaction();
		try {
			session.update(employee);
			trans.commit();
			
		}
		catch(Exception ex) {
			trans.rollback();
			ex.printStackTrace();
		}
	}
	public Employee getEmployee(int employeeId) {
		Session session =factory.openSession();
		return session.get(Employee.class, employeeId);
	}

}
