/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author paulo
 */
public class HospitalFactory {
    
    public Hospital doctor;

    
    public Hospital spec(String qwerty){
        if(qwerty.equalsIgnoreCase("cardiologist")){
            return doctor = new Cardiologist();
        }
        else if(qwerty.equalsIgnoreCase("urologist")){
           return doctor = new Urologist();
        }
        else if(qwerty.equalsIgnoreCase("dermatologist")){
           return doctor = new Dermatologist();
    }
        else{
            return doctor = new Pediatrician();
        }
        
        
    }
    
}
