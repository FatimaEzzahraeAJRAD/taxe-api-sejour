/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.service;

import com.sir.taxesejourv1.bean.TaxeSejourTrimestrielle;

/**
 *
 * @author Jawadoo
 */
public interface TaxeSejourTrimestrielleService {
//    public int saveTaxe(Long annee, String referenceLocal);
     //public int creertaxe(TaxeSejourTrimestrielle taxesejourTrimestrielle, String referenceLocal);
     public TaxeSejourTrimestrielle findTaxeTrimestrielleByNumeroTrimesterAndAnnee(int numeroTrimestre,int annee);
}
