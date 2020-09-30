/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edgarmayorga.webservice;

import java.sql.Connection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Edgar Mayorga
 */
@WebService(serviceName = "WService")
public class WService {

    private Connection conn = null;
    private Consulta consulta = null;
    private Categoria categoria = null;
    private ArrayList<Categoria> listaCategorias = null;
    private ArrayList<Comida> listaComidas = null;
    private ArrayList<Ubicacion> listaUbicaciones = null;
    private ArrayList<Menu> listaMenu = null;
    
    @WebMethod(action = "createAction", operationName = "obtenerCategorias")
    public ArrayList<Categoria> obtenerCategorias(@WebParam(name = "pOpcion") int pOpcion){
        listaCategorias = new ArrayList<Categoria>();
        consulta = new Consulta();
        
        try{
            listaCategorias = consulta.listaPropietarios(pOpcion);
        } catch(Exception ex){
            String mensaje = ex.getMessage();
            System.out.println("Error: " + mensaje);
        }
        
        return listaCategorias;
    }
    
    @WebMethod(action = "actionBusquedaComida", operationName = "listaComidasXBusqueda")
    public ArrayList<Comida> listaComidasXBusqueda(@WebParam(name = "pOpcion") int pOpcion, @WebParam(name = "pNombreComida") String pNombreComida, @WebParam(name = "pCodigoDia") int pCodigoDia){
        listaComidas = new ArrayList<Comida>();
        consulta = new  Consulta();
        
        try{
            listaComidas = consulta.listaComidaXBusqueda(pOpcion, pNombreComida, pCodigoDia);
        } catch(Exception ex){
            String mensaje = ex.getMessage();
            System.out.println("Error: " + mensaje);
        }
        return listaComidas;
    }
    
    @WebMethod(action = "actionUbicaciones", operationName = "listaUbicaciones")
    public ArrayList<Ubicacion> listaUbicaciones(@WebParam(name = "pOpcion") int pOpcion, @WebParam(name = "pCodigoPais") int pCodigoPais, @WebParam(name = "pCodigoDepartamento") int pCodigoDepartamento, @WebParam(name = "pCodigoMunicipio") int pCodigoMunicipio, @WebParam(name = "pCodigoZona") int pCodigoZona){
        listaUbicaciones = new ArrayList<Ubicacion>();
        consulta = new Consulta();
        
        try{
            listaUbicaciones = consulta.listaUbicaciones(pOpcion, pCodigoPais, pCodigoDepartamento, pCodigoMunicipio, pCodigoZona);
        } catch(Exception ex){
            String mensaje = ex.getMessage();
            System.out.println("Error: " + mensaje);
        }
        
        return listaUbicaciones;
    }
    
    @WebMethod(action = "actionMenusXComedorCategoria", operationName = "listaMenusXComedorCategoria")
    public ArrayList<Menu> listaMenusXComedorCategoria(@WebParam(name = "pOpcion") int pOpcion, @WebParam(name = "pCodigoComedor") int pCodigComedor, @WebParam(name = "pCodigoCategoria") int pCodigoCategoria, @WebParam(name = "pCodigoDia") int pCodigoDia){
        listaMenu = new ArrayList<>();
        consulta = new Consulta();
        
        try{
            listaMenu = consulta.listaMenu(pOpcion, pCodigComedor, pCodigoCategoria, pCodigoDia);
        } catch(Exception ex){
            String mensaje = ex.getMessage();
            System.out.println("Error: " + mensaje);
        }
        
        return listaMenu;  
    }
}
