package com.hibernate.main;

import java.text.ParseException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class GetInstructorDetails {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// create SessionFactory and add the Entity classes
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// create Session
		Session session = factory.getCurrentSession();

		try {

			// Begin Transaction
			session.beginTransaction();

			// Get instructor by using Primary Key
			int instId = 5;
			InstructorDetail instructorDetails = session.get(InstructorDetail.class, instId);

			System.out.println("Instructor Details:" + instructorDetails);

			// Print the associated instructor for instructor detail id
			if (instructorDetails != null) {
				System.out.println("Instructor:" + instructorDetails.getInstructor());
			}

			// Commit Transaction
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally

		{
			session.close();
			factory.close();
		}
	}

}
