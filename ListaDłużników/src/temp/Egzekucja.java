/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadłużników;

/**
 *
 * @author Hawkish
 */
public class Egzekucja implements Obserwator {

    @Override
    public void powiadom(float zmianakwoty) {
       if(zmianakwoty==0){
           System.out.println("Lepiej zacznij splacac bo cie dojedziemy!");
       }
    }

 
    
}
