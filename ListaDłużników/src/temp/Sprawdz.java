/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadłużników;

import java.util.Scanner;

/**
 *
 * @author Hawkish
 */
public class Sprawdz implements Menu {
Dłużnik obiekt1;
public Sprawdz(Dłużnik obiekt1){
   this.obiekt1=obiekt1;
}
    @Override 
    public void Menu1(){
   System.out.println("Kwota jaka jestes dłużny to: "+obiekt1.kwota);
   System.out.println("Ile chcesz splacic?");
   Scanner odczyt = new Scanner(System.in);
   obiekt1.zmianakwoty=obiekt1.kwota-odczyt.nextInt();
   System.out.println("Kwota po spłacie"+ obiekt1.zmianakwoty + obiekt1.dlug );
    }
}

