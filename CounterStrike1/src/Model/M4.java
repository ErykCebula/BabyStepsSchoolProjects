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
public class M4 implements Bron
{
    private String nazwa = "M4";
    private int dmg = 40;

    @Override
    public void Atak()
    {
        System.out.println("Trutututu - Zadales "+dmg+" obrazen!" );
    }
    public void PokazNazwe()
    {
        System.out.println("Twoja bron to "+nazwa+".");
    }
    @Override
    public String getWeaponName() {
       return nazwa;
    }
}
