/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edgarmayorga.webservice;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ZReti
 */
public class Conexion {
    public Connection cadena_conexion(){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conn = DriverManager.getConnection("jdbc:sqlserver://MAYORGA-ASUSPC; databaseName=DIGITALPERSONA4500", "sa", "@ndroid9779");
            conn = DriverManager.getConnection("jdbc:sqlserver://homelands.database.windows.net; databaseName=homeland", "miners", "Fedora14");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return conn;
    }
}
