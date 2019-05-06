/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawkish
 */
public class Obserwowana {
    ArrayList<Obserwator> tabSukces = new ArrayList<>();
    void ustaw_sukces(Obserwator temp){
        tabSukces.add(temp);
    }
    
   
    void sprawdz(){
        Scanner odczyt = new Scanner(System.in);
        if(odczyt.nextInt()==5) {
            for(Obserwator command : tabSukces) {
                command.powiadom();
            }
        }
        else{System.out.println("Liczba rozna od 5");}
    }
}
