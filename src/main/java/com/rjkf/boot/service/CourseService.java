package com.rjkf.boot.service;

import com.rjkf.boot.bean.Course;
import com.rjkf.boot.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public Course getCourse(Integer id){
        return courseMapper.getCourse(id);
    }
}
