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
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class Cardiologist implements Hospital{
    
    public Doctor doctor = new Doctor();
    public Schedule schedule = new Schedule();
    public Specialization specialization = new Specialization();
    public int memcnt2=0;
    public String URL = "jdbc:mysql://localhost:3306/doctorquery";
    public String USER = "root";
    public String PASS = "password";
    
    public String specialization(){
        return "Cardiologist";
    }
    public void addDoctor(String doctorName){
        
           try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement ps = conn.prepareStatement("INSERT INTO DOCTOR(Doctor_Name, Specialization_ID) VALUES (?,?)");
            ps.setString(1, doctorName);
            ps.setInt(2, 1);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addSchedule(String DoctorName, String pay,String day, String day2, String time, String time2){
        
        
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
           
            
            
            PreparedStatement statement = conn.prepareStatement("UPDATE DOCTOR SET Sched_DayFrom = ?, Sched_DayTo = ?, Sched_TimeFrom = ?, Sched_TimeTo = ?, Rate_Pay = ?  WHERE Doctor_Name = ?");
            
            statement.setString(1, day);
            statement.setString(2, day2);
            statement.setString(3, time);
            statement.setString(4, time2);
            statement.setString(5, pay);
            statement.setString(6, DoctorName);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Doctor Added");
            
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Please Input the Right Values");
        }
        
        
    }
    
    
    public void showDoctor(){
        
        
       try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("Select * from doctor where Specialization_ID = 1");
            ResultSet result = statement.executeQuery();
            
            
            
            while(result.next()){
                
         //       System.out.println("Dr. " + result.getString(2));
         //       System.out.println(result.getString(4)+"-"+result.getString(5));
         //       System.out.println(result.getString(6)+"-"+result.getString(7));
                if(result.getInt(3) == 1){
          //          System.out.println("Specialization: Cardiologist");
                }else{
          //          System.out.println("Not a Cardiologist");
                }
          //      System.out.println("");
            }
            
            
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("-----------------------------------------");
     
        
            }
    public Doctor getDoctor(){
        return doctor;
    }
    public void setSpecializationFee(double cost){
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("UPDATE SPECIALIZATION SET Specialization_Cost = ? WHERE Specialization_ID = 1");
            ResultSet result = statement.executeQuery();
            
            statement.setDouble(1, cost);
            
            statement.executeUpdate();
            
            
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Specialization getSpecializationFee(){
        return this.specialization;
    }
    public void addTotalEarnings(){
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT b.Doctor_NAME, SUM(c.Specialization_Cost), COUNT(*) FROM  DOCTOR b, SPECIALIZATION c, CONSULTATION d WHERE b.Specialization_ID = c.Specialization_ID AND b.Doctor_ID = d.Doctor_ID AND b.Specialization_ID = 1 GROUP BY b.Doctor_ID");
            ResultSet result = statement.executeQuery();
            
             while(result.next()){
                
                System.out.println("Dr. " + result.getString(1) +"  "+ result.getInt(2)); 
                System.out.println("");
            }

            
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showSpecializationFee(){
    Connection conn;
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("Select * from SPECIALIZATION where Specialization_ID = 1");
            ResultSet result = statement.executeQuery();
            

            while(result.next()){
                System.out.println("Fee:PHP " + result.getString(3));
                System.out.println("");
            }
            
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
