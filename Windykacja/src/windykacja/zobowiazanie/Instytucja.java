/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windykacja.zobowiazanie;

import windykacja.zobowiazanie.Zobowiazanie;
import java.util.ArrayList;
import windykacja.Adres;
import windykacja.Firma;

/**
 *
 * @author Hawkish
 */
public class Instytucja implements Firma {

    /**
     * @return the nazwa
     */
    @Override
    public String getNazwa() {
        return nazwa;
    }

    /**
     * @return the adres
     */
    @Override
    public Adres getAdres() {
        return adres;
    }
  private String nazwa;
  private Adres adres;
  public Instytucja(String nazwa, Adres adres) {
      this.nazwa = nazwa;
      this.adres = adres;
  }
  ArrayList<Zobowiazanie> zobowiazania = new ArrayList<>();

    void addZobowiazanie(Zobowiazanie zobowiazanie) {
        zobowiazania.add(zobowiazanie);
    }
    void payZobowiazanie(Zobowiazanie zobowiazanie) {
        zobowiazania.remove(zobowiazanie);
    }
}
