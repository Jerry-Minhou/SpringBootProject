package com.rjkf.boot.controller;

import com.rjkf.boot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping(value = {"/login","/"})
    public String login(){
        return "/login";
    }

    @PostMapping("/login")
    public String gotoLogin(User user, Model model, HttpSession session){
        if (StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())) {
            session.setAttribute("loginUser",user);
            return "redirect:/gotoMain";
        } else {
            model.addAttribute("msg","用户密码有误");
            return "login";
        }
    }

    @GetMapping("/gotoMain")
    public String gotoMain(HttpSession session,Model model){
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null){
//            return "main";
//        } else {
//            model.addAttribute("msg","请重新登陆！");
//            return "login";
//        }
        return "main";
    }


}
