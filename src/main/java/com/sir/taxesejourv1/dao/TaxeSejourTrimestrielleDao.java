/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.dao;

import com.sir.taxesejourv1.bean.TaxeSejourTrimestrielle;
import com.sir.taxesejourv1.rest.exchage.vo.LocalVo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jawadoo
 */
@Repository
public interface TaxeSejourTrimestrielleDao extends JpaRepository<TaxeSejourTrimestrielle, Long>{
     public TaxeSejourTrimestrielle findByReference(String reference);
     public List<TaxeSejourTrimestrielle> findByReferenceLocal(String referenceLocal);
     
     @Query("select t from TaxeSejourTrimestrielle t where t.annee= :annee and t.montantTaxe> :montantMin "
             + "and t.montantTaxe< :montantMax ")
      public List<TaxeSejourTrimestrielle> findByCriteria(@Param ("annee") Integer annee,
              @Param ("montantMin" )Integer montantMin,@Param ("montantMax") Integer montantMax);
}
