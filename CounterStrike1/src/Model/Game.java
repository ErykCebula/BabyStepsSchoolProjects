/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
//   KLASA MODELU!!!!

import Console.Inventory;
import java.util.ArrayList;

/**
 *
 * @author Hawkish
 */
public class Game {

    int numer = 0;
    Bron bron = new M4();
    OnWeaponSwap onOnWeaponSwapHandler; 
    OnInventoryHandler invHandler;
    public String getWeaponName() {
        return bron.getWeaponName();
    }
    public void registerOnWeapon(){
        this.bron=bron;
    }
    public void setOnSwappedHandler(OnWeaponSwap onSwapped) {
        this.onOnWeaponSwapHandler = onSwapped;
    }
    public void setOnInventoryHandle(OnInventoryHandler invHandler){
        this.invHandler=invHandler;
    }

    public void swapWeapon() {
        switch (numer) {
            case 0:
                bron = new DesertEagle();
                numer = 1;
                break;
            case 1:
                bron = new M4();
                numer = 2;
                break;
            case 2:
                bron = new Minigun();
                numer = 0;
                break;
        }

        onOnWeaponSwapHandler.swapped();
    }
    ArrayList<Bron> inventory = new ArrayList<>();

    public void inventoryAdd() {
        switch (numer) {
            case 0:
                bron = new DesertEagle();
                inventory.add(bron);
                numer = 1;
                //invHandler.handleAddDesert();
                invHandler.handleWepon(bron);
                break;
            case 1:
                bron = new M4();
                inventory.add(bron);
                //invHandler.handleAddM4();
                invHandler.handleWepon(bron);
                numer = 2;
                break;
            case 2:
                bron = new Minigun();
                inventory.add(bron);
                //invHandler.handleAddMinigun();
                invHandler.handleWepon(bron);
                numer = 0;
                break;
        }
    }
    /*   private static class OnSwappedHandler {
    
        public OnSwappedHandler() {
        }
    }*/

    /**
     *
     * @return
     */
     }
