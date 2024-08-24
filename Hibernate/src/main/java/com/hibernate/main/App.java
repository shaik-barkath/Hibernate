package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Bike;
import com.hibernate.entities.Student;

public class App {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Barkath",85);
		Student s2 = new Student(2,"Shadab",65);
		Student s3 = new Student(3,"Yashwanth",95);
		
		Bike b1 = new Bike(111,"KTM",85265);
		Bike b2 = new Bike(222,"Royal Enfield",85265);
		Bike b3 = new Bike(333,"Hayabusa",95265);
		
		Configuration conf = new Configuration().configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn =session.beginTransaction();
		
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(b1);
		session.save(b2);
		session.save(b3);
		txn.commit();
		System.out.println("All object persisted Successfully ");
		
	}

}
