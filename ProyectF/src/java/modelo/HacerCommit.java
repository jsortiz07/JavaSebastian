/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 *
 * @author nitro
 */
public class HacerCommit implements Operaciones{
    
    Conexion cone = new Conexion();
    Connection con;
    PreparedStatement ps;
    InsertarDatos p = new InsertarDatos();

    @Override
    public boolean add(InsertarDatos per) {
        String sql = "insert into persona(cedula,nombres,apellidos,fechana) values ('"+per.getCedula()+"','"+per.getNombres()+"','"+per.getApellido()+"','"+per.getFechanacimiento()+"')";
            try {
            con =cone.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Date mostrarEdad(Date edad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
