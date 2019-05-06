/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Hawkish
 */
public class DesertEagle implements Bron
{
    private String nazwa = "Desert Eagle";
    private int dmg = 60;

    @Override
    public void Atak()
    {
        System.out.println("Jebudu - Zadales "+dmg+" obrazen!" );
    }
    @Override
    public void PokazNazwe()
    {
        System.out.println("Twoja bron to "+nazwa+".");
    }

    @Override
    public String getWeaponName() {
       return nazwa;
    }

}
