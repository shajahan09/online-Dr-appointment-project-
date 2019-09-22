/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.category;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Kashem
 */
@ManagedBean
public class SelectOneMenuView {
    private String console; 

    public SelectOneMenuView(String console) {
        this.console = console;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
    
}
