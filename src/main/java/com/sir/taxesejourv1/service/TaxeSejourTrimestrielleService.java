/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.service;

import com.sir.taxesejourv1.bean.Categorie;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jawadoo
 */
public interface TaxeSejourTrimestrielleService {
    public int saveTaxe(Long annee, String referenceLocal);
    
}
