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
public class Dłużnik implements Instytucja {

    String nazwa;
    float kwota;
//float zmianakwoty=0;
    String dlug;
    ArrayList<Obserwator> obserwatorzy = new ArrayList<>();

    public Dłużnik(String nazwa, float kwota, String dlug) {
        this.nazwa = nazwa;
        this.kwota = kwota;
        this.dlug = dlug;
        System.out.println("Dłużnik: " + nazwa + " jest mi dluzny: " + dlug + " w ilosci: " + kwota);
    }

    @Override
    public float splac(Dłużnik obiekt) {
        System.out.println("Kwota jaka jestes dłużny to: " + obiekt.kwota);
        System.out.println("Ile chcesz splacic?");
        Scanner odczyt = new Scanner(System.in);
        //obiekt.zmianakwoty=obiekt.kwota-odczyt.nextInt();
        // System.out.println("Kwota po spłacie"+ obiekt.zmianakwoty + obiekt.dlug );
        return obiekt.zmianakwoty;

    }

    /* void dodaj_obserwatora(Obserwator temp){
        obserwatorzy.add(temp);
    }
        void usun_obserwatora(Obserwator temp){
        obserwatorzy.remove(temp);
    }
   public void sprawdz(Dłużnik obiekt){
       if(obiekt.zmianakwoty>0)
       {        for(Obserwator Obiekt_klasy_ktora_da_powiadomienie : obserwatorzy) {
                Obiekt_klasy_ktora_da_powiadomienie.powiadom(obiekt.zmianakwoty);}
          System.out.println("Dlug został czesciowo splacony");
       }
       else{for(Obserwator Obiekt_klasy_ktora_da_powiadomienie : obserwatorzy) {
                Obiekt_klasy_ktora_da_powiadomienie.powiadom(obiekt.zmianakwoty);}
           System.out.println("Dlug sie nie zmienil");
       }
       
   }*/
}
