package com.courses.app.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.courses.app.model.Course;


@Repository
public class CoursesRepo {
	private List<Course> courses;

	public CoursesRepo() {
		this.courses = new ArrayList<>();
		addCourse(new Course(1, "Java",
				"Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible"));
		addCourse(new Course(2, "Spring",
				"The Spring Framework is an application framework and inversion of control container for the Java platform"));
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		course.setId(null != getCourses() ? getCourses().size() + 1 : 1);
		this.courses.add(course);
	}
}
