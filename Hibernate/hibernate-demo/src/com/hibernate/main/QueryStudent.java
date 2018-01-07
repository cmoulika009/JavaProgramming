package com.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class QueryStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create SessionFactory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		// create Session
		Session session = factory.getCurrentSession();

		try {
			// Begin Transaction
			session.beginTransaction();

			// Retrieve list of all Students from table
			List<Student> listStudents = session.createQuery("from Student").getResultList();

			displayStudents(listStudents);

			// query Students with LastName
			System.out.println("List of Students based on Last Name");
			listStudents = session.createQuery("from Student s where s.lastName='Ch'").getResultList();

			displayStudents(listStudents);

			System.out.println("List of Students based on First Name & Last Name");
			listStudents = session.createQuery("from Student s where s.firstName='Hema' OR s.lastName='Ch'")
					.getResultList();

			displayStudents(listStudents);

			System.out.println("List of Students using Like operator");
			listStudents = session.createQuery("from Student s where s.email LIKE '%gmail%'").getResultList();

			displayStudents(listStudents);

			// Commit Transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> listStudents) {
		for (Student tempList : listStudents) {
			System.out.println(tempList);
		}

	}

}
