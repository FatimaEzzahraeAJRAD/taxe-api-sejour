/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.converter;

import com.sir.taxesejourv1.bean.TaxeSejourTrimestrielle;
import com.sir.taxesejourv1.rest.vo.TaxeSejourTrimestrielleVo;
import com.sir.taxesejourv1.util.NumberUtil;
import java.util.Date;
import com.sir.taxesejourV1.util.DateUtil;
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
            item.setAnnee(NumberUtil.toIneger(vo.getAnnee()));
            item.setChiffreAffaire(NumberUtil.toDouble(vo.getChiffreAffaire()));
            item.setDatePresentation(DateUtil.parseYYYYMMDDmmhhSS(vo.getDatePresentation()));
            item.setMontantBase(NumberUtil.toDouble(vo.getMontantBase()));
            item.setMontantMajoration( NumberUtil.toDouble(vo.getMontantMajoration()));
            item.setMontantPenalite(NumberUtil.toDouble(vo.getMontantMajoration()));
            item.setMontantTaxe(NumberUtil.toDouble(vo.getMontantTaxe()));
            item.setNomberMoisRetard(NumberUtil.toIneger(vo.getNomberMoisRetard()));
            item.setNumeroTrimester(NumberUtil.toIneger(vo.getNumeroTrimester()));
            item.setReferenceLocal(vo.getReferenceLocal());
            item.setReference(vo.getReference());
            return item;
        }
    }

    @Override
    public TaxeSejourTrimestrielleVo toVo(TaxeSejourTrimestrielle item) {
        if (item == null) {
            return null;
        } else {
            TaxeSejourTrimestrielleVo vo = new TaxeSejourTrimestrielleVo();
            vo.setId(vo.getId());
            vo.setAnnee(NumberUtil.toStringInt(item.getAnnee()));
            vo.setChiffreAffaire(NumberUtil.toStringDouble(item.getChiffreAffaire()));
            vo.setDatePresentation(DateUtil.formatYYYYMMDDmmhhSS(item.getDatePresentation()));
            vo.setMontantBase(NumberUtil.toStringDouble(item.getMontantBase()));
            vo.setMontantMajoration(NumberUtil.toStringDouble(item.getMontantMajoration()));
            vo.setMontantPenalite(NumberUtil.toStringDouble(item.getMontantMajoration()));
            vo.setMontantTaxe(NumberUtil.toStringDouble(item.getMontantTaxe()));
            vo.setNomberMoisRetard(NumberUtil.toStringLong(item.getNomberMoisRetard()));
            vo.setNumeroTrimester(NumberUtil.toStringInt(item.getNumeroTrimester()));
            vo.setReferenceLocal(item.getReferenceLocal());
            vo.setTaxeSejourAnnuelleVO(new TaxeSejourAnnuelleConverter().toVo(item.getTaxeSejourAnnuelle()));
            vo.setReference(item.getReference());
            return vo;
        }
    }
    }

