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
public class Propietario {
    private int pro_id = 0;
    private String pro_nombre = "";
    private String pro_apellidos = "";
    
    public Propietario() {
    }
    
    public Propietario(int pro_id, String pro_nombre, String pro_apellidos){
        this.pro_id = pro_id;
        this.pro_nombre = this.pro_nombre;
        this.pro_apellidos = this.pro_apellidos;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_apellidos() {
        return pro_apellidos;
    }

    public void setPro_apellidos(String pro_apellidos) {
        this.pro_apellidos = pro_apellidos;
    }
    
    @Override
    public String toString() {
        return "Propietario{" + "pro_id=" + pro_id + ", pro_nombre=" + pro_nombre + ", pro_apellidos=" + pro_apellidos + '}';
    }
}
