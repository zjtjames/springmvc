package com.jmall.mvcdemo.service;

import com.jmall.mvcdemo.model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
	
	
	Course getCoursebyId(Integer courseId);
	

	
	

}
