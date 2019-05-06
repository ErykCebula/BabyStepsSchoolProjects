/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import Model.Bron;

/**
 *
 * @author Hawkish
 */


public class Inventory {

    private Bron[] TabBron = new Bron[3];

    public void DodajDoEkwipunku(Bron bron, int slot){
        if (slot <0 || slot >2){
            throw new IllegalArgumentException("Nie ma takiego miejsca w ekwipunku");

        }
        TabBron[slot] = bron;
    }
    public void WyswietlZawartoscPlecaka(){
        for(int x=0;x<3;x++){
            if(TabBron[x]!=null) {
                TabBron[x].PokazNazwe();
            }
        }
    }
}
