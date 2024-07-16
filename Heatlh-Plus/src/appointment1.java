
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amna
 */
public class appointment1 {
    private String bloodgroup, Disease, doctor,time;
    private Date date;
    private int fee,id;

    public appointment1() {
        this.bloodgroup = "";
        this.Disease = "";
        this.doctor = "";
        this.time = "";
        this.date = null;
        this.fee = 0;
        this.id = 0;
    }

    
    public appointment1(int fee, String bloodgroup, String Disease, String doctor, Date date, String time, int id) {
        this.bloodgroup = bloodgroup;
        this.Disease = Disease;
        this.doctor = doctor;
        this.time = time;
        this.date = date;
        this.fee = fee;
        this.id = id;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public String getDoctor() {
        return doctor;
    }
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public String getTime() {
    return time;
}
    public void setTime(String time) {
        this.time = time;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "appointment1{" + "bloodgroup=" + bloodgroup + ", Disease=" + Disease + ", doctor=" + doctor + ", time=" + time + ", date=" + date + ", fee=" + fee + ", id=" + id + '}';
    }

   

    

    

     

  
   

 
   }