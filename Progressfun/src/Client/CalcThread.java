/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import static Client.WorkThread.counter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.View;

/**
 *
 * @author Hawkish
 */
public class CalcThread extends Thread {
    BufferedReader in;
    WorkThread murzyn;
    View view;
    

    CalcThread(BufferedReader in, WorkThread murzyn, View view) {
        this.in=in;
        this.murzyn=murzyn;
        

    }
    @Override
        public void run() {
        while (true) {
            String answer;
            try {
                answer = in.readLine();
                murzyn.DaneOdSerwera(answer);
                while(answer!=null){
                if(answer.equals("p")){
                    murzyn.addCounter();
                    view.jProgressBar1.setValue(counter);
                }
                else if (answer.equals("k")) {
                    murzyn.minusCounter();
                    view.jProgressBar1.setValue(counter);
    
                }
                else{
                    
                }
                answer=null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
