package com.rjkf.boot.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;
import java.util.Arrays;
//保证容器中的实例都是单例
//@Configuration(proxyBeanMethods = true)
public class MyServletConfig {

//    @Bean
    public ServletRegistrationBean servletRegistration(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean(myServlet,"/my","/");
    }

//    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        MyFilter myFilter = new MyFilter();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/","/css/*"));
        return filterRegistrationBean;
    }

//    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        MyListener myListener = new MyListener();
        return new ServletListenerRegistrationBean(myListener);
    }
}
