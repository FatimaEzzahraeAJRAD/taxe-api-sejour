/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.converter;

import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.bean.TaxeSejourAnnuelle;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jawadoo
 */
@Component
public class TaxeSejourAnnuelleConcerter extends AbstractConverter<TaxeSejourAnnuelle, TaxeSejourAnnuelleVo>{
    @Override
    public TaxeSejourAnnuelle toItem(TaxeSejourAnnuelleVo vo) {
        if (vo == null) {
            return null;
        } else {
            TaxeSejourAnnuelle item = new TaxeSejourAnnuelle();
            item.setId(vo.getId());
            item.setAnnee(vo.getAnnee());
            item.setChiffreAffaire(vo.getChiffreAffaire());
            item.setDatePresentation(vo.getDatePresentation());
            item.setMontantBase(vo.getMontantBase());
            item.setMontantMajoration(vo.getMontantMajoration());
            item.setMontantPenalite(vo.getMontantMajoration());
            item.setNomberMoisRetard(vo.getNomberMoisRetard());
            item.setNumeroTrimester(vo.getNumeroTrimester());
            item.setMontantTaxe(vo.getMontantTaxe());
            item.setTaxeSejourTrimestrielles(new TaxeSejourTrimestrielleConverter.toItem(vo.getTaxeSejourTrimestrielles()));
            return item;
        }
    }
    @Override
    public TaxeSejourAnnuelleVo toVo(TaxeSejourAnnuelle item) {
        if (item == null) {
            return null;
        } else {
            TaxeSejourAnnuelleVo vo = new TaxeSejourAnnuelleVo();
            vo.setId(item.getId());
            vo.setAnnee(item.getAnnee());
            vo.setChiffreAffaire(item.getChiffreAffaire());
            vo.setDatePresentation(item.getDatePresentation());
            vo.setMontantBase(item.getMontantBase());
            vo.setMontantMajoration(item.getMontantMajoration());
            vo.setMontantPenalite(item.getMontantMajoration());
            item.setMontantTaxe(vo.getMontantTaxe());
            vo.setNomberMoisRetard(item.getNomberMoisRetard());
            vo.setNumeroTrimester(item.getNumeroTrimester());
            vo.setTaxeSejourTrimestrielles(new TaxeSejourTrimestrielleConverter.toItem(item.getTaxeSejourTrimestrielles()));
            return vo;
        }
    }
}
