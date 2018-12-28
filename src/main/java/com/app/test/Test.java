package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.model.Person;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx=null;
		
		try(Session ses=HibernateUtil.getSf().openSession()){
			tx=ses.beginTransaction();
			
			Employee e=new Employee();
			e.setEmpSal(12000.00);
			e.setPid(12);
			

			Person p=new Person();
			p.setPid(12);
			p.setPname("vinay");
			
			ses.save(e);
			ses.save(p);
			tx.commit();
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}
	}
}
