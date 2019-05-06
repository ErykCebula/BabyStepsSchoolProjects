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
public class KlasaWyświetlNazweBroni implements Menu {
    Bron bron;
    public KlasaWyświetlNazweBroni(Bron bron){
        this.bron = bron;
    }
    public void Menu1(){
        bron.PokazNazwe();
    }

    @Override
    public String getOptionName() {
        return "Wyświetl Nazwe Broni";
    }
}
