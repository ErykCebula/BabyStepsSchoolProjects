/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console2;

import Model.Game;

/**
 *
 * @author Hawkish
 */
public class Controller {
    Game game;
    Controller(Game game) {
        this.game = game;
    }
    
    String getWeaponName() {
        return game.getWeaponName();
    }

    void swapWeapon() {
        game.swapWeapon();
    }
}
