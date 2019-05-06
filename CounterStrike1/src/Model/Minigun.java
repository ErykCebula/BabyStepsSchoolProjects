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
public class Minigun implements Bron {
    private String nazwa = "Minigun";
    private int dmg = 90;
    @Override
    public void Atak() {
        System.out.println(dmg);
    }

 

    @Override
    public String getWeaponName() {
        return nazwa;
    }

    @Override
    public void PokazNazwe() {
        
    
}
}