/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author johnp
 */
public class Patient {
 
        String URL = "jdbc:mysql://localhost:3306/doctorquery";
        String USER = "root";
        String PASS = "password";
        
    public void InsertData(String name, java.util.Date date,int paym, int docNum){
        
    
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate;
            
            
            utilDate = date;
            long ms = utilDate.getTime();
            java.sql.Date sqlDate = new java.sql.Date(ms);
            
            
            PreparedStatement ps = conn.prepareStatement("INSERT INTO CONSULTATION(Patient_Name, Consult_Date, Payment, Doctor_ID) VALUES (?,?,?,?)");
            ps.setString(1, name);
            ps.setDate(2, sqlDate);
            ps.setInt(3, paym);
            ps.setInt(4, docNum);
            int res = ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Consultation Recorded");
        //    if(res==0){
         //   System.out.println("Record not inserted");
         //   }else{
         //   System.out.println("record inserted");
         //   }
            
            ps.close();
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Please Input the Right Values");
        
        
    }
    
    
    
    
}
}
