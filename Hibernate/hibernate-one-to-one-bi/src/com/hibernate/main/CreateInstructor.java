package com.hibernate.main;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class CreateInstructor {

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

			// create Object
			Instructor instuctor = new Instructor("subhash", "kondeti", "kvsubhash@gmail.com");
			InstructorDetail instructorDetail = new InstructorDetail("youtube.subhash", "sleeping");

			// Associate Object : instructorDetail returns id that is saved as
			// foreign key in instructor table
			instuctor.setInstructorDetail(instructorDetail);

			// Begin Transaction
			session.beginTransaction();

			// save instructor which will also cascade instructor details as we
			// specified Cascade Type
			System.out.println("Saving Details to Tables:" + instuctor);
			session.save(instuctor);

			// Commit Transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
