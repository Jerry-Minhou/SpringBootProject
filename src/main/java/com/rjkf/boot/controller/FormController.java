package com.rjkf.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class FormController {

    @GetMapping("/form_layouts")
    public String form_layouts() {

        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("username") String username,
                         @RequestParam("email") String email,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) {
        if (!headerImg.isEmpty()) {
            try {
                String originalFilename = headerImg.getOriginalFilename();
                headerImg.transferTo(new File("D:\\study\\images\\" + originalFilename));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (photos.length > 0) {
            for (MultipartFile photo : photos) {
                if (!photo.isEmpty()) {
                    String originalFilename = photo.getOriginalFilename();
                    try {
                        photo.transferTo(new File("D:\\study\\images\\" + originalFilename));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return "form/form_layouts";
    }
}
