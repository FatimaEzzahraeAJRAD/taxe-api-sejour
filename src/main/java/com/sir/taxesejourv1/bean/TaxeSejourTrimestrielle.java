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
    private Long id;
    private int numeroTrimester;
    private int nomberDeNuit;
    private Long nomberClient;
    private double montant;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePresentation;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateValidation;
    @Temporal(javax.persistence.TemporalType.DATE)
     private Date dateQuittance;
    @ManyToOne
    private TaxeSejourAnnuelle taxeSejourAnnuelle;

    public int getNumeroTrimester() {
        return numeroTrimester;
    }

    public void setNumeroTrimester(int numeroTrimester) {
        this.numeroTrimester = numeroTrimester;
    }

    public int getNomberDeNuit() {
        return nomberDeNuit;
    }

    public void setNomberDeNuit(int nomberDeNuit) {
        this.nomberDeNuit = nomberDeNuit;
    }

    public Long getNomberClient() {
        return nomberClient;
    }

    public void setNomberClient(Long nomberClient) {
        this.nomberClient = nomberClient;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
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

    public Date getDateQuittance() {
        return dateQuittance;
    }

    public void setDateQuittance(Date dateQuittance) {
        this.dateQuittance = dateQuittance;
    }

    public TaxeSejourAnnuelle getTaxeSejourAnnuelle() {
        return taxeSejourAnnuelle;
    }

    public void setTaxeSejourAnnuelle(TaxeSejourAnnuelle taxeSejourAnnuelle) {
        this.taxeSejourAnnuelle = taxeSejourAnnuelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "com.sir.taxesejourv1.bean.TaxeSejourTrimestrielle[ id=" + id + " ]";
    }
    
}
