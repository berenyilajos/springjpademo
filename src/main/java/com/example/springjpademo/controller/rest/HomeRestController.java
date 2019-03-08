package com.example.springjpademo.controller.rest;

import com.example.springjpademo.bd.BDUser;
import com.example.springjpademo.mgr.Mgr;
import com.example.springjpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @Autowired
    private Mgr helloMgr;
    @Autowired
    private Mgr belloMgr;
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return helloMgr.getContent();
    }

    @RequestMapping("/bello")
    public String bello(){
        return belloMgr.getContent();
    }

    @RequestMapping(value="/rest/add-user", method= RequestMethod.POST)
    public void addUser(@RequestBody BDUser user){
        userService.addUser(user);
    }
}
