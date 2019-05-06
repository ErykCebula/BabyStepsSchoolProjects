/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.IOException;
import view.View;

/**
 *
 * @author Hawkish
 */
public class WorkThread {
    public static int counter= 0;
    String komenda;
    String choice;
    View view;
    public Client client;

    public void DaneOdSerwera(String oponent) {
        this.komenda = oponent;
    }
        public void initGameWindow() throws IOException {
       Client client= new Client(this, view);
       client.run();
       this.client = client;
    }
        public void setChoice(String choice){
            this.choice=choice;
            this.client.sendData(choice);

               if("p".equals(komenda)){
                    addCounter();
                }
                else if ("k".equals(komenda)) {
                    minusCounter();
;
                }
  

            

            
                    }
        public  void addCounter(){
            this.counter=counter+10;
    }
        public  void minusCounter(){
            this.counter=counter-10;
                    }
        public synchronized int getCounter(){
          return  this.counter=counter;
        }


}
