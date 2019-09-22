/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.entity.Doctor;
import com.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class DoctorDao {
     SessionFactory sessionFac = NewHibernateUtil.getSessionFactory();
     
    public List<Doctor> getAllEmps() {
        
        List<Doctor> emps = new ArrayList<>();
        Session sess = sessionFac.openSession();
        Query query = sess.createQuery("From Doctor");
        emps = query.list();
//        for(Employee e: emps) {
//            emps.add(e);
//        }
        sess.close();
        return emps;
    }
    
    public void adduser(Doctor d){
        Session sess= sessionFac.openSession();
        Transaction tran = sess.beginTransaction();
        sess.save(d);
        tran.commit();
        sess.close();
        
    }
   
}
