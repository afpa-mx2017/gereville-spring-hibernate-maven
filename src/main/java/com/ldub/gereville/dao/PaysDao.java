/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldub.gereville.dao;

import com.ldub.gereville.entity.Pays;
import java.util.List;

/**
 *
 * @author lionel
 */
public interface PaysDao {
    
    void update(Pays pays);
    void delete(Pays pays);
    void save(Pays pays);
    List<Pays> findAll();
    Pays findById(int id);
}
