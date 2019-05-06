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
public class Watek_2 implements Runnable {
   Mark m;
   String s2 = "pong";

   public Watek_2 (Mark m2) {
      this.m = m2;
      new Thread(this, "Answer").start();
   }

   public void run() {
       try {
           m.Answer(s2);
       } catch (InterruptedException ex) {
           Logger.getLogger(Watek_2.class.getName()).log(Level.SEVERE, null, ex);
       }
      
   }
}
    

