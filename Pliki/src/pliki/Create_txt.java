/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pliki;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hawkish
 */
public class Create_txt {

    Random rand = new Random();
    int rand_int1 = rand.nextInt(1000);

    public void create_rand() {
        for (int i = 0; i < 10; i++) {

            try {
                File out = new File("test" + i + ".txt");
                FileWriter fw = new FileWriter(out);
                BufferedWriter wr = new BufferedWriter(fw);
                for (int x = 0; x < rand.nextInt(100000000); x++) {
                    wr.write(String.valueOf(rand.nextInt(1000)));
                    wr.newLine();
                }
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Create_txt.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(i);
        }
    }
}
