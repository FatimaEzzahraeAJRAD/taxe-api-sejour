/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.proxy;

import com.sir.taxesejourv1.rest.exchage.vo.CategorieVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author lenovo
 */
@FeignClient(name="microservice-adress-api",url="localhost:8090" )
public interface CategorieProxy {
      @GetMapping("/refCategorie/{refCategorie}")
    public CategorieVo findByRefCategorie(@PathVariable("refCategorie") String refCategorie);
}
