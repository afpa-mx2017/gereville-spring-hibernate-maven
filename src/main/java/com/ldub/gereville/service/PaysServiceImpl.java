/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldub.gereville.service;

import com.ldub.gereville.entity.Pays;
import com.ldub.gereville.dao.PaysDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lionel
 */
@Service
public class PaysServiceImpl implements PaysService{

    @Autowired
    private PaysDao paysDao;
    
    @Transactional(readOnly = true)
    @Override
    public List<Pays> findAll() {
        return paysDao.findAll();
    }

    @Transactional
    @Override
    public void save(Pays p) {
        paysDao.save(p);
    }

    @Transactional
    @Override
    public void update(Pays pays) {
        paysDao.update(pays);
    }

    @Transactional
    @Override
    public void delete(Pays pays) {
        paysDao.delete(pays);
    }

    @Override
    public Pays findById(int id) {
        return paysDao.findById(id);
    }
    
}
