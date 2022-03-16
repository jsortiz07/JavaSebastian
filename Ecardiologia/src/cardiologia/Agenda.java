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
public class Agenda {
    
    public Personas  getPersona(boolean agendcita){
    if(agendcita == true){
        return new MedicosAbstracto();
      
        }
        System.out.println("nO LO TOMA");
        return null;
        
    }
    
}
