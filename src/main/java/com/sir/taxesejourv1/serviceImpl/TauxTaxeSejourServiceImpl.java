/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.serviceImpl;

import com.sir.taxesejourv1.bean.Categorie;
import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.dao.TauxTaxeSejourDao;
import com.sir.taxesejourv1.service.TauxTaxeSejourService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jawadoo
 */
public class TauxTaxeSejourServiceImpl implements TauxTaxeSejourService {

    @Autowired
    private TauxTaxeSejourDao tauxTaxeSejourDao;

    public TauxTaxeSejourDao getTauxTaxeSejourDao() {
        return tauxTaxeSejourDao;
    }

    public void setTauxTaxeSejourDao(TauxTaxeSejourDao tauxTaxeSejourDao) {
        this.tauxTaxeSejourDao = tauxTaxeSejourDao;
    }
    
    @Override
    public TauxTaxeSejour findByCategorie(Categorie categorie) {
    return tauxTaxeSejourDao.findByCategorie(categorie);
    }
}
