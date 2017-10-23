/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldub.gereville.service;

import com.ldub.gereville.config.AppConfig;
import com.ldub.gereville.entity.Pays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class PaysServiceTest {
    
    @Autowired
    private PaysService ps;
    
    
    private int paysId;
    
    @Before
    public void setUp() {
        Pays p = new Pays("zornotile");
        ps.save(p);
        
        paysId = p.getId();
        
    }
    
    @Test
    public void findAll(){
        List<Pays> payss = ps.findAll();
        Assert.assertNotNull(payss);
        Assert.assertTrue(payss.size() > 0);
    }
    
    @Test
    public void update(){
        
        Pays p = ps.findById(paysId);
        p.setNom("kikou paoiri");
        ps.update(p);
        Assert.assertEquals("kikou paoiri", p.getNom());
    }
    
    
    
    
}
