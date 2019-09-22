/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patient;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Java
 */
@ManagedBean
@SessionScoped
public class Patient {
    int id;
    String name;
    String adress;
    String nid;
    String dob;
    String gender;
    String mobile_no;
    boolean male;
    boolean female;
    String email;
    String password;
    String cpassword;
    String userName;
    private String mobile;

    public Patient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        String mobile = null;
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public List<String> number(String num) {
        List<String> results = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            results.add(num + i);
        }
         
        return results;
    }

    
    public String submit(){
        
    return "Profile";
    }
    public String  vali(){
        FacesContext context= FacesContext.getCurrentInstance();
       
        if(name.equals("")){
        context.addMessage(null,new FacesMessage("Name should be in Character"));
        return ("form");
      }
        if(id!=1234){
            context.addMessage(null, new FacesMessage("Inter Exact Roll"));
            return ("form");
        }
         return ("booking");
}
    
}
