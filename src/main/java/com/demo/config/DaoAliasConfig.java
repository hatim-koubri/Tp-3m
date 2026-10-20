package com.demo.config;



import com.demo.dao.DaoApi;
import com.demo.dao.DaoFile;
import com.demo.dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class DaoAliasConfig {

    @Bean
    @Primary
    public IDao daoAlias() {
        // Pointe vers l'implémentation API
        return new DaoApi();
    }
}