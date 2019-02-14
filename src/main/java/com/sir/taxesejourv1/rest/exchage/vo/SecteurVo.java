/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.exchage.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
public class SecteurVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String reference;
     @OneToMany(mappedBy = "secteur")
    private List<QuartierVo> quartiers;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<QuartierVo> getQuartiers() {
        return quartiers;
    }

    public void setQuartiers(List<QuartierVo> quartiers) {
        this.quartiers = quartiers;
    }
    
}
