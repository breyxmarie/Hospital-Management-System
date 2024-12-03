/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public interface Hospital {
    
    public String specialization();
    public void addDoctor(String doctorName);
    public void addSchedule(String DoctorName,String pay, String day, String day2, String time, String time2);
    public void setSpecializationFee(double cost);
    public void showSpecializationFee();
    public Specialization getSpecializationFee();
    public void addTotalEarnings();
    public Doctor getDoctor();
    public void showDoctor();
}
