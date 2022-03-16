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
public  class MedicosAbstracto extends Personas {

       private int identificacion;
    private String nombre;
    private String Apellido;
    private String horario;
    private Personas creador;

    public MedicosAbstracto() {
    }
    
    
    



    @Override
    public void informacionPer() {
     this.identificacion =1225566;
      this.creador.setIdentificacion(12122255);
        this.creador.setApellido("Lopez");
        this.creador.setHorario("Mañana");
       
        System.out.println("Informacioon doctor");
    }


    
    
}