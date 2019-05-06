/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watek;

/**
 *
 * @author Hawkish
 */
public class Watek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mark m=new Mark();
        Watek_1 t1 = new Watek_1(m);
        Watek_2 t2 = new Watek_2(m);
        Thread t3 = new Thread(t2);
        t1.start();
        t3.start();

    }
    
}
