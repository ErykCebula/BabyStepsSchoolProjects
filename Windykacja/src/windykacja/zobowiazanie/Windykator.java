/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windykacja.zobowiazanie;

import windykacja.zobowiazanie.Zobowiazanie;
import java.util.Date;

/**
 *
 * @author Hawkish
 */
public class Windykator {
    public static Zobowiazanie CreateZobowiazanie(Dluznik dluznik, Instytucja instytucja, float kwota, Date dataPowstaniaNaleznosci, Date daaWymagalkosci) {
        Zobowiazanie zobowiazanie = new Zobowiazanie(dluznik, instytucja, kwota, dataPowstaniaNaleznosci, daaWymagalkosci);
        dluznik.addZobowiazanie(zobowiazanie);
        instytucja.addZobowiazanie(zobowiazanie);
        return zobowiazanie;
    }
}
