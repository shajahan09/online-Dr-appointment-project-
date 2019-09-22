/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Patient01 {
    String name;
    int id;
    int Password;
    String email;
    int mobile_no;
    String address;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPassword() {
        return Password;
    }

    public String getEmail() {
        return email;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
