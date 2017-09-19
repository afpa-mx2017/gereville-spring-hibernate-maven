package com.ldub.gereville.entity;



import com.ldub.gereville.entity.Pays;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author lionel
 */


@Entity
@Table(name = "ville")
public class Ville implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
   
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    
    @Basic(optional = false)
    @Column(name = "nbhabitants")
    private int nbhabitants;
    

    @JoinColumn(name = "pays_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pays pays;


    public Ville() {
    }

    public Ville(Integer id) {
        this.id = id;
    }

    public Ville(Integer id, String nom, int nbhabitants) {
        this.id = id;
        this.nom = nom;
        this.nbhabitants = nbhabitants;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbhabitants() {
        return nbhabitants;
    }

    public void setNbhabitants(int nbhabitants) {
        this.nbhabitants = nbhabitants;
    }

    


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ldub.gerville.Ville[ id=" + id + " ]";
    }
    
}
