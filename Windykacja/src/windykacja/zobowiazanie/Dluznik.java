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
public class Dluznik implements Firma {
    private Adres adres;
    private String nazwa;
    private ArrayList<Zobowiazanie> zobowiazania = new ArrayList<>();
    @Override
    public Adres getAdres() {
        return adres;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }
    void addZobowiazanie(Zobowiazanie zobowiazanie) {
        zobowiazania.add(zobowiazanie);
    } 
    void paidZobowiazanie(Zobowiazanie zobowiazanie) {
        zobowiazania.remove(zobowiazanie);
    }
}
