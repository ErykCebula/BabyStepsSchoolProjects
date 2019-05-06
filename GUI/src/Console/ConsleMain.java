/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;
import game.Game;
import game.Player;
/**
 *
 * @author Hawkish
 */
public class ConsleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ConsoleView view = new ConsoleView();
    ConsoleController controller = new ConsoleController();
    Player player = new Player();
    Game game = new Game();
    controller.setGame(game);
    view.setController(controller);
    game.setPlayer(player);
    game.setView(view);
    
    view.init();
    }
    
}
