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
public class RueVo implements Serializable {

    


    private static final long serialVersionUID = 1L;
    private String reference;
    @ManyToOne
    private QuartierVo quartierVo;
    @OneToMany(mappedBy = "rue")
    private List<LocalVo> localsVo;

 
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public QuartierVo getQuartierVo() {
        return quartierVo;
    }

    public void setQuartierVo(QuartierVo quartierVo) {
        this.quartierVo = quartierVo;
    }

    public List<LocalVo> getLocalsVo() {
        return localsVo;
    }

    public void setLocalsVo(List<LocalVo> localsVo) {
        this.localsVo = localsVo;
    }

    

   
}
