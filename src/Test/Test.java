/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;



import java.util.Scanner;
import MyLibs.*;
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
public class Test extends Doctor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");;
        
        int i=0;
        int choice;
        
        
        ///////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        HospitalFactory hospitalFactory = new HospitalFactory();
        
        Hospital cardiologist = hospitalFactory.spec("cardiologist");
        Hospital urologist = hospitalFactory.spec("urologist");
        Hospital dermatologist = hospitalFactory.spec("Dermatologist");
        Hospital pediatrician = hospitalFactory.spec("pediatrician");
        
        

        pediatrician.showSpecializationFee();
        dermatologist.showSpecializationFee();
        ///////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////
        //HARD CODED DATA FOR OUR DOCTORS
        
            
        //OUR DOCTORS SPECIALIZATION
           
          
           
           
           
           
           
          
           
        
        //TO KEEP INITIALIZING OUR MAIN PROGRAM(WILL CHANGE IT AFTER FINALIZING THE CODE)
        while(true){
        System.out.println("------------------------------------");
        System.out.println("[1] Search specialization");
        System.out.println("[2] Add Doctor");
        System.out.println("[3] List of Doctors");
        System.out.println("[4] Consultation History Data");
        System.out.println("[5] Consultation Form");
        System.out.println("[6] Exit");
        System.out.print("Choice:");
        choice = scan.nextInt();
        System.out.println("-----------------------------------");
        
        
        
        
        switch(choice){
        
            case 1:
                
        //TO ASK THE USER TO INPUT HIS/HER DESIRED SPECIALIZATION IN A DOCTOR        
        String ch;
        System.out.println("Search for specialization:");
        ch = scan.next();
        
        //IF AND ELSE STATEMENT TO FIND THE MATCH OF THE DESIRED SPECIALIZATION BY THE USER
        //TO OUTPUT AN ARRAY OF DOCTORS NAME WITH A SPECIFIC SPECIALIZATION
        
        if(ch.equalsIgnoreCase(cardiologist.specialization())){
        
        cardiologist.showDoctor();
                
                
        }
        else if(ch.equalsIgnoreCase(urologist.specialization())){
        
        urologist.showDoctor();
            
        }
        else if(ch.equalsIgnoreCase(dermatologist.specialization())){
        
        dermatologist.showDoctor();
            
        }
        else if(ch.equalsIgnoreCase(pediatrician.specialization())){
        
        pediatrician.showDoctor();
            
        }
        else{
            System.out.println("---------------------------");
            System.out.println("We currently don't have any doctors with that specialization");
        }
        
        break;
        
        case 2:
            
            
           //TO ADD A NEW DOCTOR INTO OUR DATA
        int numbers2;
        
                
        
                    
                        System.out.print("How many Doctor's you wish to add?");
                        
                        //TO READ THE USER'S DESIRED NUMBERS OF NEW DOCTORS TO BE ADDED
                        
                        numbers2 = scan.nextInt();
                        int cnt;
                        cnt=1;
                        
                    //TO KEEP THE LOOP ONGOING UNTIL THE USER'S FINISHED INPUTTING DATA
                        
                    while(i<numbers2)
                        {
                              
                              System.out.print("Specialization"+ " :");
                              String specialization = scan.next();
                              
                             //IF AND ELSE STATEMENT TO ADD A DOCTOR'S INFORMATION TO A SPECIFIC SPECIALIZATION
                              
                              if(specialization.equalsIgnoreCase(cardiologist.specialization())){
                                  System.out.print("[" + cnt + "]Doctor" + " :");
                                  String doctorName = scan.next();
                                  cardiologist.addDoctor(doctorName);
                                  System.out.println("Schedule");
                                  System.out.println("Day");
                                  System.out.print("From:");
                                  String day = scan.next();
                                  System.out.print("To:");
                                  String day2 = scan.next();
                                 
                                  System.out.println("Time");
                                  System.out.print("hh:mm:ss From: ");
                                  String time =scan.next();
                                  
                                  System.out.print("hh:mm:ss To: ");
                                  String time2 =scan.next();
                                 
                              //    cardiologist.addSchedule(doctorName, day, day2, time, time2);
                                      }
                                  
                                  
                              
                              
                              else if(specialization.equalsIgnoreCase(urologist.specialization())){
                                  
                                  System.out.print("[" + cnt + "]Doctor" + " :");
                                  String doctorName = scan.next();
                                  urologist.addDoctor(doctorName);
                                  System.out.println("Schedule");
                                  System.out.println("Day");
                                  System.out.print("From:");
                                  String day = scan.next();
                                  System.out.print("To:");
                                  String day2 = scan.next();
                                 
                                  System.out.println("Time");
                                  System.out.print("hh:mm:ss From: ");
                                  String time =scan.next();
                                  
                                  System.out.print("hh:mm:ss To: ");
                                  String time2 =scan.next();
                                 
                              //    urologist.addSchedule(doctorName, day, day2, time, time2);
                                
                              
                              }
                              else if(specialization.equalsIgnoreCase(dermatologist.specialization())){
                                  
                                  System.out.print("[" + cnt + "]Doctor" + " :");
                                  String doctorName = scan.next();
                                  dermatologist.addDoctor(doctorName);
                                  System.out.println("Schedule");
                                  System.out.println("Day");
                                  System.out.print("From:");
                                  String day = scan.next();
                                  System.out.print("To:");
                                  String day2 = scan.next();
                                  boolean t=true;
                                  
                                  System.out.println("Time");
                                  System.out.print("From:");
                                  String time=scan.next();
                                  System.out.print("To:");
                                  String time2=scan.next();
                              //    dermatologist.addSchedule(doctorName, day, day2, time, time2);
                                      System.out.println("Pleaes input the right schedule");
                                  
                                      
                                      }
                              
                              else if(specialization.equalsIgnoreCase(pediatrician.specialization())){
                                  
                                  System.out.print("[" + cnt + "]Doctor" + " :");
                                  String doctorName = scan.next();
                                  pediatrician.addDoctor(doctorName);
                                  System.out.println("Schedule");
                                  System.out.println("Day");
                                  System.out.print("From:");
                                  String day = scan.next();
                                  System.out.print("To:");
                                  String day2 = scan.next();
                                  boolean t=true;
                                  
                                  System.out.println("Time");
                                  System.out.print("From:");
                                  String time=scan.next();
                                  System.out.print("To:");
                                  String time2=scan.next();
                              //    pediatrician.addSchedule(doctorName, day, day2, time, time2);
                                      System.out.println("Pleaes input the right schedule");
                                  
                                      
                                      }else {
                                  System.out.println("That specialization is not available in our Hospital");
                              }
                              
                             cnt++; 
                             i++;
                        }
                    i=0;
                    cnt=1;
            
                    
                  
                
                
                
                
               break;
        
        case 3:
            //TO DISPLAY DOCTORS INFORMATION
            
            
            cardiologist.showDoctor();
            urologist.showDoctor();
            dermatologist.showDoctor();
            pediatrician.showDoctor();
            
            break;
            
            //THE ONE BELOW IS JUST ANOTHER WAY TO DISPLAY OUR DOCTORS INFORMATION
            
            /*for (String a : doctor.doctorName)
            {
                System.out.print("Dr. " + a + " ");
                
                    System.out.println(doctor.schedule.get(i++));
                    
                    for (String b : doctor.specialization)
                    System.out.println("Specialization:" + b);
                    System.out.println("-------------------------");
                    
                
            }
            i=0;
            for (String a : doctor1.doctorName)
            {
                System.out.print("Dr. " + a + " ");
                
                    System.out.println(doctor1.schedule.get(i++));
                    
                    for (String b : doctor1.specialization)
                    System.out.println("Specialization:" + b);
                    System.out.println("-------------------------");
                
            }
            i=0;
            for (String a : doctor2.doctorName)
            {
                System.out.print("Dr. " + a + " ");
                
                    System.out.println(doctor2.schedule.get(i++));
                    
                    for (String b : doctor2.specialization)
                    System.out.println("Specialization:" + b);
                    System.out.println("-------------------------");
                
            }*/
            
        case 4:
                
            
                cardiologist.addTotalEarnings();
                urologist.addTotalEarnings();
                dermatologist.addTotalEarnings();
                pediatrician.addTotalEarnings();
            
            
            
            break;
        case 5: 
        {
            
            String URL = "jdbc:mysql://localhost:3306/doctorquery";
             String USER = "root";
             String PASS = "password";
            Patient patient = new Patient();
             
            int docu;
            System.out.println("Consultation Form");
            System.out.println("");
            System.out.print("Name: ");
            String name = scan.next();
            
            System.out.print("Date YYYY-MM-DD: ");
            String date = scan.next();
            
            System.out.println("Doctor Name: ");
            String doc = scan.next();
            
            System.out.println("Payment: ");
            int pay = scan.nextInt();
            
            if("JUAN CRUZ".equals(doc.toUpperCase())){
                
                try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_ID, Doctor_NAME FROM DOCTOR WHERE upper(Doctor_NAME) like '%JUAN CRUZ%'");
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                
            docu = result.getInt(1);
            
//            patient.InsertData(name, date, pay,docu);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else if("NADINE LUSTRE".equals(doc.toUpperCase())){
                
                try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_ID, Doctor_NAME FROM DOCTOR WHERE upper(Doctor_NAME) like '%NADINE LUSTRE%'");
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                
            docu = result.getInt(1);
            
//            patient.InsertData(name, date, pay,docu);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else if("AYN BERNOS".equals(doc.toUpperCase())){
                
                try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_ID, Doctor_NAME FROM DOCTOR WHERE upper(Doctor_NAME) like '%AYN BERNOS%'");
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                
            docu = result.getInt(1);
            
//            patient.InsertData(name, date, pay,docu);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else if("ETHAN LEE".equals(doc.toUpperCase())){
                
                try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_ID, Doctor_NAME FROM DOCTOR WHERE upper(Doctor_NAME) like '%ETHAN LEE%'");
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                
            docu = result.getInt(1);
            
           // patient.InsertData(name, date, pay, docu);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else if("JOY RAMOS".equals(doc.toUpperCase())){
                
                try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_ID, Doctor_NAME FROM DOCTOR WHERE upper(Doctor_NAME) like '%JOY RAMOS%'");
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                
            docu = result.getInt(1);
            
//            patient.InsertData(name, date, pay, docu);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else if("LAVA REYES".equals(doc.toUpperCase())){
                
                try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_ID, Doctor_NAME FROM DOCTOR WHERE upper(Doctor_NAME) like '%LAVA REYES%'");
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                
            docu = result.getInt(1);
            
//            patient.InsertData(name, date, pay, docu);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else if("BEA QUIRK".equals(doc.toUpperCase())){
                
                try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_ID, Doctor_NAME FROM DOCTOR WHERE upper(Doctor_NAME) like '%BEA QUIRK%'");
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                
            docu = result.getInt(1);
            
//            patient.InsertData(name, date, pay, docu);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else if("TRISTAN DUGRAY".equals(doc.toUpperCase())){
                
                try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            PreparedStatement statement = conn.prepareStatement("SELECT Doctor_ID, Doctor_NAME FROM DOCTOR WHERE upper(Doctor_NAME) like '%TRISTAN DUGRAY%'");
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                
            docu = result.getInt(1);
            
//            patient.InsertData(name, date, pay, docu);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urologist.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
            }else {
                System.out.println("Please enter valid doctor");
            }
            
            
            
            
            
            
        }
            
            break;
        case 6:System.exit(0);
        
        
    }
        }
}
}
    
