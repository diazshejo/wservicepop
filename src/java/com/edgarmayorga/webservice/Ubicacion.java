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
public class Ubicacion {
    private int codigoComedor = 0;
    private String nombreComedor = "";
    private String numeroTelefono = "";
    private byte[] imagenComedor = null;
    private String latitud = "";
    private String longitud = "";
    
    public Ubicacion(){
        
    }
    
    public Ubicacion(int codigoComedor, String nombreComedor, String numeroTelefono, byte[] imagenComedor, String latitud, String longitud){
        this.codigoComedor = codigoComedor;
        this.nombreComedor = nombreComedor;
        this.numeroTelefono = numeroTelefono;
        this.imagenComedor = imagenComedor;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    /**
     * @return the codigoComedor
     */
    public int getCodigoComedor() {
        return codigoComedor;
    }

    /**
     * @param codigoComedor the codigoComedor to set
     */
    public void setCodigoComedor(int codigoComedor) {
        this.codigoComedor = codigoComedor;
    }

    /**
     * @return the nombreComedor
     */
    public String getNombreComedor() {
        return nombreComedor;
    }

    /**
     * @param nombreComedor the nombreComedor to set
     */
    public void setNombreComedor(String nombreComedor) {
        this.nombreComedor = nombreComedor;
    }

    /**
     * @return the numeroTelefono
     */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * @param numeroTelefono the numeroTelefono to set
     */
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * @return the imagenComedor
     */
    public byte[] getImagenComedor() {
        return imagenComedor;
    }

    /**
     * @param imagenComedor the imagenComedor to set
     */
    public void setImagenComedor(byte[] imagenComedor) {
        this.imagenComedor = imagenComedor;
    }

    /**
     * @return the latitud
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
