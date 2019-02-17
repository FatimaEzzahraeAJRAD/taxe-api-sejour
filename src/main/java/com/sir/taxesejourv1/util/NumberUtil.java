/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.util;

import java.math.BigDecimal;

/**
 *
 * @author YOUNES
 */
public class NumberUtil {
    private static final String CHAINE_VIDE="";
    private static final Double ZERO_DOUBLE = 0D; 
    private static final Integer ZERO_INTEGER = 0; 
    
    public static BigDecimal toBigDecimal(String value){
        if(value==null || value.isEmpty()){
            return BigDecimal.ZERO;
        }else{
            return new BigDecimal(value);
        }
    }
    public static String toStringInt(int value){
        if(value==0){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
    public static String toStringDouble(Double value){
        if(value==0){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
    public static String toStringLong(Long value){
        if(value==0){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
     public static Double toDouble(String value){
        if(value==null || value.isEmpty()){
            return ZERO_DOUBLE;
        }else{
            return Double.parseDouble(value);
        }
    }
     public static Integer toIneger(String value){
        if(value==null || value.isEmpty()){
            return ZERO_INTEGER;
        }else{
            return Integer.parseInt(value);
        }
    }
    
}
