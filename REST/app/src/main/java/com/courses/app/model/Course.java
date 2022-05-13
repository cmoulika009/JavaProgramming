package com.courses.app.model;

public class Course {
	public Course() {

	}

	public Course(Integer id, String courseName, String courseDescription) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}

	private Integer id;
	private String courseName;
	private String courseDescription;

	// Getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseDescription=" + courseDescription + "]";
	}
}
