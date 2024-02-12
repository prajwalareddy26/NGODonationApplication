package com.jnit;

import com.jnit.Model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainLogic {

    public static void main(String[] args){
        ConfigurableApplicationContext ca = SpringApplication.run(MainLogic.class,args);
        UserService us = ca.getBean(UserService.class);

        User user = new User();

        user.setFirst_name("david");
        user.setLast_name("carter");
        user.setUser_id(1);
        user.setEmail("davidcarter1@gmail.com");
        user.setPassword("retrac@1");
        user.setRole("Admin");
        us.insert(user);
    }
}
