package com.java.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.Course;
import com.java.dto.Student;

@RestController

public class StudentController {
	@RequestMapping(path="/students", method=RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudents(){
		List<Student> list= new ArrayList<>();
		Course course1= new Course();
		course1.setName("Java");
		course1.setDuration(45);
		List<Course> courseList= Arrays.asList(course1);
		Student student1= new Student("Raj", "+91-124-8776444", "Delhi", courseList);
		list.add(student1);
		return list;
	}
}
