package com.ldub.gereville;

import com.ldub.gereville.entity.Pays;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ldub.gereville.config.AppConfig;
import com.ldub.gereville.service.PaysService;


public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      PaysService paysService = context.getBean(PaysService.class);

      //creation de pays
      
      paysService.save(new Pays("DDDDD"));
      paysService.save(new Pays("CCCCCCC"));
      
      Pays p = new Pays("kikou des iles");
      paysService.save(p);
       
      p.setNom("kikou des alpes");
      paysService.update(p);
      
      System.out.println("pays nouveau:" + p.getNom());
      
      
      paysService.delete(p);
      
       List<Pays> payss = paysService.findAll();
       for (Pays pays : payss) {
           System.out.println("p:" + pays.getNom());
       }

      context.close();
   }
}
