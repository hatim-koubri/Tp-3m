package com.demo.metier;


import com.demo.dao.IDao;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MetierImpl implements IMetier {
    private final IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }


    @PostConstruct
    public void init() {
        System.out.println("[TRACE] Implémentation DAO injectée : " + dao.getClass().getSimpleName());
    }

    @Override
    public double calcul() {
        double valeur = dao.getValue();
        return valeur * 2.0;
    }
}
