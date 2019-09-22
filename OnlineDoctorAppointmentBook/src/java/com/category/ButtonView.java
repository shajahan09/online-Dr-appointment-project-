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
public class ButtonView {
    private String buttonAction;

    public String getButtonAction() {
        return buttonAction;
    }

    public void setButtonAction(String buttonAction) {
        this.buttonAction = buttonAction;
    }
    
    
}
