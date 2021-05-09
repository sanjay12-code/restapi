package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;
@Service
public class CourseServiceimpl  implements CourseService{

	@Autowired
	private CourseDao courseDao;
	

	public CourseServiceimpl() {
	    

	}
	@Override
	public List<Courses> getCourses() {
        return courseDao.findAll();
	}

	@Override
	public Courses getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}
	@Override
	public Courses addCourses(Courses courses) {
		courseDao.save(courses);
	
		  return courses;
	}
	@Override
	public Courses updateCourses(Courses courses) {
		courseDao.save(courses);
		return courses;
	}
	@Override
	public void deleteCourses(long ParseLong) {
	
		Courses entity=courseDao.getOne(ParseLong);
		courseDao.delete(entity);
	}

}

 