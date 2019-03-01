/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.converter;

import com.sir.taxesejourv1.bean.Local;
import com.sir.taxesejourv1.common.util.NumberUtil;
import com.sir.taxesejourv1.rest.converter.AbstractConverter;
import com.sir.taxesejourv1.rest.vo.LocalVo;
import org.springframework.stereotype.Component;



/**
 *
 * @author YOUNES
 */
@Component
public class LocalConverter extends AbstractConverter<Local, LocalVo>{

    @Override
    public Local toItem(LocalVo vo) {
          
        if (vo != null) {
            Local item = new Local();
             
              if(vo.getId()!=null){
                item.setId(vo.getId());
            }
            if (vo.getReference()!= null) {
                item.setReference(vo.getReference());
            }
           
            if (vo.getDernierMontantPaye()!= null) {
                item.setDernierMontantPaye(NumberUtil.toBigDecimal(vo.getDernierMontantPaye()));
            }
            if (vo.getDernierAnneePaye()!= null) {
                item.setDernierAnneePaye(NumberUtil.toBigDecimal(vo.getDernierAnneePaye()));
            } 
            if (vo.getDernierTrimestrePaye()!= null) {
                item.setDernierTrimestrePaye(NumberUtil.toBigDecimal(vo.getDernierTrimestrePaye()));
            }
            if(vo.getCategorie()!= null){
                item.setCategorie( new categorieConverter().toItem(vo.getCategorie()));
            }      
            if(vo.getSurface()!= null){
                item.setSurface(NumberUtil.toBigDecimal(vo.getSurface()));
            }
            return item;
        }
        return null;
    }

    @Override
    public LocalVo toVo(Local item) {
          if (item != null) {
            LocalVo vo = new LocalVo();
             
              if(item.getId()!=null){
                vo.setId(vo.getId());
            }
            if (item.getReference()!= null) {
                vo.setReference(item.getReference());
            }
           
            if (item.getDernierMontantPaye()!= null) {
                vo.setDernierMontantPaye(NumberUtil.toStringDouble(item.getDernierMontantPaye()));
            }
            if (item.getDernierAnneePaye()!= null) {
                vo.setDernierAnneePaye(NumberUtil.toStringDouble(item.getDernierAnneePaye()));
            } 
            if (item.getDernierTrimestrePaye()!= null) {
                vo.setDernierTrimestrePaye(NumberUtil.toStringDouble(item.getDernierTrimestrePaye()));
            }
            if(item.getCategorie()!= null){
                vo.setCategorie( new categorieConverter().toVo(item.getCategorie()));
            }      
            if(item.getSurface()!= null){
                vo.setSurface(NumberUtil.toString(item.getSurface()));
            }
            return vo;
        }
        return null;
    }

    

}
