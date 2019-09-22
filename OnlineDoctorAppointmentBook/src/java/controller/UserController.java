/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.entity.Doctor;
import com.entity.User;
import com.util.DoctorDao;
import com.util.UserDao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


 @ManagedBean(name="userCrtl")
 @SessionScoped
public class UserController {
     List<Doctor> productList = new ArrayList<>();
     String name;
     String password;
     String email;
     int mobile;
     String address;
    
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     UserDao dao = new UserDao();
     public String login(){
         boolean result = dao.login(email, password);
         if(result == false){
             return "Login Failed";
         }
         return "booking";
     }
     List<User> products = new ArrayList<>();

    public List<User> getProducts() {
        return products;
    }

    public void setProducts(List<User> products) {
        this.products = products;
    }
     

   
     public String signup(){
         dao.adduser(new User(name, email, mobile, name, password));
         products = dao.getAllValue();
         
         return "LoginForm";
     }
     public List<String> testCompleteMethod(String input) {
       System.out.println("------ "+input);
        List<String> suggesstions = new ArrayList<>();
        for(Doctor d: productList) {
            if(!d.getName().isEmpty() && d.getName().toLowerCase().contains(input.toLowerCase())) {
                suggesstions.add(d.getId()+"-"+d.getName());
            }
        }
        return suggesstions;
    }
     public String adminlogin(){
         boolean result = dao.login(email, password);
         if(result == false){
             return "Login Failed";
         }
         return "doctorAdd";
     }
     public String adminsignup(){
         dao.adduser(new User(name, email, mobile, name, password));
         products = dao.getAllValue();
         
         return "adminLogin";
     }
      public String doctlogin(){
         boolean result = dao.login(email, password);
         if(result == false){
             return "Login Failed";
         }
         return "DrviewBooking";
     }
      public String doctsignup(){
         dao.adduser(new User(name, email, mobile, name, password));
         products = dao.getAllValue();
         
         return "Drlogin";
     }
     }
