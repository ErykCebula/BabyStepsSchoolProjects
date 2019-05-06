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
public interface OnInventoryHandler {
    void handleAddDesert();
    void handleAddM4();
    void handleAddMinigun();
    void handleWepon(Bron currentWeapon);
}
