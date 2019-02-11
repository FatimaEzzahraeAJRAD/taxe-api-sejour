/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxesejourv1.service;

import com.sir.taxesejourv1.bean.Categorie;

/**
 *
 * @author user
 */
public  interface CategorieService {
        public Categorie findByReference(String reference);
        public int creer(Categorie categorie);
}
