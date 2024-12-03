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
import java.util.ArrayList;
public class Doctor extends Specialization {
    protected ArrayList<String> doctorName = new ArrayList();
    protected Schedule schedule = new Schedule();
    public ArrayList<Double> totalEarnings = new ArrayList();
    private String Earn;
    private String date;
    private String patient;
    private String payment;
    
    public String docname;
    public String special;
    public String rate;
    public String day;
    public String time;
           

    public Doctor(String e,String d,String pa,String p){
        this.Earn = e;
        this.date = d;
        this.patient = pa;
        this.payment = p;
    }
    
    public Doctor(){
       
    }

    public String getEarn() {
        return Earn;
    }

    public void setEarn(String Earn) {
        this.Earn = Earn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
    
    public Doctor(String doc, String spe, String ra, String da, String ti){
        this.docname = doc;
        this.special = spe;
    this.rate = ra;
    this.day = da;
    this.time = ti;
    }
    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings.add(totalEarnings);
    }
    public ArrayList<Double> getTotalEarnings() {
        return totalEarnings;
    }
    protected Date birthday = new Date();

    public void setDoctorName(String doctorName) {
        this.doctorName.add(doctorName);
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    public Date getBirthday() {
        return birthday;
    }
    public Specialization specDetails = new Specialization();
    public ArrayList<String> getDoctorName() {
        return doctorName;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}
