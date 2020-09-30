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
public class Menu {
    private int idComedor = 0;
    private String nombreComedor = "";
    private String telefonoComedor = "";
    private byte[] logoComedor = null;
    private int idMenu = 0;
    private String nombreMenu = "";
    private String descripcionMenu = "";
    private byte[] imagenMenu = null;
    private String precioMenu = "";
    private int idCategoria = 0;
    private String nombreCategoria = "";

    public Menu(int idComedor, String nombreComedor, String telefonoComedor, byte[] logoComedor, int idMenu, String nombreMenu, String descripcionMenu, byte[] imagenMenu, String precioMenu, int idCategoria, String nombreCategoria) {
        this.idComedor = idComedor;
        this.nombreComedor = nombreComedor;
        this.telefonoComedor = telefonoComedor;
        this.logoComedor = logoComedor;
        this.idMenu = idMenu;
        this.nombreMenu = nombreMenu;
        this.descripcionMenu = descripcionMenu;
        this.imagenMenu = imagenMenu;
        this.precioMenu = precioMenu;
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdComedor() {
        return idComedor;
    }

    public void setIdComedor(int idComedor) {
        this.idComedor = idComedor;
    }

    public String getNombreComedor() {
        return nombreComedor;
    }

    public void setNombreComedor(String nombreComedor) {
        this.nombreComedor = nombreComedor;
    }

    public String getTelefonoComedor() {
        return telefonoComedor;
    }

    public void setTelefonoComedor(String telefonoComedor) {
        this.telefonoComedor = telefonoComedor;
    }

    public byte[] getLogoComedor() {
        return logoComedor;
    }

    public void setLogoComedor(byte[] logoComedor) {
        this.logoComedor = logoComedor;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getDescripcionMenu() {
        return descripcionMenu;
    }

    public void setDescripcionMenu(String descripcionMenu) {
        this.descripcionMenu = descripcionMenu;
    }

    public byte[] getImagenMenu() {
        return imagenMenu;
    }

    public void setImagenMenu(byte[] imagenMenu) {
        this.imagenMenu = imagenMenu;
    }

    public String getPrecioMenu() {
        return precioMenu;
    }

    public void setPrecioMenu(String precioMenu) {
        this.precioMenu = precioMenu;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
