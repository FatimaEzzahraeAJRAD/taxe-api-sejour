/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest;

import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.rest.converter.TauxTaxeSejourConverter;
import com.sir.taxesejourv1.rest.vo.TauxTaxeSejourVo;
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
    @Autowired
    private TauxTaxeSejourConverter tauxTaxeSejourConverter;

     @PostMapping("/")
    public int saveTauxTaxeSejour(@RequestBody TauxTaxeSejourVo tauxTaxeSejourVo) {
        TauxTaxeSejour tauxTaxeSejour = tauxTaxeSejourConverter.toItem(tauxTaxeSejourVo);
        int res= tauxTaxeSejourService.saveTauxTaxeSejour(tauxTaxeSejour);
         return res;
    }

    public TauxTaxeSejourConverter getTauxTaxeSejourConverter() {
        return tauxTaxeSejourConverter;
    }

    public void setTauxTaxeSejourConverter(TauxTaxeSejourConverter tauxTaxeSejourConverter) {
        this.tauxTaxeSejourConverter = tauxTaxeSejourConverter;
    }
    
    
    
    public TauxTaxeSejourService getTauxTaxeSejourService() {
        return tauxTaxeSejourService;
    }

    public void setTauxTaxeSejourService(TauxTaxeSejourService tauxTaxeSejourService) {
        this.tauxTaxeSejourService = tauxTaxeSejourService;
    }
    
}