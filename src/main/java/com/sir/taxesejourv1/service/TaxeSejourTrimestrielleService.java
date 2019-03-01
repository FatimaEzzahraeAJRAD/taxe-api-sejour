/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.service;

import com.sir.taxesejourv1.bean.TaxeSejourTrimestrielle;
import com.sir.taxesejourv1.rest.exchage.vo.LocalVo;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Jawadoo
 */
public interface TaxeSejourTrimestrielleService {
//    public int saveTaxe(Long annee, String referenceLocal);
    public int creertaxe(TaxeSejourTrimestrielle taxesejourTrimestrielle, String referenceLocal);
      public TaxeSejourTrimestrielle findByReference(String reference);
       public List<TaxeSejourTrimestrielle> findByReferenceLocal(String referenceLocal);
        public List<TaxeSejourTrimestrielle> findByCriteria( Integer annee,Integer montantMin,Integer montantMax);
}
