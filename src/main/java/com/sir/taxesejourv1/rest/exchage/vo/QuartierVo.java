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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
public class QuartierVo implements Serializable {
   
    private static final long serialVersionUID = 1L;
    private String reference;
    @ManyToOne
    private SecteurVo secteur;
    @OneToMany(mappedBy = "quartier")
    private List<RueVo> rues;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public SecteurVo getSecteur() {
        return secteur;
    }

    public void setSecteur(SecteurVo secteur) {
        this.secteur = secteur;
    }

    public List<RueVo> getRues() {
        return rues;
    }

    public void setRues(List<RueVo> rues) {
        this.rues = rues;
    }


}