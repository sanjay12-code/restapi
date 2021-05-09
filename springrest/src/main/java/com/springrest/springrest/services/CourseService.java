package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	
	public Courses getCourse(long courseId);

	public Courses addCourses(Courses courses);
	 
	public Courses updateCourses(Courses courses);
	 
	public void deleteCourses(long ParseLong);
}

