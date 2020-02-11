package com.klu;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
public class EmployeeTest {
public static void main(String[] args) {
Employee e=new Employee();
  e.setId(12);
  e.setName("thilak");
  e.setDept("cse");
//To update the record..In hibernate.cfg.xml we should specify Update command for hbm2ddl property.
//Object o=s.load(Employee.class,new Integer(12));
//Employee e=(Employee)o;
//    e.setName("harika");

//To delete an object that means deleting a record from table.
//Object o=s.load(Employee.class, 12);
//Employee e=(Employee)o;
//s.delete(e);
//e.setId(12);
//To retrive values from Table in the for of object.In hibernate.cfg.xml we should specify Update command for hbm2ddl property.

//Object o=s.get(Employee.class, 12);
//Employee e=(Employee)o;
//System.out.println(e);
//s.update(e);
//s.delete(e);
 
 Configuration cfg=new Configuration();
 cfg.configure();
 SessionFactory sf=cfg.buildSessionFactory();
 Session s=sf.openSession();
 s.save(e);
 s.beginTransaction().commit();
}
}
