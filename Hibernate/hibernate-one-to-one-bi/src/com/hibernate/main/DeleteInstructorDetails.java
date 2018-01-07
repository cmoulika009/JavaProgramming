package com.hibernate.main;

import java.text.ParseException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class DeleteInstructorDetails {

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
			// And then delete instructor

			int instId = 4;
			InstructorDetail instructorDetails = session.get(InstructorDetail.class, instId);

			System.out.println("Instructor Details:" + instructorDetails);

			// Delete Instructor Details which automatically deletes instructor
			// using Cascade Delete

			System.out.println("Deleting Instructor Details");
			if (instructorDetails != null) {
				session.delete(instructorDetails);
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
