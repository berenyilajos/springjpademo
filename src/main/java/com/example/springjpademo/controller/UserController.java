package com.example.springjpademo.controller;

import com.example.springjpademo.bd.BDUser;
import com.example.springjpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getAllUser(){
        List<BDUser> users = userService.getAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users-data");
        modelAndView.addObject("users", users);

        return modelAndView;
    }

    @RequestMapping("/user-form")
    public ModelAndView getUserForm(){
        return new ModelAndView("add-user");
    }

    @RequestMapping(value="/add-user", method=RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute BDUser bdUser){
        userService.addUser(bdUser);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-data");
        modelAndView.addObject("user", bdUser);

        return modelAndView;
    }

    @RequestMapping(value="/user/{id:\\d+}", method=RequestMethod.GET)
    public ModelAndView getUser(@PathVariable long id){
        BDUser user = userService.getUser(id);
        if (user == null) {
            user = new BDUser();
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-data");
        modelAndView.addObject("user", user);

        return modelAndView;
    }

    @RequestMapping(value="/user/{name:^.*\\D+.*$}", method=RequestMethod.GET)
    public ModelAndView getUserByName(@PathVariable String name){
        List<BDUser> users = userService.getUserByName(name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users-data");
        modelAndView.addObject("users", users);

        return modelAndView;
    }
}
