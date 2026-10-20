package com.demo;

import com.demo.config.AppConfig;
import com.demo.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.getEnvironment().setActiveProfiles("prod");

//        // Crée le conteneur Spring
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);

        // Récupère le bean métier
        IMetier metier = context.getBean(IMetier.class);

        // Exécute le calcul
        double resultat = metier.calcul();
        System.out.println("Résultat final : " + resultat);

        // Ferme le conteneur
        context.close();
    }
}
