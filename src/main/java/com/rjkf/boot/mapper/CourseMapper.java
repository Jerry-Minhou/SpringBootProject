package com.rjkf.boot.mapper;

import com.rjkf.boot.bean.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.relational.core.sql.In;

@Mapper
public interface CourseMapper {

    public Course getCourse(Integer id);
}
