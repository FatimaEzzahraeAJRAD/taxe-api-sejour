/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.converter;

import com.sir.taxesejourv1.bean.Categorie;
import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jawadoo
 */
@Component
public class TauxTaxeSejourConverter extends AbstractConverter<TauxTaxeSejour, TauxTaxeSejourVo> {
    
    @Override
    public TauxTaxeSejour toItem(TauxTaxeSejourVo vo) {
        if (vo == null) {
            return null;
        } else {
            TauxTaxeSejour item = new TauxTaxeSejour();
            item.setId(vo.getId());
            item.setPourcentage(vo.getPourcentage());
            item.setDateDebut(vo.getDateDebut());
            item.setDateFin(vo.getDateFin());
            item.setReferenceLocal(vo.getReferenceLocal());
            item.setCategorie(new categorieConverter().toItem(vo.getCategorie()));
            return item;
        }
    }
    @Override
    public TauxTaxeSejourVo toVo(TauxTaxeSejour item) {
        if (item == null) {
            return null;
        } else {
            TauxTaxeSejourVo vo = new TauxTaxeSejourVo();
            vo.setId(item.getId());
            vo.setPourcentage(item.getPourcentage());
            vo.setDateDebut(item.getDateDebut());
            vo.setDateFin(item.getDateFin());
            vo.setReferenceLocal(item.getReferenceLocal());
            vo.setCategorie(new categorieConverter().toVo(item.getCategorie()));
            return item;
        }
    }
}
