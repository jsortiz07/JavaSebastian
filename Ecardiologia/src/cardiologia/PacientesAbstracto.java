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

       private int identificacion;
    private String nombre;
    private String Apellido;
    private String horacita;
    
    public PacientesAbstracto() {
    }

       


    @Override
    public void informacionPer() {
 identificacion =555555;
        nombre ="Johan";
        Apellido = "Ortiz";
        horacita ="13:40";
        System.out.println("si lo toma");
    }
    
}
