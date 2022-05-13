package com.courses.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.app.model.Course;
import com.courses.app.repo.CoursesRepo;

@Service
public class CourseService {
	@Autowired
	CoursesRepo courseRepo;

	public List<Course> getCourses() {
		return courseRepo.getCourses();
	}

	public void addCourse(Course course) {
		courseRepo.addCourse(course);
	}
}
