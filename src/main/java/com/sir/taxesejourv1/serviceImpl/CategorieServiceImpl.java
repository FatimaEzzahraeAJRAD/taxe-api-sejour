/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.serviceImpl;

import com.sir.taxesejourv1.bean.Categorie;
import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.dao.CategorieDao;
import com.sir.taxesejourv1.dao.TauxTaxeSejourDao;
import com.sir.taxesejourv1.rest.proxy.LocalProxy;
import com.sir.taxesejourv1.service.CategorieService;
import com.sir.taxesejourv1.service.TauxTaxeSejourService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author user
 */
@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieDao categoriedao;
    @Autowired
    private CategorieService categorieService;
    @Autowired
    private TauxTaxeSejourDao tauxTaxeSejourDao;
    @Autowired
    private TauxTaxeSejourService tauxTaxeSejourService;
    @Autowired
    private LocalProxy localProxy;

    public int creer(Categorie categorie) {
        if(categorie==null){
            return -1;
        }
        else{
            categoriedao.save(categorie);
            return 1;
        }
    }
      @GetMapping("/")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }
    public void setTauxTaxeSejourService(TauxTaxeSejourService tauxTaxeSejourService) {
        this.tauxTaxeSejourService = tauxTaxeSejourService;
    }

    public void setLocalProxy(LocalProxy localProxy) {
        this.localProxy = localProxy;
    }

    public TauxTaxeSejourDao getTauxTaxeSejourDao() {
        return tauxTaxeSejourDao;
    }

    public void setTauxTaxeSejourDao(TauxTaxeSejourDao tauxTaxeSejourDao) {
        this.tauxTaxeSejourDao = tauxTaxeSejourDao;
    }

    public CategorieDao getCategoriedao() {
        return categoriedao;
    }

    public void setCategoriedao(CategorieDao categoriedao) {
        this.categoriedao = categoriedao;
    }

    public LocalProxy getLocalProxy() {
        return localProxy;
    }

    public TauxTaxeSejourService getTauxTaxeSejourService() {
        return tauxTaxeSejourService;
    }


    public CategorieService getCategorieService() {
        return categorieService;
    }

    public void setCategorieService(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    
}
