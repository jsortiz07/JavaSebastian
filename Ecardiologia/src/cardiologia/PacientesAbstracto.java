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
public class PacientesAbstracto extends Personas {

  /*     private int identificacion;
    private String nombre;
    private String Apellido;
    private String horacita;*/
    
    public PacientesAbstracto(int documento , String nombre, String apellido, String horario) {
        
                super(documento,nombre,apellido,horario);

    }

       


    @Override
    public void informacionPer() {
   this.identificacion =22325;
     this.nombre ="Diego";
     this.apellido ="ortiz";
     this.horario="23/03/2022";
    }
    
    
}
