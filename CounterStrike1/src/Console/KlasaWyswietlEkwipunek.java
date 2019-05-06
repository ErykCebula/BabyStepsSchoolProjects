/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

/**
 *
 * @author Hawkish
 */
public class KlasaWyswietlEkwipunek implements Menu{
    Inventory inventory;
    public KlasaWyswietlEkwipunek(Inventory inventory){
        this.inventory = inventory;
    }
    public void Menu1(){
        inventory.WyswietlZawartoscPlecaka();
    }

    @Override
    public String getOptionName() {
        return "Wyswietl Ekwipunek";
    }
}
