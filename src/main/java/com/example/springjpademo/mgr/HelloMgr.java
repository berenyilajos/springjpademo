package com.example.springjpademo.mgr;

import com.example.springjpademo.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloMgr extends AbstractMgr {

    /**
     * inject a HelloDao by name convention
     * @param helloDao
     */
    @Autowired
    public HelloMgr(Dao helloDao) {
        super(helloDao);
    }
}
