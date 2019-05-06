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
import Model.M4;
import java.util.Scanner;

public class ConsoleMain {

    public static void main(String[] args)
    {
        Scanner odczyt = new Scanner(System.in);
        int x;
        Bron bron = new M4();
        Inventory inventory = new Inventory();
        Menu[] menu = new Menu[5];
        menu[0] = new KlasaWyświetlNazweBroni(bron);
        menu[1] = new KlasaDodajDoEkwipunku(bron,inventory);
        menu[2] = new KlasaWyswietlEkwipunek(inventory);
        menu[3] = new KlasaZmianaBroni(bron);
        menu[4] = new KlasaAtak(bron);


        do
        {
            for(Menu menuItem : menu) {
                System.out.println(menuItem.getOptionName());
            }
            x = odczyt.nextInt();
            menu[x-1].Menu1();
        }while(x!=0);
    }
}