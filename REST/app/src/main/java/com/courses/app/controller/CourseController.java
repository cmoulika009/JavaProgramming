package com.courses.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courses.app.model.Course;
import com.courses.app.service.CourseService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/courses")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping(path = "/getCourses", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Course>> getCourses() {
		List<Course> courses = new ArrayList<>();
        try {
            courses = courseService.getCourses();
            return new ResponseEntity<>(courses, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(courses, HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}
	
	@PostMapping(value = "/addCourse", consumes =MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addCourse(@RequestBody Course course) {
    	try {
    		courseService.addCourse(course);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}
}
