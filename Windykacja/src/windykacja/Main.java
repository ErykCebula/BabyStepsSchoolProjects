/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windykacja;

import windykacja.zobowiazanie.Dluznik;
import windykacja.zobowiazanie.Instytucja;


/**
 *
 * @author Hawkish
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dluznik dluznik = new Dluznik();
       Adres adres= new Adres();
       dluznik.getAdres();
       dluznik.getNazwa();
       Instytucja instytucja = new Instytucja("Porn Industry",adres);
       
        
    }
    
}
