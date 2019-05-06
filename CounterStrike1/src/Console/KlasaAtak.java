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
public class KlasaAtak implements Menu {
    Bron bron;
    public KlasaAtak(Bron bron){
        this.bron = bron;
    }
    public void Menu1(){
        bron.Atak();
    }

    @Override
    public String getOptionName() {
        return "Atak";
    }
}
