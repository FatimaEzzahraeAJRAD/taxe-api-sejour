/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.service;

import com.sir.taxesejourv1.bean.Local;
import java.util.List;

/**
 *
 * @author user
 */
public interface LocalService {
     public List<Local> findByRedevableCin(String cin);
    public Local findByReference(String reference);
    //public Object[] creer(Local local);
    public List<Local> findAll();
    public Local creer(Local local);

}
