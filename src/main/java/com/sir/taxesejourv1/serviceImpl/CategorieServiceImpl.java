/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.serviceImpl;

import com.sir.taxesejourv1.bean.Categorie;
import com.sir.taxesejourv1.dao.CategorieDao;
import com.sir.taxesejourv1.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class CategorieServiceImpl implements CategorieService{

    @Autowired
    CategorieDao categoriedao;
    
    @Override
    public Categorie findByReference(String reference) {
        return categoriedao.findByReference(reference);
    }

    @Override
    public int creer(Categorie categorie) {
        Categorie c= findByReference(categorie.getRefrenceLocal());
        if(c!=null){
            return -1;
        }else{
            categoriedao.save(categorie);
            return 1;
        }
    }

    public CategorieDao getCategoriedao() {
        return categoriedao;
    }

    public void setCategoriedao(CategorieDao categoriedao) {
        this.categoriedao = categoriedao;
    }
   
}
