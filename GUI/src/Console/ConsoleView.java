/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import game.View;
import Console.ConsoleController;
import game.OnAttack;
import java.util.Scanner;

/**
 *
 * @author Hawkish
 */
public class ConsoleView implements OnAttack, View {
    ConsoleController controller;
    public void setController(ConsoleController controller){
    this.controller=controller;}
    
    @Override
    public void init(){
        System.out.println("Welcome!");
        Scanner in=new Scanner(System.in);
        do{
            System.out.println("1 - strzal, 0 - wyjscie");
            int option=in.nextInt();
      switch(option){
          case 1 : controller.attack();
          break;
          case 0 : break;
      }; 
        }
        while(true);
        
    }
    @Override
 public void onAttack(int dmg){
     System.out.println("Was hit for :"+dmg);
 }
    
}
