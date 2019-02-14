/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.exchage.vo;

import com.sir.taxesejourv1.bean.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * 
 * @author user
 */
public class RedevableVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cin;
    private String nom;
    private String adresse;
    private String prenom;
    private String telephone;
    private String matricule;
    
    @OneToMany(mappedBy = "redevable")
    private List<LocalVo> locals;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String marticule) {
        this.matricule = marticule;
    }

   
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<LocalVo> getLocals() {
        return locals;
    }

    public void setLocals(List<LocalVo> locals) {
        this.locals = locals;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}