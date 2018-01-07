package com.sring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student-welcome")
public class StudentController {

	// Model is used to pass data between Controller and View
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// Create Student Object
		Student theStudent = new Student();

		// Add Object to Model
		theModel.addAttribute("student", theStudent);

		return "student-form";
	}

	// @ModelAttribute bind data from form to object
	@RequestMapping("/processForm")
	public String getDetails(@ModelAttribute("student") Student theStudent) {

		System.out.println("Student Name:" + theStudent.getFirstName() + ' ' + theStudent.getLastName() + ' '
				+ theStudent.getCountry());

		return "student-display";
	}
}
