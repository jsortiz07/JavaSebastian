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
public class Cardiologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean agendcita = true;
        
        /*Personas cita = new Agenda().getPersona(nidentificacion);
        cita.informacionPer();
        
        
*/
        
        
        Personas cita1 =new Agenda().getPersona(agendcita);
        System.out.println(cita1.toString());
        cita1.informacionPer();
        System.out.println(cita1.toString());
      /* Personas cita = new MedicosAbstracto();
        cita.informacionPer();
        
         Personas citainf = new PacientesAbstracto();
        citainf.informacionPer();*/
   
    }
    
}
