/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;
import game.Game;
import game.Game;
/**
 *
 * @author Hawkish
 */
public class ConsoleController {
    Game game;
    public void setGame(Game game){
        this.game=game;
        
    }
    public void attack(){
        game.attack();
    }
}
