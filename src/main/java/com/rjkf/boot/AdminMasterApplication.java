package com.rjkf.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(value = "com.rjkf.boot")
@SpringBootApplication
public class AdminMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminMasterApplication.class, args);
    }

}
