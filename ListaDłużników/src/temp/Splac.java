/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadłużników;
import java.util.ArrayList;
/**
 *
 * @author Hawkish
 */
public class Splac implements Menu {
    Dłużnik obiekt;
    private Iterable<Obserwator> obserwatorzy;

    /**
     *
     * @param obiekt
     * @param obserwatorzy
     * @param obserwatorzy
     */
    public Splac(Dłużnik obiekt){
     this.obiekt=obiekt;
     
    }

   
    
    @Override
    public void Menu1(){
       if(obiekt.zmianakwoty>0)
       {        for(Obserwator Obiekt_klasy_ktora_da_powiadomienie : obserwatorzy) {
                Obiekt_klasy_ktora_da_powiadomienie.powiadom(obiekt.zmianakwoty);}
          System.out.println("Dlug został czesciowo splacony");
       }
       else{for(Obserwator Obiekt_klasy_ktora_da_powiadomienie : obserwatorzy) {
                Obiekt_klasy_ktora_da_powiadomienie.powiadom(obiekt.zmianakwoty);}
           System.out.println("Dlug sie nie zmienil");
       }
}
} 

