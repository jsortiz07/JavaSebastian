/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;





/**
 *
 * @author nitro
 */
public class Conexion {
    Connection con;
    public Conexion (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personas?","root","");
            
        }catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
