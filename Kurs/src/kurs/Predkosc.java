/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurs;

/**
 *
 * @author Hawkish
 */
public class Predkosc {
    int s;
    double t;
   
    Predkosc(int s,int t){
        this.s=s;
        this.t=t;
    }
    public void obliczanie(){
      double v;
      v=s/t;
        if(s==0 || t==0) {
            System.out.println("Nie dziel chujku przez zero,a dzielenia zera tez jest fujka");
        }
        
else { System.out.println("Predkosc to "+s+"/"+t+"m/s");
System.out.println(v);
         }
}}
