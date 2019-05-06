/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import game.Game;
import game.Player;

/**
 *
 * @author Hawkish
 */
public class Main {
    public static void main(String[] args){
       
        // TODO code application logic here
    GuiView view = new GuiView();
    GuiController controller = new GuiController();
    Player player = new Player();
    Game game = new Game();
    controller.setGame(game);
    view.setController(controller);
    game.setPlayer(player);
    game.setView(view);
    
    view.init();
    }

}
