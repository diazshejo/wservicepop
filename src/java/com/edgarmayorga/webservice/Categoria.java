/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edgarmayorga.webservice;

/**
 *
 * @author ZReti
 */
public class Categoria {
    private int cat_id = 0;
    private String cat_nombre = "";
    
    public Categoria() {
    }
    
    public Categoria(int cat_id, String cat_nombre){
        this.cat_id = cat_id;
        this.cat_nombre = cat_nombre;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id; 
    }

    public String getCat_nombre() {
        return cat_nombre;
    }

    public void setCat_nombre(String cat_nombre) {
        this.cat_nombre = cat_nombre;
    }
}
