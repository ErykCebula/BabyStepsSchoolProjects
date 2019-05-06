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
public class Player {
    int Hp=20;
    OnAttack onAttack;
    public void registerOnAttack(OnAttack onAttack){
        this.onAttack=onAttack;
    }
    public void hit(int hp){
        this.Hp-=hp;
    }
    public int getHp(){
        return Hp;
    }
    public boolean isDead(){
        return this.Hp<=0;
    }
    public void attack(Mob mob){
        int dmg = 5;
        onAttack.onAttack(dmg);
        mob.hit(dmg);
    }
}
