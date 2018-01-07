package com.hibernate.main;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class CreateStudent {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		// create Session
		Session session = factory.getCurrentSession();

		try {
			// uses session object to save Java object
			// create Student object
			System.out.println("Creating Student Object");
			
			String theDateOfBirthStr = "24/02/1995";
			Date theDateOfBirth = DateUtils.parseDate(theDateOfBirthStr);
			
			Student student = new Student("Meghana", "Ch", "meghana@gmail.com",theDateOfBirth);

			// Begin Transaction
			session.beginTransaction();

			// Save Student obj
			System.out.println("Saving Student Object");
			session.save(student);

			// Commit Transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
