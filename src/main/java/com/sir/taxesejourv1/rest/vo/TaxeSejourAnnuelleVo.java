/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.vo;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class TaxeSejourAnnuelleVo {
     private Long id;
   private String chiffreAffaire;
   private String numeroTrimester;
    private String annee;
    private String montantBase;
    private String montantMajoration;
    private String montantPenalite;
     private String montantTaxe;
    private String datePresentation;
    private String dateValidation;
   private String nomberMoisRetard;
    private List<TaxeSejourTrimestrielleVo> taxeSejourTrimestriellesVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(String chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public String getNumeroTrimester() {
        return numeroTrimester;
    }

    public void setNumeroTrimester(String numeroTrimester) {
        this.numeroTrimester = numeroTrimester;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(String montantBase) {
        this.montantBase = montantBase;
    }

    public String getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(String montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public String getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(String montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public String getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(String montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public String getDatePresentation() {
        return datePresentation;
    }

    public void setDatePresentation(String datePresentation) {
        this.datePresentation = datePresentation;
    }

    public String getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(String dateValidation) {
        this.dateValidation = dateValidation;
    }

    public String getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(String nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }

    public List<TaxeSejourTrimestrielleVo> getTaxeSejourTrimestriellesVo() {
        return taxeSejourTrimestriellesVo;
    }

    public void setTaxeSejourTrimestriellesVo(List<TaxeSejourTrimestrielleVo> taxeSejourTrimestriellesVo) {
        this.taxeSejourTrimestriellesVo = taxeSejourTrimestriellesVo;
    }

}