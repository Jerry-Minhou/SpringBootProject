package com.rjkf.boot.controller;

import com.rjkf.boot.bean.Course;
import com.rjkf.boot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/getCourse")
    @ResponseBody
    public Course getCout(@RequestParam("id") Integer id){
        Course course = courseService.getCourse(id);
        return course;
    }
}
