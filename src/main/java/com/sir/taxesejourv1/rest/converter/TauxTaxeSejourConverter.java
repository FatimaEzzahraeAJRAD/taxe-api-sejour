/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.converter;

import com.sir.taxesejourv1.bean.TauxTaxeSejour;
import com.sir.taxesejourv1.rest.vo.TauxTaxeSejourVo;
import com.sir.taxesejourv1.util.NumberUtil;
import java.util.Date;
import com.sir.taxesejourV1.util.DateUtil;
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
            item.setPourcentage(NumberUtil.toDouble(vo.getPourcentage()));
            item.setDateDebut(DateUtil.parseYYYYMMDDmmhhSS(vo.getDateDebut()));
            item.setDateFin(DateUtil.parseYYYYMMDDmmhhSS(vo.getDateFin()));
            item.setReferenceLocal(vo.getReferenceLocal());
            item.setRefCategorie(vo.getRefCategorie());
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
            vo.setPourcentage(NumberUtil.toStringDouble(item.getPourcentage()));
          vo.setDateDebut(DateUtil.formatYYYYMMDDmmhhSS(item.getDateDebut()));
          vo.setDateFin(DateUtil.formatYYYYMMDDmmhhSS(item.getDateFin()));
            vo.setReferenceLocal(item.getReferenceLocal());
            vo.setRefCategorie(item.getRefCategorie());
            return vo;
        }
    }
}
