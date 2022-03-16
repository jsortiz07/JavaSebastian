/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardiologia;

/**
 *
 * @author nitro
 */
public abstract class Personas {
    int identificacion;
     String nombre;
     String apellido;
     String horario; 

    public Personas(int documento , String nombre, String apellido, String horario) {
        identificacion =documento;
        nombre =nombre;
        apellido =apellido;
        horario =horario;
        
        
    }

    
    
    public int getIdentificacion() {    
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
     public abstract void informacionPer();
}
    
     

    

