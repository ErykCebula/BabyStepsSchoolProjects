/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadłużników;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hawkish
 */
public class ListaDłużników {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner odczyt = new Scanner(System.in);
           int y=0;
ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
        Dłużnik Polska = new Dłużnik("Janusz",200,"Cebuliony");
        Polska.dodaj_obserwatora(new Egzekucja());
        Polska.dodaj_obserwatora(new Splata());
       Polska.sprawdz(Polska);
       Polska.splac(Polska);
       Polska.sprawdz(Polska);
       Polska.splac(Polska);
       Polska.sprawdz(Polska);
    /*   Menu[] menu = new Menu[2];
       menu[0] = new Sprawdz(Polska);
       menu[1] = new Splac(Polska);
        do
        {
        
    // y = odczyt.nextInt();
            menu[0].Menu1();
            menu[1].Menu1(obserwator.powiadom(Poland.zmianakwoty), obserwator1.powiadom(Poland.zmianakwoty));
        }while(y!=1);
    }*/
    
}}
