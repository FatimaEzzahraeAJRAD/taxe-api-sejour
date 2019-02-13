/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.rest.proxy;

import com.sir.taxesejourv1.rest.vo.LocalVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Jawadoo
 */
@FeignClient(name="microservice3-commande",url="localhost:8099" )

public interface LocalProxy {
     @GetMapping("/adress-api-v1/Local/referenceLocal/{referenceLocal}")
    public LocalVo findByReferenceLocal(@PathVariable("referenceLocal") String referenceLocal);
     @GetMapping("/adress-api-v1/Local/refCategorie/{refCategorie}")
    public LocalVo findByRefCategorie(@PathVariable("refCategorie") String refCategorie);
}
