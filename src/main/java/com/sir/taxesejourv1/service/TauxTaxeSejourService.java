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

public interface TauxTaxeSejourService {
    public TauxTaxeSejour findByCategorieLibelle(String libelle);
    public int saveTauxTaxeSejour(TauxTaxeSejour tauxTaxeSejour);
}
