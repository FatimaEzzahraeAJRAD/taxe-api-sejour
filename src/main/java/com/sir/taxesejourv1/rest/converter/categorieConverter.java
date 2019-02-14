/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.converter;

import com.sir.taxesejourv1.bean.Categorie;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jawadoo
 */
@Component
public class categorieConverter  extends AbstractConverter<Categorie, CategorieVo>{
    
     @Override
    public Categorie toItem(CategorieVo vo) {
        if (vo == null) {
            return null;
        } else {
            Categorie item = new Categorie();
            item.setId(vo.getId());
            item.setLibelle(vo.getLibelle());
            return item;
        }
    }
     @Override
    public CategorieVo toVo(Categorie item) {
        if (item == null) {
            return null;
        } else {
            CategorieVo vo = new CategorieVo();
            vo.setId(item.getId());
            vo.setLibelle(item.getLibelle());
            return vo;
        }
    }
    
}
