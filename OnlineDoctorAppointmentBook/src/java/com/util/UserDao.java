/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UserDao {
    SessionFactory factory = NewHibernateUtil.getSessionFactory();
    public boolean login(String email,String password){
        boolean result =false;
        Session sess = factory.openSession();
        Query query = sess.createQuery("From User u where u.email =:email AND u.password =:pass");
        query.setParameter("email", email);
        query.setParameter("pass", password);
        List<User> usr = query.list();
        for(User u: usr){
            return true;
        }
        sess.close();
        return result;
    
    }
    
    public void adduser(User u){
        Session sess= factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.save(u);
        tran.commit();
        sess.close();
        
    }
    public List<User> getAllValue(){
       List<User> products =new ArrayList<>();
       Session sess = factory.openSession();
       Query q = sess.createQuery("From User");
       products = q.list();
       
       return products;
    }
   
    
}
