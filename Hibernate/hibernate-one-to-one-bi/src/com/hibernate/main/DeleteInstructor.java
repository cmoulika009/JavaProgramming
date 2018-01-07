package com.hibernate.main;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class DeleteInstructor {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// create SessionFactory and add the Entity classes
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// create Session
		Session session = factory.getCurrentSession();

		try {
			// uses session object to save Java object
			System.out.println("Creating Student Object");

			// Begin Transaction
			session.beginTransaction();

			// Get instructor by using Primary Key
			// And then delete instructor

			int instId = 1;
			Instructor instructor = session.get(Instructor.class, instId);

			System.out.println("Instructor Details:" + instructor);

			// The delete operation will delete its related entity also
			if (instructor != null) {
				session.delete(instructor);
			}

			// Commit Transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
