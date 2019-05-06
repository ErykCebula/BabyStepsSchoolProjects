/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watek;

import static java.lang.Thread.sleep;

/**
 *
 * @author Hawkish
 */
public class Mark {

    boolean flag = false;

    public void Question(String msg) throws InterruptedException {
        while(flag=false){
            System.out.println("ping");
        }
        /*if (flag) {
            try {
                sleep(50);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        
        notify(); */
    }
       public  void Answer(String msg) throws InterruptedException {
      if (!flag) {
         try {
                  sleep(100);
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }

      System.out.println(msg);
      flag = false;
      notify();
   }
}
