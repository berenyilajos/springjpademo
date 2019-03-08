package com.example.springjpademo.dao;

import org.springframework.stereotype.Component;

@Component
public class BelloDao implements Dao {
    @Override
    public String getContent() {
        return "Bello!!!!!!";
    }
}
