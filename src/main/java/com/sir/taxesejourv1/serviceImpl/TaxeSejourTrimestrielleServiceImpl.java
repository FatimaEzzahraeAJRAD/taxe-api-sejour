/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.serviceImpl;

import com.sir.taxesejourV1.util.DateUtil;
import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.bean.TaxeSejourTrimestrielle;
import com.sir.taxesejourv1.dao.TaxeSejourTrimestrielleDao;
import com.sir.taxesejourv1.rest.exchage.vo.LocalVo;
import com.sir.taxesejourv1.rest.proxy.LocalProxy;
import com.sir.taxesejourv1.service.TauxTaxeSejourService;
import com.sir.taxesejourv1.service.TaxeSejourTrimestrielleService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jawadoo
 */
@Service
public class TaxeSejourTrimestrielleServiceImpl implements TaxeSejourTrimestrielleService {

    @Autowired
    private TaxeSejourTrimestrielleDao taxeSejourTrimestrielleDao;
    @Autowired
    private TauxTaxeSejourService tauxTaxeSejourService;
    @Autowired
    private LocalProxy localProxy;
    
    

    @Override
    public int creertaxe(TaxeSejourTrimestrielle taxesejourTrimestrielle, String referenceLocal) {
        TaxeSejourTrimestrielle t = findTaxeTrimestrielleByNumeroTrimesterAndAnnee(taxesejourTrimestrielle.getNumeroTrimester(), taxesejourTrimestrielle.getAnnee());
        if (t != null) {
             System.out.println("-- version 1");
            return -1;
        } else {
            long nbMoisRetard = calculeNbrMoisRetard(taxesejourTrimestrielle);  
            taxesejourTrimestrielle.setNomberMoisRetard(nbMoisRetard);
            long moisRetard = taxesejourTrimestrielle.getNomberMoisRetard();
             LocalVo localvo = localProxy.findByReferenceLocal(referenceLocal);
          TauxTaxeSejour tauxTaxeSejour = tauxTaxeSejourService.findByCategorieLibelle(localvo.getLebelle());
            Double montantBase = taxesejourTrimestrielle.getChiffreAffaire() *tauxTaxeSejour.getPourcentage()/100;
            taxesejourTrimestrielle.setMontantBase(montantBase);
 System.out.println("-- version 2");
            if (moisRetard == 0) {
                taxesejourTrimestrielle.setMontantTaxe(montantBase);
                taxeSejourTrimestrielleDao.save(taxesejourTrimestrielle);
                 System.out.println("-- version 3");
                return 1;
            } else {
                taxesejourTrimestrielle.setMontantMajoration(montantBase * 10 / 100);
                if (moisRetard == 1) {
                    taxesejourTrimestrielle.setMontantTaxe(montantBase + taxesejourTrimestrielle.getMontantMajoration());
                    taxeSejourTrimestrielleDao.save(taxesejourTrimestrielle);
                     System.out.println("-- version 4");
                    return 2;
                } else {
                    taxesejourTrimestrielle.setMontantPenalite(montantBase * moisRetard * 5 / 100);
                    taxesejourTrimestrielle.setMontantTaxe(montantBase + taxesejourTrimestrielle.getMontantMajoration() + taxesejourTrimestrielle.getMontantPenalite());
                    taxeSejourTrimestrielleDao.save(taxesejourTrimestrielle);
                     System.out.println("-- version 5");
                    return 3;
                }
                
            }
        }
    }

    private long calculeNbrMoisRetard(TaxeSejourTrimestrielle taxesejourTrimestrielle) {
        long mois = 1000 * 60 * 60 * 24 * 30;           //un mois est contient combient de ms
        Date toDay = new Date();
        long val =toDay.getTime() - taxesejourTrimestrielle.getDatePresentation().getTime()  ;
        long nbMoisRetard = val / mois;
        return nbMoisRetard;
    }

//    @Override
//    public int saveTaxe(Long annee, String referenceLocal) {
//        LocalVo localvo = localProxy.findByReferenceLocal(referenceLocal);
//        if (localvo == null) {
//            return -1;
//        } else {
//            TauxTaxeSejour tauxTaxeSejour = tauxTaxeSejourService.findByCategorieLibelle(localvo.getLebelle());
//            if (tauxTaxeSejour == null) {
//                return -2;
//            }
//            taxeSejourTrimestrielle.setAnnee(annee);
//            taxeSejourTrimestrielle.setReferenceLocal(referenceLocal);
//            double chiffreAffaire = new Double(localvo.getChiffreAffaire());
//            double pourcentage = tauxTaxeSejour.getPourcentage();
//            taxeSejourTrimestrielle.setMontantBase(chiffreAffaire * pourcentage);
//        }
//        taxeSejourTrimestrielleDao.save(taxeSejourTrimestrielle);
//        return 1;
//    }
    @Override
    public TaxeSejourTrimestrielle findTaxeTrimestrielleByNumeroTrimesterAndAnnee(int numeroTrimestre, int annee) {
        return taxeSejourTrimestrielleDao.findTaxeTrimestrielleByNumeroTrimesterAndAnnee(numeroTrimestre, annee);
    }

    public TaxeSejourTrimestrielleDao getTaxeSejourTrimestrielleDao() {
        return taxeSejourTrimestrielleDao;
    }

    public void setTaxeSejourTrimestrielleDao(TaxeSejourTrimestrielleDao taxeSejourTrimestrielleDao) {
        this.taxeSejourTrimestrielleDao = taxeSejourTrimestrielleDao;
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
