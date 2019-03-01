/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Jawadoo
 */
@Entity
public class TaxeSejourTrimestrielle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String reference ;
    private Long id;
    private double chiffreAffaire;
    private int numeroTrimester;
    private int annee;
    private double montantBase=0;
    private double montantMajoration=0;
    private double montantPenalite=0;
    private double montantTaxe=0;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePresentation;
   private long nomberMoisRetard=0;
     private Local local;
    @ManyToOne
    private TaxeSejourAnnuelle taxeSejourAnnuelle;

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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
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

    public long getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(long nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    

    public TaxeSejourAnnuelle getTaxeSejourAnnuelle() {
        return taxeSejourAnnuelle;
    }

    public void setTaxeSejourAnnuelle(TaxeSejourAnnuelle taxeSejourAnnuelle) {
        this.taxeSejourAnnuelle = taxeSejourAnnuelle;
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
        if (!(object instanceof TaxeSejourTrimestrielle)) {
            return false;
        }
        TaxeSejourTrimestrielle other = (TaxeSejourTrimestrielle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TaxeSejourTrimestrielle{" + "id=" + id + ", chiffreAffaire=" + chiffreAffaire + ", numeroTrimester=" + numeroTrimester + ", annee=" + annee + ", montantBase=" + montantBase + ", montantMajoration=" + montantMajoration + ", montantPenalite=" + montantPenalite + ", montantTaxe=" + montantTaxe + ", datePresentation=" + datePresentation + ", nomberMoisRetard=" + nomberMoisRetard + '}';
    }

   
}
