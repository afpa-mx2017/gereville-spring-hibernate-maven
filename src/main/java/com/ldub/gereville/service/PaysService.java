/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldub.gereville.service;

import com.ldub.gereville.entity.Pays;
import java.util.List;

/**
 *
 * @author lionel
 */
public interface PaysService {
    
    void update(Pays pays);
    void delete(Pays pays);
    void save(Pays p);
    List<Pays> findAll();
    Pays findById(int id);
}
