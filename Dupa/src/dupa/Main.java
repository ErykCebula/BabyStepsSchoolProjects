/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dupa;

/**
 *
 * @author Hawkish
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Model model = new Model();
        
        GUI gui = new GUI(controller);
        controller.setModel(model);
        
        model.setClear(gui);
        model.setAdd(gui);
        
        gui.init();
    }
}
