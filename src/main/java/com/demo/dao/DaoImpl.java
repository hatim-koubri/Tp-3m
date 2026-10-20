package com.demo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("dao2")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        System.out.println("[DAO] Lecture depuis la base de données (prod)");

        return 100.0;
    }
}
