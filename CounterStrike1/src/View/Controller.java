/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Game;
import java.util.ArrayList;

/**
 *
 * @author Hawkish
 */
class Controller {
    Game game;
    
    public Controller(Game game) {
        this.game = game;
    } 
    String getWeaponName() {
        return game.getWeaponName();
    }

    void swapWeapon() {
        game.swapWeapon();
    }
    
    void addWeaponToInventory(){
    game.inventoryAdd();
        
    }
    
   
}
