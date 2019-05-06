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
public class Main {
     public static void main(String[] args){
      Game game = new Game();
        Controller controller = new Controller(game);
        
        Console console = new Console(controller);
        
        game.setOnSwappedHandler(console);

        console.init();
     }
}
