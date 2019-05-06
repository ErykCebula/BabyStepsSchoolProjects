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
import Model.DesertEagle;
import Model.M4;
import java.util.Scanner;

public class KlasaZmianaBroni implements Menu {
    Bron bron;
    private Scanner odczyt = new Scanner(System.in);
    private int y;

    public KlasaZmianaBroni(Bron bron) {
        this.bron = bron;
    }

    public void Menu1() {
        System.out.println("Na jaka bron zmiennic ?");
        System.out.println("1-M4");
        System.out.println("2-Deseart Eagle");
        switch (y = odczyt.nextInt()) {
            case 1:
                System.out.println("Bron zmieniono na M4.");
                bron = new M4();
                break;
            case 2:
                System.out.println("Bron zmieniono na Desert Eagla.");
                bron = new DesertEagle();
                break;
            default:
                System.out.println("Bron nie zostala zmienniona.");
                break;
        }
    }

    @Override
    public String getOptionName() {
        return "Zmiana Broni";
    }
}
