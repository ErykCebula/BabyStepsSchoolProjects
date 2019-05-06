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
import Model.Bron;
import java.util.Scanner;

public class KlasaDodajDoEkwipunku implements Menu{
    Bron bron;
    Inventory inventory;
    Scanner odczyt;
    public KlasaDodajDoEkwipunku(Bron bron, Inventory inventory){
        this.bron = bron;
        this.inventory = inventory;
        odczyt = new Scanner(System.in);
    }
    public void Menu1(){
        System.out.println("W ktore miejsce ekwipunku wstawić twoją broń ?");
        int y = odczyt.nextInt();
        try {
            inventory.DodajDoEkwipunku(bron, y);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getOptionName() {
        return "Dodaj Do Ekwipunku";
    }
}
