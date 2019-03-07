/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.converter;

import com.sir.taxesejourv1.bean.TaxeSejourAnnuelle;
import com.sir.taxesejourv1.rest.vo.TaxeSejourAnnuelleVo;
import com.sir.taxesejourv1.util.NumberUtil;
import java.util.Date;
import com.sir.taxesejourV1.util.DateUtil;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jawadoo
 */
@Component
public class TaxeSejourAnnuelleConverter extends AbstractConverter<TaxeSejourAnnuelle, TaxeSejourAnnuelleVo>{
    @Override
    public TaxeSejourAnnuelle toItem(TaxeSejourAnnuelleVo vo) {
        if (vo == null) {
            return null;
        } else {
            TaxeSejourAnnuelle item = new TaxeSejourAnnuelle();
            item.setId(vo.getId());
            item.setAnnee(new Long(vo.getAnnee()));
            item.setChiffreAffaire(NumberUtil.toDouble(vo.getChiffreAffaire()));
            item.setDatePresentation(new Date(vo.getDatePresentation()));
            item.setMontantBase(NumberUtil.toDouble(vo.getMontantBase()));
            item.setMontantMajoration(NumberUtil.toDouble(vo.getMontantMajoration()));
            item.setMontantPenalite(NumberUtil.toDouble(vo.getMontantMajoration()));
            item.setNomberMoisRetard( NumberUtil.toIneger(vo.getNomberMoisRetard()));
            item.setNumeroTrimester(NumberUtil.toIneger(vo.getNumeroTrimester()));
            item.setMontantTaxe(NumberUtil.toDouble(vo.getMontantTaxe()));
            item.setTaxeSejourTrimestrielles(new TaxeSejourTrimestrielleConverter().toItem(vo.getTaxeSejourTrimestriellesVo()));
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
            vo.setAnnee(NumberUtil.toStringLong(item.getAnnee()));
            vo.setChiffreAffaire(NumberUtil.toStringDouble(item.getChiffreAffaire()));
            vo.setDatePresentation(DateUtil.formatYYYYMMDDmmhhSS(item.getDatePresentation()));
            vo.setMontantBase(NumberUtil.toStringDouble(item.getMontantBase()));
            vo.setMontantMajoration(NumberUtil.toStringDouble(item.getMontantMajoration()));
            vo.setMontantPenalite(NumberUtil.toStringDouble(item.getMontantMajoration()));
            vo.setMontantTaxe(NumberUtil.toStringDouble(item.getMontantTaxe()));
            vo.setNomberMoisRetard(NumberUtil.toStringInt(item.getNomberMoisRetard()));
            vo.setNumeroTrimester(NumberUtil.toStringInt(item.getNumeroTrimester()));
            vo.setTaxeSejourTrimestriellesVo(new TaxeSejourTrimestrielleConverter().toVo(item.getTaxeSejourTrimestrielles()));
            return vo;
        }
    }
}