package com.rjkf.boot.bean;

import lombok.Data;
import org.springframework.data.relational.core.sql.In;

@Data
public class Course {
    private Integer id;
    private String name;
    private Integer teacherId;
    private Integer period;
    private Integer price;
}
