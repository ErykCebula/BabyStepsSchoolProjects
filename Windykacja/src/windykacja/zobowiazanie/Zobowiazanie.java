 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windykacja.zobowiazanie;

import java.util.Date;

/**
 *
 * @author Hawkish
 */
public class Zobowiazanie {
    private Dluznik dluznik;
    private Instytucja instytucja;
    private float kwota;
    private Date dataPowstaniaNaleznosci;
    private Date dataWymagalnosci;
    /*package*/ Zobowiazanie(Dluznik dluznik, Instytucja instytucja, float kwota, Date dataPowstaniaNaleznosci, Date  daaWymagalkosci) {
        this.dluznik = dluznik;
        this.instytucja = instytucja;
        this.kwota = kwota;
        this.dataPowstaniaNaleznosci = dataPowstaniaNaleznosci;
        this.dataWymagalnosci = dataWymagalnosci;
    }
    public void pay(float kwota) {
        if (this.kwota + getOdsetki()<=kwota) {
            instytucja.payZobowiazanie(this);
            dluznik.paidZobowiazanie(this);
            this.kwota = 0;
        } else {
            this.kwota-=kwota;
        }
    }

    public float getOdsetki() {
        return 10;
    }
}
