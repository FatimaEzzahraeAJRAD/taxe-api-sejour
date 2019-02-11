/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.service;

import com.sir.taxesejourv1.bean.Categorie;
import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jawadoo
 */
@Service
public interface TauxTaxeSejourService {
        public TauxTaxeSejour findByCategorie(Categorie categorie);
}
