/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Brey
 */

public class remoteForm {
    FormCommand slot;
    
    public void setCommand(FormCommand forms){
        slot = forms;
        slot.execute();
    }
    
    public void openForm(){
        slot.execute();
         
    }
    
  
}
