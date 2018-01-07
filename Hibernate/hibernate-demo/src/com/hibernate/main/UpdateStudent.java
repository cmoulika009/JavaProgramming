package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		// create Session
		Session session = factory.getCurrentSession();

		try {

			// Begin Transaction
			session.beginTransaction();

			int studentId = 1;

			Student theStudent = session.get(Student.class, studentId);

			theStudent.setEmail("moulika@gmail.com");

			// Commit Transaction
			session.getTransaction().commit();

			session = factory.getCurrentSession();

			// Begin Transaction
			session.beginTransaction();

			session.createQuery("update Student s set s.lastName='Chadalavada' where s.lastName='Ch'");

			// Commit Transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
