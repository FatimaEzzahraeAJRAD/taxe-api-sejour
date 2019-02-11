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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Jawadoo
 */
@Entity
public class TaxeSejourAnnuelle implements Serializable {

    @OneToMany(mappedBy = "taxeSejourAnnuelle")
    private List<TaxeSejourTrimestrielle> taxeSejourTrimestrielles;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int annee;
    private int nomberDeNuit;
    private Long nomberClient;
    private double montant;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePresentation;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateValidation;
    @Temporal(javax.persistence.TemporalType.DATE)
     private Date dateQuittance;
    private String referenceLocal;

    public Date getDateQuittance() {
        return dateQuittance;
    }

    public void setDateQuittance(Date dateQuittance) {
        this.dateQuittance = dateQuittance;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    
    public List<TaxeSejourTrimestrielle> getTaxeSejourTrimestrielles() {
        return taxeSejourTrimestrielles;
    }

    public void setTaxeSejourTrimestrielles(List<TaxeSejourTrimestrielle> taxeSejourTrimestrielles) {
        this.taxeSejourTrimestrielles = taxeSejourTrimestrielles;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
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

    public String getReferenceLocal() {
        return referenceLocal;
    }

    public void setReferenceLocal(String referenceLocal) {
        this.referenceLocal = referenceLocal;
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
