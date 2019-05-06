/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
Odczyt z pliku
Sortowanie:Bubble
Zapis do nowego pliku

*/
/**
 *
 * @author Hawkish
 */
public class MyThread extends Thread {
     public int test1;
     int test2;
    BlockingQueue<javax.swing.JProgressBar> progress ;
    String threadName;
    BlockingQueue<File> queue;
    List<Integer> list = new ArrayList<>();
    Bars bars = new Bars();
      

    public MyThread(String nazwa_watku, BlockingQueue<File> kolejka, Bars bars,BlockingQueue<javax.swing.JProgressBar> progresy ) {
        this.threadName = nazwa_watku;
        this.queue = kolejka;
        this.bars=bars;
        this.progress=progresy;
    }
    public int getSize(){
                       for (int j = 0; j < list.size(); j++) {

                    for (int i = j + 1; i < list.size(); i++) {

                        if ((list.get(i)).compareTo(list.get(j)) < 0) {

                            int t = list.get(j);

                            list.set(j, list.get(i));
                            list.set(i, t);

                        }

                    }
                    test1++;
                  //   System.out.println(dupa);
                }
               // System.out.println(dupa);
       return list.size();
    }

    @Override
    public void run() {
        while (true) {
            try {
                javax.swing.JProgressBar z = progress.take();
                File x = queue.take();
// Podebral z kolejki
//System.out.println("Watek"+kolejka.take().getName()+"Wzial z kolejki");
                System.out.println(Thread.currentThread().getName() + " zdjal " + x);
                BufferedReader xr = new BufferedReader(new FileReader(x));
                String line = xr.readLine();
                
                while (line != null) {

                    list.add(Integer.valueOf(line));
                    line = xr.readLine();
                }
                

// przecczytal plik
// >>>>>>>>>>>>>>>>>>>>>>>>>>>BUBBLE SORT<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
                   z.setMaximum(list.size());
                   z.setMinimum(0);
                for (int j = 0; j < list.size(); j++) {
                    z.setValue(j);
                    for (int i = j + 1; i < list.size(); i++) {

                        if ((list.get(i)).compareTo(list.get(j)) < 0) {

                            int t = list.get(j);

                            list.set(j, list.get(i));
                            list.set(i, t);

                        }

                    }
                   
                  //   System.out.println(dupa);
                }
                
               // System.out.println(dupa);
// posortowal
System.out.println(Thread.currentThread().getName()+"Posortowal");
                File out = new File("Beta"+ x );
                System.out.println("Beta"+ x + "txt");
                FileWriter fw = new FileWriter(out);
                BufferedWriter writer = new BufferedWriter(fw);
                // stworzyl do zapisu
                for (Integer lane : list) {
                    writer.write(String.valueOf(lane));
                    writer.newLine();
                }
                System.out.println(Thread.currentThread().getName()+" zapisal");
                writer.close();
                        // zapisal
                       
                   progress.put(z);
                if (queue.isEmpty()) {
                    System.out.println("Wartek : " + x + " konczy prace");
                    z.setValue(z.getMaximum());
                    break;

                }
                // System.out.println(Thread.currentThread().getName()+" zdjal " + x);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
