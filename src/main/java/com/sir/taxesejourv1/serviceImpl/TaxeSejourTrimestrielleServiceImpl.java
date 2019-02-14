/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.serviceImpl;

import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.bean.TaxeSejourTrimestrielle;
import com.sir.taxesejourv1.dao.TaxeSejourTrimestrielleDao;
import com.sir.taxesejourv1.rest.proxy.LocalProxy;
import com.sir.taxesejourv1.rest.exchage.vo.LocalVo;
import com.sir.taxesejourv1.service.TauxTaxeSejourService;
import com.sir.taxesejourv1.service.TaxeSejourTrimestrielleService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jawadoo
 */
public class TaxeSejourTrimestrielleServiceImpl implements TaxeSejourTrimestrielleService {

    @Autowired
    private TaxeSejourTrimestrielleDao taxeSejourTrimestrielleDao;
    @Autowired
    private TauxTaxeSejourService tauxTaxeSejourService;
    @Autowired
    private LocalProxy localProxy;
    @Autowired
    private TaxeSejourTrimestrielle taxeSejourTrimestrielle;

    @Override
    public int saveTaxe(Long annee, String referenceLocal) {
         LocalVo localvo=localProxy.findByReferenceLocal(referenceLocal);
         if(localvo == null ){
             return -1;
         }
         else {
        TauxTaxeSejour tauxTaxeSejour =tauxTaxeSejourService.findByRefCategorie(localvo.getRefCategorie());
        if(tauxTaxeSejour==null){
            return -2;
        }
        taxeSejourTrimestrielle.setAnnee(annee);
          taxeSejourTrimestrielle.setReferenceLocal(referenceLocal);
          double chiffreAffaire=new Double(localvo.getChiffreAffaire());
          double pourcentage=tauxTaxeSejour.getPourcentage();
          taxeSejourTrimestrielle.setMontantBase(chiffreAffaire*pourcentage);
    }
                  taxeSejourTrimestrielleDao.save(taxeSejourTrimestrielle);
                   return 1;
    }   

    public TaxeSejourTrimestrielleDao getTaxeSejourTrimestrielleDao() {
        return taxeSejourTrimestrielleDao;
    }

    public void setTaxeSejourTrimestrielleDao(TaxeSejourTrimestrielleDao taxeSejourTrimestrielleDao) {
        this.taxeSejourTrimestrielleDao = taxeSejourTrimestrielleDao;
    }
    
    
    public TaxeSejourTrimestrielle getTaxeSejourTrimestrielle() {
        return taxeSejourTrimestrielle;
    }

    public void setTaxeSejourTrimestrielle(TaxeSejourTrimestrielle taxeSejourTrimestrielle) {
        this.taxeSejourTrimestrielle = taxeSejourTrimestrielle;
    }
    

    public LocalProxy getLocalProxy() {
        return localProxy;
    }

    public void setLocalProxy(LocalProxy localProxy) {
        this.localProxy = localProxy;
    }

    public TauxTaxeSejourService getTauxTaxeSejourService() {
        return tauxTaxeSejourService;
    }

    public void setTauxTaxeSejourService(TauxTaxeSejourService tauxTaxeSejourService) {
        this.tauxTaxeSejourService = tauxTaxeSejourService;
    } 
}
