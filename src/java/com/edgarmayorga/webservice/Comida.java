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
public class Comida {
    private String nombre_comedor = "";
    private String nombre_categoria = "";
    private String nombre_platillo = "";
    private String descripcion_platillo = "";
    private String precio_platillo = "";
    private String numero_telefono = "";
    private byte[] imagen_platillo = null;
    private int com_id = 0;
    private int men_id = 0;
    private int cat_id = 0;

    public Comida(String nombre_comedor, String nombre_categoria, String nombre_platillo, String descripcion_platillo, String precio_platillo, String numero_telefono, byte[] imagen_platillo, int com_id, int men_id, int cat_id) {
        this.nombre_comedor = nombre_comedor;
        this.nombre_categoria = nombre_categoria;
        this.nombre_platillo = nombre_platillo;
        this.descripcion_platillo = descripcion_platillo;
        this.precio_platillo = precio_platillo;
        this.numero_telefono = numero_telefono;
        this.imagen_platillo = imagen_platillo;
        this.com_id = com_id;
        this.men_id = men_id;
        this.cat_id = cat_id;
    }
    
    public String getNombre_comedor() {
        return nombre_comedor;
    }

    public void setNombre_comedor(String nombre_comedor) {
        this.nombre_comedor = nombre_comedor;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getNombre_platillo() {
        return nombre_platillo;
    }

    public void setNombre_platillo(String nombre_platillo) {
        this.nombre_platillo = nombre_platillo;
    }

    public String getDescripcion_platillo() {
        return descripcion_platillo;
    }

    public void setDescripcion_platillo(String descripcion_platillo) {
        this.descripcion_platillo = descripcion_platillo;
    }

    public String getPrecio_platillo() {
        return precio_platillo;
    }
    
    public byte[] getImagen_platillo() {
        return imagen_platillo;
    }
    
    public void setImagen_platillo(byte[] imagen_platillo) {
        this.imagen_platillo = imagen_platillo;
    }
    
    public void setPrecio_platillo(String precio_platillo) {
        this.precio_platillo = precio_platillo;
    }
    
    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public int getMen_id() {
        return men_id;
    }

    public void setMen_id(int men_id) {
        this.men_id = men_id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    /**
     * @return the numero_telefono
     */
    public String getNumero_telefono() {
        return numero_telefono;
    }

    /**
     * @param numero_telefono the numero_telefono to set
     */
    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }
}
