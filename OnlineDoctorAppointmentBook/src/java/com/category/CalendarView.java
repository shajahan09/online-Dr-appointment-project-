/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.category;

import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Kashem
 */
@ManagedBean
public class CalendarView {
   private Date date2;

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }
   
    
}
