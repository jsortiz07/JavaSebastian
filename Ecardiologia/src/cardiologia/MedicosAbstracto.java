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

  /*     private int identificacion;
    private String nombre;
    private String apellido;
    private String horario;
    private Personas creador;*/

    public MedicosAbstracto(int documento , String nombre, String apellido, String horario) {
       // super(identificacion , nombre , apellido, horario);
        
        super(documento,nombre,apellido,horario);
        
        
     //   informacionPer(documento, nombre, apellido, horario);
        
    }
    
    
    


@Override
    public void informacionPer() {
     this.setIdentificacion(1526566); 
     this.nombre ="Johan";
     this.apellido ="ortiz";
     this.setHorario("Mañana"); 
             
    /* this.identificacion =1225566;
      this.creador.setIdentificacion(12122255);
        this.creador.setApellido("Lopez");
        this.creador.setHorario("Mañana");
       
        System.out.println("Informacioon doctor");*/
    }
    
    public String toString(){
        return String.format("El paciente",this.nombre, this.apellido,"Con cedula",this.identificacion,"Horario",this.horario);
                }

 

    
    
}