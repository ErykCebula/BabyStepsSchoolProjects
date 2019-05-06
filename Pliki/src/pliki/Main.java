/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Hawkish
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        //List<MyThread> pracownicy = new ArrayList<>();
        Bars bars = new Bars();
        bars.setVisible(true);
        int numOfBar = 4;
        int numOfThreads = 4;
        //Create_txt dupa = new Create_txt();
        //dupa.create_rand();
       
        int capacity = 10;
        BlockingQueue<File> queueFile = new ArrayBlockingQueue<File>(capacity);
        for (int i = 0; i < capacity; i++) {
            File br = new File("test" + i + ".txt");
            queueFile.put(br);

        }

        BlockingQueue<javax.swing.JProgressBar> progresy = new ArrayBlockingQueue<javax.swing.JProgressBar>(numOfBar);
        for (int i = 0; i < 1; i++) {
            progresy.put(bars.jProgressBar1);
            progresy.put(bars.jProgressBar2);
            progresy.put(bars.jProgressBar3);
            progresy.put(bars.jProgressBar4);

        }
        MyThread[] pracownicy = new MyThread[numOfThreads];
        for (int i = 0; i < pracownicy.length; i++) {
            pracownicy[i] = new MyThread("Pracownik_" + i, queueFile, bars, progresy);
            pracownicy[i].start();
        }

        // 
        /* for (int i = 0; i < numOfThreads; i++) {
            pracownicy.get(i).join();11
        } */
    }

}
