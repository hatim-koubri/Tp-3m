package com.demo.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        System.out.println("[DAO] Lecture depuis la base de données (dev)");
        return 150.0;
    }
}
