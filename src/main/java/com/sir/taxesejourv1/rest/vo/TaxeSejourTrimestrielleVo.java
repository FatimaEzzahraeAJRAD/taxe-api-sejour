/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.vo;

/**
 *
 * @author lenovo
 */
public class TaxeSejourTrimestrielleVo {
     private Long id;
     private String reference;
    private String chiffreAffaire;
    private String numeroTrimester;
    private String annee;
    private String montantBase;
    private String montantMajoration;
    private String montantPenalite;
    private String montantTaxe;
    private String datePresentation;
    private String datePaiment;
   private String nomberMoisRetard;
     private String referenceLocal;
    private TaxeSejourAnnuelleVo taxeSejourAnnuelleVO;

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

    public String getDatePaiment() {
        return datePaiment;
    }

    public void setDatePaiment(String datePaiment) {
        this.datePaiment = datePaiment;
    }

    

    public String getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(String nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }

    public String getReferenceLocal() {
        return referenceLocal;
    }

    public void setReferenceLocal(String referenceLocal) {
        this.referenceLocal = referenceLocal;
    }

    public TaxeSejourAnnuelleVo getTaxeSejourAnnuelleVO() {
        return taxeSejourAnnuelleVO;
    }

    public void setTaxeSejourAnnuelleVO(TaxeSejourAnnuelleVo taxeSejourAnnuelleVO) {
        this.taxeSejourAnnuelleVO = taxeSejourAnnuelleVO;
    }

    @Override
    public String toString() {
        return "TaxeSejourTrimestrielleVo{" + "id=" + id + ", chiffreAffaire=" + chiffreAffaire + ", numeroTrimester=" + numeroTrimester + ", annee=" + annee + ", montantBase=" + montantBase + ", montantMajoration=" + montantMajoration + ", montantPenalite=" + montantPenalite + ", montantTaxe=" + montantTaxe + ", datePresentation=" + datePresentation + ", nomberMoisRetard=" + nomberMoisRetard + ", referenceLocal=" + referenceLocal + '}';
    }
    
    

}
