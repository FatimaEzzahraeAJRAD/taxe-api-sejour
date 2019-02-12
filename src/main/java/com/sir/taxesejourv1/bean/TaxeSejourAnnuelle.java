/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Jawadoo
 */
@Entity
public class TaxeSejourAnnuelle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   private double chiffreAffaire;
   private int numeroTrimester;
    private Long annee;
    private double montantBase;
    private double montantMajoration;
    private double montantPenalite;
     private double montantTaxe;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePresentation;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateValidation;
   private int nomberMoisRetard;
    @OneToMany(mappedBy = "taxeSejourAnnuelle")
    private List<TaxeSejourTrimestrielle> taxeSejourTrimestrielles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getNumeroTrimester() {
        return numeroTrimester;
    }

    public void setNumeroTrimester(int numeroTrimester) {
        this.numeroTrimester = numeroTrimester;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(double montantBase) {
        this.montantBase = montantBase;
    }

    public double getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(double montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public double getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(double montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public double getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(double montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public Date getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(Date datePresentation) {
        this.datePresentation = datePresentation;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public int getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(int nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }

    public List<TaxeSejourTrimestrielle> getTaxeSejourTrimestrielles() {
        return taxeSejourTrimestrielles;
    }

    public void setTaxeSejourTrimestrielles(List<TaxeSejourTrimestrielle> taxeSejourTrimestrielles) {
        this.taxeSejourTrimestrielles = taxeSejourTrimestrielles;
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
        if (!(object instanceof TaxeSejourAnnuelle)) {
            return false;
        }
        TaxeSejourAnnuelle other = (TaxeSejourAnnuelle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.taxesejourv1.bean.TaxeSejourAnnuelle[ id=" + id + " ]";
    }
    
}
