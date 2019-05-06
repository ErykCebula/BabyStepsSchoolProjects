/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
/**
 *
 * @author Hawkish
 */
public class Game {
    Player player;
    Mob mob=new Mob();
    View view;
public void init(){
    player.registerOnAttack(view);
    view.init();
}    
public void setPlayer(Player player){
    this.player=player;
}
public void setView(View view){
    this.view=view;
    player.registerOnAttack(view);
}
public void attack(){
    player.attack(mob);
}
public void run(){
    view.init();
}
}
