/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressfun;



import Client.WorkThread;
import java.io.IOException;
import view.View;



/**
 *
 * @author Hawkish
 */
public class Progressfun {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws IOException {
    WorkThread murzyn = new WorkThread();
    murzyn.initGameWindow();
        View view = new View(murzyn);
        view.init();
        
        
    }
    
}
/*synchronized ({obiekt synchronizujący}) {
  {kod synchronizowany}
}*/
