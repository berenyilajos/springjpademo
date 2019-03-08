package com.example.springjpademo.mgr;

import com.example.springjpademo.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BelloMgr extends AbstractMgr {

    /**
     * inject a BelloDao by name convention
     * @param belloDao
     */
    @Autowired
    public BelloMgr(Dao belloDao) {
        super(belloDao);
    }
}
