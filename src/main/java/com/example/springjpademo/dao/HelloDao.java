package com.example.springjpademo.dao;

import org.springframework.stereotype.Component;

@Component
public class HelloDao implements Dao {
    @Override
    public String getContent() {
        return "Hello!!!!!!";
    }
}
