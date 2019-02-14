/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.converter;

import com.sir.taxesejourv1.bean.TaxeSejourAnnuelle;
import com.sir.taxesejourv1.bean.TaxeSejourTrimestrielle;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jawadoo
 */
@Component
public class TaxeSejourTrimestrielleConverter extends AbstractConverter<TaxeSejourTrimestrielle, TaxeSejourTrimestrielleVo>{
    
    @Override
    public TaxeSejourTrimestrielle toItem(TaxeSejourTrimestrielleVo vo) {
        if (vo == null) {
            return null;
        } else {
            TaxeSejourTrimestrielle item = new TaxeSejourTrimestrielle();
            item.setId(vo.getId());
            item.setAnnee(vo.getAnnee());
            item.setChiffreAffaire(vo.getChiffreAffaire());
            item.setDatePresentation(vo.getDatePresentation());
            item.setMontantBase(vo.getMontantBase());
            item.setMontantMajoration(vo.getMontantMajoration());
            item.setMontantPenalite(vo.getMontantMajoration());
            item.setMontantTaxe(vo.getMontantTaxe());
            item.setNomberMoisRetard(vo.getNomberMoisRetard());
            item.setNumeroTrimester(vo.getNumeroTrimester());
            item.setReferenceLocal(vo.getReferenceLocal());
            item.setTaxeSejourAnnuelle(new TaxeSejourTrimestrielleConverter().toItem(vo.getTaxeSejourAnnuelle()));
            return item;
        }
    }
    @Override
    public TaxeSejourTrimestrielleVo toItem(TaxeSejourTrimestrielle item) {
        if (item == null) {
            return null;
        } else {
            TaxeSejourTrimestrielleVo vo = new TaxeSejourTrimestrielleVo();
            vo.setId(item.getId());
            vo.setAnnee(item.getAnnee());
            vo.setChiffreAffaire(item.getChiffreAffaire());
            vo.setDatePresentation(item.getDatePresentation());
            vo.setMontantBase(item.getMontantBase());
            vo.setMontantMajoration(item.getMontantMajoration());
            vo.setMontantPenalite(item.getMontantMajoration());
            vo.setMontantTaxe(item.getMontantTaxe());
            vo.setNomberMoisRetard(item.getNomberMoisRetard());
            vo.setNumeroTrimester(item.getNumeroTrimester());
            vo.setReferenceLocal(item.getReferenceLocal());
            vo.setTaxeSejourAnnuelle(new TaxeSejourTrimestrielleConverter().toItem(item.getTaxeSejourAnnuelle()));
            return vo;
        }
    }
}
