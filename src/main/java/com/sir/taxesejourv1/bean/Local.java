/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author user
 */
@Entity
public class Local implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private BigDecimal surface;
    private String redevable;
    private String proprietaire;
    private String referenceRue;
    private BigDecimal dernierMontantPaye ;
    private BigDecimal dernierTrimestrePaye ;
    private BigDecimal dernierAnneePaye ;
    @ManyToOne
    private Categorie categorie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getSurface() {
        return surface;
    }

    public void setSurface(BigDecimal surface) {
        this.surface = surface;
    }

    public String getRedevable() {
        return redevable;
    }

    public void setRedevable(String redevable) {
        this.redevable = redevable;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getReferenceRue() {
        return referenceRue;
    }

    public void setReferenceRue(String referenceRue) {
        this.referenceRue = referenceRue;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

   

    public BigDecimal getDernierMontantPaye() {
        return dernierMontantPaye;
    }

    public void setDernierMontantPaye(BigDecimal dernierMontantPaye) {
        this.dernierMontantPaye = dernierMontantPaye;
    }

    public BigDecimal getDernierTrimestrePaye() {
        return dernierTrimestrePaye;
    }

    public void setDernierTrimestrePaye(BigDecimal dernierTrimestrePaye) {
        this.dernierTrimestrePaye = dernierTrimestrePaye;
    }

    public BigDecimal getDernierAnneePaye() {
        return dernierAnneePaye;
    }

    public void setDernierAnneePaye(BigDecimal dernierAnneePaye) {
        this.dernierAnneePaye = dernierAnneePaye;
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
        if (!(object instanceof Local)) {
            return false;
        }
        Local other = (Local) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.adresseapi.bean.Local[ id=" + id + " ]";
    }
    
}
