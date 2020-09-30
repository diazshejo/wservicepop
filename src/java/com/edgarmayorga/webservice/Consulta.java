/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edgarmayorga.webservice;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ZReti
 */
public class Consulta {
    private Conexion conn = new Conexion();
    private Connection conexion = null;
    private Propietario propietario = null;
    private Comida comida = null;
    private Categoria categoria = null;
    private Ubicacion ubicacion = null;
    private Menu menu = null;
    private ArrayList<Categoria> listaCategoria = null;
    private ArrayList<Comida> listaComida = null;
    private ArrayList<Ubicacion> listaUbicaciones = null;
    private ArrayList<Menu> listaMenu = null;
    
    public Consulta(){
        //conn = cadena_conexion();
    }
    
    public ArrayList<Categoria> listaPropietarios(int opcion){
        listaCategoria = new ArrayList<>();
        Statement st = null;
        CallableStatement cs = null;
        ResultSet rs = null;
                
        try{
            conexion = conn.cadena_conexion();
            String sql = "{CALL sp_obtener_categorias(?)}";
            cs = conexion.prepareCall(sql);
            cs.setInt(1, opcion);
            cs.execute();
            
            rs = cs.getResultSet();
            while(rs.next()){
                int cat_id = rs.getInt("cat_id");
                String cat_nombre = rs.getString("cat_nombre");
                
                categoria = new Categoria(cat_id, cat_nombre);
                listaCategoria.add(categoria);
            }
        } catch(Exception ex){

        };
        
        return listaCategoria;
    }
    
    public ArrayList<Comida> listaComidaXBusqueda(int opcion, String nombreComida, int codigoDia){
        listaComida = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;
        String nombre_comedor = "";
        String nombre_categoria = "";
        String nombre_platillo = "";
        String descripcion_platillo = "";
        String precio_platillo = "";
        String numero_telefono = "";
        Blob imagenDB = null;
        byte[] imagen_platillo = null;
        int com_id = 0;
        int men_id = 0;
        int cat_id = 0;
                
        try{
            conexion = conn.cadena_conexion();
            String sql = "{CALL sp_obtener_comidas_x_busqueda(?,?,?)}";
            cs = conexion.prepareCall(sql);
            cs.setInt(1, opcion);
            cs.setString(2, nombreComida);
            cs.setInt(3, codigoDia);
            cs.execute();
            
            rs = cs.getResultSet();
            while(rs.next()){
                nombre_comedor = rs.getString("comedor");
                nombre_categoria = rs.getString("nombre_categoria");
                nombre_platillo = rs.getString("platillo");
                descripcion_platillo = rs.getString("descripcion_platillo");
                precio_platillo = rs.getString("precio_platillo");
                numero_telefono = rs.getString("telefono");
                imagenDB = rs.getBlob("imagen_platillo");
                imagen_platillo = imagenDB.getBytes(1, (int)imagenDB.length());
                com_id = rs.getInt("com_id");
                men_id = rs.getInt("men_id");
                cat_id = rs.getInt("cat_id");
                
                comida = new Comida(nombre_comedor, nombre_categoria, nombre_platillo, descripcion_platillo, precio_platillo, numero_telefono, imagen_platillo, com_id, men_id, cat_id);
                listaComida.add(comida);
            }
        } catch(Exception ex){
            String mensaje = ex.getMessage();
            System.out.println("Error: " + mensaje);
        };
        
        return listaComida;
    }
    
    public ArrayList<Ubicacion> listaUbicaciones(int opcion, int codigoPais, int codigoDepartamento, int codigoMunicipio, int codigoZona){
        listaUbicaciones = new ArrayList<Ubicacion>();
        CallableStatement cs = null;
        ResultSet rs = null;
        int codigoComedor = 0;
        String nombreComedor = "";
        String numeroTelefono = "";
        Blob imagenDB = null;
        byte[] imagenComedor = null;
        String latitud = "";
        String longitud = "";
        
        try{
            conexion = conn.cadena_conexion();
            String sql = "{CALL sp_obtener_ubicaciones(?,?,?,?,?)}";
            cs = conexion.prepareCall(sql);
            cs.setInt(1, opcion);
            cs.setInt(2, codigoPais);
            cs.setInt(3, codigoDepartamento);
            cs.setInt(4, codigoMunicipio);
            cs.setInt(5, codigoZona);
            cs.execute();
            
            rs = cs.getResultSet();
            while(rs.next()){
                codigoComedor = rs.getInt("com_id");
                nombreComedor = rs.getString("com_nombre");
                numeroTelefono = rs.getString("com_telefono");
                imagenDB = rs.getBlob("com_logo");
                imagenComedor = imagenDB.getBytes(1, (int)imagenDB.length());
                /*if(rs.getBlob("com_logo") != null){
                    
                } else{
                    imagenComedor = null;
                }*/
                latitud = rs.getString("com_latitud");
                longitud = rs.getString("com_longitud");
                
                ubicacion = new Ubicacion(codigoComedor, nombreComedor, numeroTelefono, imagenComedor, latitud, longitud);
                listaUbicaciones.add(ubicacion);
            }
        } catch(Exception ex){
            String mensaje = ex.getMessage();
            System.out.println("Error: " + mensaje);
        }
        
        return listaUbicaciones;
    }
    
    public ArrayList<Menu> listaMenu(int opcion, int pidComedor, int pidCategoria, int pCodigoDia){
        listaMenu = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;
        int idComedor = 0;
        String nombreComedor = "";
        String telefonoComedor = "";
        byte[] logoComedor = null;
        int idMenu = 0;
        String nombreMenu = "";
        String descripcionMenu = "";
        byte[] imagenMenu = null;
        String precioMenu = "";
        int idCategoria = 0;
        String nombreCategoria = "";
        Blob imagenDBLogo = null;
        Blob imagenDBMenu = null;
        
        try{
            conexion = conn.cadena_conexion();
            String sql = "{CALL sp_ObtenerMenuXComedorCategoria(?,?,?,?)}";
            cs = conexion.prepareCall(sql);
            cs.setInt(1, opcion);
            cs.setInt(2, pidComedor);
            cs.setInt(3, pidCategoria);
            cs.setInt(4, pCodigoDia);
            cs.execute();
            
            rs = cs.getResultSet();
            while(rs.next()){
                idComedor = rs.getInt("idComedor");
                nombreComedor = rs.getString("comedorNombre");
                telefonoComedor = rs.getString("comedorTelefono");
                imagenDBLogo = rs.getBlob("comedorLogo");
                logoComedor = imagenDBLogo.getBytes(1, (int)imagenDBLogo.length());
                idMenu = rs.getInt("idMenu");
                nombreMenu = rs.getString("menuNombre");
                descripcionMenu = rs.getString("menuDescripcion");
                imagenDBMenu = rs.getBlob("menuImagen");
                imagenMenu = imagenDBMenu.getBytes(1, (int)imagenDBMenu.length());
                precioMenu = rs.getString("menuPrecio");
                idCategoria = rs.getInt("idCategoria");
                nombreCategoria = rs.getString("categoriaNombre");
                
                menu = new Menu(idComedor, nombreComedor, telefonoComedor, logoComedor, idMenu, nombreMenu, descripcionMenu, imagenMenu, precioMenu, idCategoria, nombreCategoria);
                listaMenu.add(menu);
            }
        } catch(Exception ex){
            String mensaje = ex.getMessage();
            System.out.println("Error: " + mensaje);
        }
        
        return listaMenu;
    }
}
