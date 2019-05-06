/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controller.Controller;
import View.View;

/**
 *
 * @author Hawkish
 */
public class Main {
    
        public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);
        view.init();
    }
    
}
