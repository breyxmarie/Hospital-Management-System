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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnp
 */
public class DeleteConsult extends DeleteDocConsult{
    
    String URL = "jdbc:mysql://localhost:3306/doctorquery";
    String USER = "root";
    String PASS = "password";

    public void Delete(String name){
        
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = conn.prepareStatement("Delete from Consultation where Patient_Name = ?");
            ps.setString(1, name);
            ps.executeUpdate();

            
            System.out.println("Deleted Data");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DeleteConsult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
