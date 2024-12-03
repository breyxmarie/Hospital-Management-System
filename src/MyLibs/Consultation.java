/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

import Test.ConsultationPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo
 */
public class Consultation{
    private Date date;
    private Doctor doctor;
    private Specialization consultingDoctor;
    private int payment;
    String URL = "jdbc:mysql://localhost:3306/doctorquery";
    String USER = "root";
    String PASS = "password";
    
    
    
    public void consulationDetails(){
       
        
        
             try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT c.Patient_Name, a.Doctor_NAME, b.Specialization_Cost FROM Doctor a, Specialization b, Consultation c WHERE c.Doctor_ID = a.Doctor_ID AND a.Specialization_ID = b.Specialization_ID");
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                
                System.out.println("Patient: " + result.getString(1));
                System.out.println("Doctor: " + result.getString(2));
                System.out.println("Specialization: " + result.getInt(3));
                System.out.println("");
                
            }
            
            
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    
    public void paymentRec(){
      
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT a.Doctor_NAME, b.Specialization_Name, b.Specialization_Cost FROM doctor a, specialization b WHERE a.Specialization_ID = b.Specialization_ID");
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                
                System.out.println("Doctor: " + result.getString(1));
                System.out.println("Specialization: " + result.getString(2));
                System.out.println("Fee: P" + result.getInt(3));
                System.out.println("");
                
            }
            
            
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}