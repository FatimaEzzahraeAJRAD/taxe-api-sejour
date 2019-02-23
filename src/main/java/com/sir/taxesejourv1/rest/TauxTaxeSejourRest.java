/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest;

import com.sir.taxesejourv1.bean.Categorie;
import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.service.TauxTaxeSejourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jawadoo
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping({"/taxe-sejour-v1/tauxTaxeSejour"})
public class TauxTaxeSejourRest {
    @Autowired
    private TauxTaxeSejourService tauxTaxeSejourService;

     @PostMapping("/")
    public int saveTauxTaxeSejour(@ RequestBody TauxTaxeSejour tauxTaxeSejour) {
        return tauxTaxeSejourService.saveTauxTaxeSejour(tauxTaxeSejour);
    }
    
    public TauxTaxeSejourService getTauxTaxeSejourService() {
        return tauxTaxeSejourService;
    }

    public void setTauxTaxeSejourService(TauxTaxeSejourService tauxTaxeSejourService) {
        this.tauxTaxeSejourService = tauxTaxeSejourService;
    }
    
}