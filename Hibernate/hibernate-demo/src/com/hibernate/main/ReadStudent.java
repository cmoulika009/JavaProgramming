package com.hibernate.main;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class ReadStudent {

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
			
			String theDateOfBirthStr = "05/01/1964";
			Date theDateOfBirth = DateUtils.parseDate(theDateOfBirthStr);
			
			Student student = new Student("Jyothi", "N", "jyothi@gmail.com",theDateOfBirth);

			// Begin Transaction
			session.beginTransaction();

			// Save Student obj
			System.out.println("Saving Student Object");
			session.save(student);

			// Commit Transaction
			session.getTransaction().commit();

			// Retrieve Data from Database
			System.out.println("Studnet_ID:" + student.getId());

			// get new session and start new transaction
			session = factory.getCurrentSession();

			session.beginTransaction();

			System.out.println("Getting Student with ID:" + student.getId());

			Student result = session.get(Student.class, student.getId());

			System.out.println("Get the result:" + result);

			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
