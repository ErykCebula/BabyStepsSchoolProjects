/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.event.MouseEvent;

/**
 *
 * @author Hawkish
 */
public class Model {
    private String oponent;
    public String choice;
    public static int counter=0;
    public static int points=0;
    public String getOponent() {
        return oponent;
    }

    public void setOponent(String oponent) {
        this.oponent = oponent;
    }


    public void startBtnMouseClicked(MouseEvent evt) {
    }

  
}
