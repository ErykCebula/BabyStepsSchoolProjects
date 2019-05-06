/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import model.Model;

/**
 *
 * @author Hawkish
 */
public class Controller {
    Model model;
    public String wynik;
    public Client client;
    public Controller(Model model) 
    {
        this.model=model;
    }

    public void initGameWindow() throws IOException {
       Client client= new Client(this);
       client.run();
       this.client = client;
    }

     void serverDataIncome(String answer) {
       model.setOponent(answer);
       // to nie jest brak synchronizacji
    }


    
         public void setChoice(String choice) {
        model.choice=choice;
        this.client.sendData(model.choice);
        while (model.getOponent()==null){
        if (model.choice.equals(model.getOponent())){
            this.wynik="Remis";
        } else if (("K".equals(model.choice) && "P".equals(model.getOponent()))||
                ("P".equals(model.choice) && "N".equals(model.getOponent())) ||
                ("N".equals(model.choice) && "K".equals(model.getOponent()))
                ) {
            this.wynik="Przegrana";
            
        } else {
            this.wynik="Wygrana";
            model.points++;
        }
        }

    }
    
   public int getCounter(){
        return model.counter;
    }
   public int getPoints(){
        return model.points;
    }
}
