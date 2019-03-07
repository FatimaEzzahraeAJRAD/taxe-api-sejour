/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.serviceImpl;

import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.dao.TauxTaxeSejourDao;
import com.sir.taxesejourv1.service.TauxTaxeSejourService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jawadoo
 */
@Service
public class TauxTaxeSejourServiceImpl implements TauxTaxeSejourService {

    @Autowired
    private TauxTaxeSejourDao tauxTaxeSejourDao;
    
     @Override  //permet de trouver un taux d'aprés le refCategorie et date du taux 
    public TauxTaxeSejour findByRefCategorieAndDate(String refCategorie, Date date) {
               //        String query ="select t from TauxTrimestriel t where t.categorie.reference='"+refCategorie+"'and t.dateDebut.compareTo('"+date+"')<=0 and t.dateFint.compareTo('"+date+"')>=0";
//        return getSingleResult(query);
        List<TauxTaxeSejour> tauxTaxeSejours=findByRefCategorie(refCategorie);
        if(tauxTaxeSejours==null || tauxTaxeSejours.isEmpty()){
            return null;
        }else{
            for (TauxTaxeSejour tauxTaxeSejour : tauxTaxeSejours) {
                if(tauxTaxeSejour.getDateDebut().compareTo(date)<=0 && tauxTaxeSejour.getDateFin().compareTo(date)>=0){
                    return tauxTaxeSejour;
                }
            }
            return null;
        }    
    }
    
     
    
    
     @Override
    public List<TauxTaxeSejour> findByRefCategorie(String refCategorie) {
        return  tauxTaxeSejourDao.findByRefCategorie(refCategorie);
    }

    @Override
    public int saveTauxTaxeSejour(TauxTaxeSejour tauxTaxeSejour) {
        if(tauxTaxeSejour==null ){
            return -1;
        }else{
                tauxTaxeSejourDao.save(tauxTaxeSejour);
            return 1;
        }
    }
    
    
    public TauxTaxeSejourDao getTauxTaxeSejourDao() {
        return tauxTaxeSejourDao;
    }

    public void setTauxTaxeSejourDao(TauxTaxeSejourDao tauxTaxeSejourDao) {
        this.tauxTaxeSejourDao = tauxTaxeSejourDao;
    }

   

   
    }

    

    
    
   

