/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console2;

import Model.OnWeaponSwap;

/**
 *
 * @author Hawkish
 */
public class Console  implements OnWeaponSwap {
    Console2.Controller controller; 
    /**
     * Creates new form NewJFrame
     */
    public Console(Console2.Controller controller) {
        this.controller = controller;
    }
    @Override
    public void swapped() {
        System.out.println("Zmieniono Ci bron!");
    }

    void init() {
        System.out.println("Czesc!");
        controller.swapWeapon();
    }
    
}
