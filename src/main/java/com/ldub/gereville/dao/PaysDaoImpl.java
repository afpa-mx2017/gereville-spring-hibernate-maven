/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ldub.gereville.dao;

import com.ldub.gereville.entity.Pays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lionel
 */
@Repository
public class PaysDaoImpl implements PaysDao{

   @PersistenceContext
   private EntityManager em;

   
   @Override
   public void save(Pays pays) {
      em.persist(pays);
   }

   @Override
   public List<Pays> findAll() {
      CriteriaQuery<Pays> criteriaQuery = em.getCriteriaBuilder().createQuery(Pays.class);
      @SuppressWarnings("unused")
      Root<Pays> root = criteriaQuery.from(Pays.class);
      return em.createQuery(criteriaQuery).getResultList();
   }

    @Override
    public void update(Pays pays) {
        em.merge(pays);
    }

    @Override
    public void delete(Pays pays) {
      em.remove(em.merge(pays));
    }
    
}
