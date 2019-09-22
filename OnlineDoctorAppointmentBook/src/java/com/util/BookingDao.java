
package com.util;

import com.entity.Booking;
import com.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class BookingDao {
     SessionFactory factory = NewHibernateUtil.getSessionFactory();
    
    public void adduser(Booking b){
        Session sess= factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.save(b);
        tran.commit();
        sess.close();
        
    }
    public List<Booking> getAllValue(){
       List<Booking> products =new ArrayList<>();
       Session sess = factory.openSession();
       Query q = sess.createQuery("From Booking");
       products = q.list();
       
       return products;
    }
    public void delete(Booking p) {
        Session sess = factory.openSession();
        Transaction tran = sess.beginTransaction();
        sess.delete(p);
        tran.commit();
        sess.close();
    }
   
    
}
