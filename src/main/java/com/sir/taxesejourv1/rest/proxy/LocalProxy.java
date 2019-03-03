/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.proxy;

import com.sir.taxesejourv1.rest.exchage.vo.LocalVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Jawadoo
 */
@FeignClient(name="microservice-adress-api",url="localhost:8090" )

public interface LocalProxy {
     @GetMapping("/taxe-api/local/reference/{reference}")
    public LocalVo findByReference(@PathVariable("reference") String reference);
//     @GetMapping("/adress-api-v1/Local/refCategorie/{refCategorie}")
//    public LocalVo findByRefCategorie(@PathVariable("refCategorie") String refCategorie);
    
}

