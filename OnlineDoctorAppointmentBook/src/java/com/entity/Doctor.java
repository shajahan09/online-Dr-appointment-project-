package com.entity;
// Generated 15-Sep-2019 12:21:04 by Hibernate Tools 4.3.1



/**
 * Doctor generated by hbm2java
 */
public class Doctor  implements java.io.Serializable {


     private Integer id;
     private String catagory;
     private String doctor;
     private String date;
     private String time;
     private String fees;
     private String name;

    public Doctor() {
    }

    public Doctor(String catagory, String doctor, String date, String time, String fees, String name) {
       this.catagory = catagory;
       this.doctor = doctor;
       this.date = date;
       this.time = time;
       this.fees = fees;
       this.name = name;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCatagory() {
        return this.catagory;
    }
    
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    public String getDoctor() {
        return this.doctor;
    }
    
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public String getFees() {
        return this.fees;
    }
    
    public void setFees(String fees) {
        this.fees = fees;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


