package com.example.springjpademo.mgr;

import com.example.springjpademo.dao.Dao;

public abstract class AbstractMgr implements Mgr {
    private Dao dao;

    public AbstractMgr(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String getContent() {
        return dao.getContent();
    }

}
