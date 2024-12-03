/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo
 */
public class Specialization {
    private String specialization;
    private double consultationCost;
    public String URL = "jdbc:mysql://localhost:3306/doctorquery";
    public String USER = "root";
    public String PASS = "password";
    
    public void doctorInformation(){
        System.out.println("Specialization: " + this.specialization);
        System.out.println("Fee: " + this.consultationCost);
        
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("Select * from SPECIALIZATION");
            ResultSet result = statement.executeQuery();

            
            while(result.next()){
                
                System.out.println("Specialization " + result.getString(2));
                System.out.println(result.getString(4)+"-"+result.getString(5));
                System.out.println(result.getString(6)+"-"+result.getString(7));
                if(result.getInt(3) == 2){
                    System.out.println("Specialization: Urologist");
                }else{
                    System.out.println("Not a Urologist");
                }
                System.out.println("");
            }
            
            
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("-----------------------------------------");
     
        
        
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    

    public void setConsultationCost(double consultationCost) {
        this.consultationCost = consultationCost;
    }

    public double getConsultationCost() {
        return consultationCost;
    }
}
