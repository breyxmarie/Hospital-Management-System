/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;
/**
 *
 * @author ian
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Login{
        private String username;
        private String password;
        Scanner scanner = new Scanner(System.in);
        
        
    
    //System.out.print("Enter username: ");
     //   username = scanner.nextLine();
   // System.out.print("Enter password: ");
      //  password = scanner.nextLine();
        
    public Login(String u ,String p){
        this.username = u;
        this.password = p;
    }
  
  
   // public boolean validateLogin(String username, String password){
  public boolean validateLogin(){
        boolean t = true;
        
        try{
            String URL = "jdbc:mysql://localhost:3306/doctorquery";
            String USER = "root";
            String PASS = "password";
            Connection conns = DriverManager.getConnection(URL, USER, PASS);
       PreparedStatement statementss = conns.prepareStatement("SELECT Account_Username, Account_Password FROM Accounts");
            ResultSet resultss = statementss.executeQuery();
           
            while(resultss.next()){
                String checku = resultss.getString(1);
                String checkp = resultss.getString(2);
                
                if(checku.equals(username) && checkp.equals(password)){
                    
                    return true;
            }
            }
       }
	catch(SQLException sex)
	{
            System.out.println(sex.getMessage());
	}
        return false;
     //   while(t){
         //       for(int i=0; i<register.username.size(); i++){
             //           if(username.equals(Register.getUsernameList(i)) && password.equals(Register.getPasswordList(i))) 
              //          {
                                //go to Main program//
                 //               t = false;
                 //       }       
               // }
      //  }
        
    }
}
    
  



       
                
           
     



    
