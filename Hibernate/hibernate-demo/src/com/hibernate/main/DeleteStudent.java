package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		// create Session
		Session session = factory.getCurrentSession();

		try {

			// Begin Transaction
			session.beginTransaction();

			int studentId = 3001;

			Student theStudent = session.get(Student.class, studentId);

			// Delete Student for given id
			session.delete(theStudent);

			// Delete Student using HQL
			session.createQuery("DELETE FROM Student S WHERE S.id=3000").executeUpdate();

			// Commit Transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
