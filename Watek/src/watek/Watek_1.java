/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watek;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Hawkish
 */
public class Watek_1 extends Thread {
   
    
   Mark m;
   String s1 = "ping";

   public Watek_1 (Mark m1) {
      this.m = m1;
      new Thread(this, "Question").start();
   }

   public void run() {
       try {
           m.Question(s1);
       } catch (InterruptedException ex) {
           Logger.getLogger(Watek_1.class.getName()).log(Level.SEVERE, null, ex);
       }
      
   }
   }


