/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Hawkish
 */
public class Sort_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<Integer> numbers = new ArrayList<Integer>();
        List<String> map= new ArrayList<String>();
        String fileName = "C:\\Users\\Hawkish\\Desktop\\test.txt";
        String line = null;
       FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        while ((line = bufferedReader.readLine()) != null) {
            map.add(line);
                    
        } 

             while ((line = bufferedReader.readLine()) != null) {
         String []strNumbers = line.split(" ");
         for(String strNumber : strNumbers){
             numbers.add(Integer.parseInt(strNumber));
                        System.out.println(numbers);
         }
        
     }   
     bufferedReader.close();

     Collections.sort(numbers);
     FileWriter zapis = new FileWriter("C:\\Users\\Hawkish\\Desktop\\test2.txt");
     for (Integer val :numbers){
     zapis.write(val.toString());
     zapis.write("\r\n");
     }
    zapis.close();
     //System.out.println(numbers);
     /*PrintWriter zapis = new PrintWriter("C:\\Users\\Hawkish\\Desktop\\test2.txt");
     BufferedWriter bufferedWriter =new BufferedWriter(zapis);
     zapis.println(numbers);
     zapis.close();*/
    //   PrintWriter zapis = new PrintWriter("C:\\Users\\Hawkish\\Desktop\\test2.txt");
       //zapis.println(""+numbers);
    //   zapis.close();
        
        
        
    }
    
}
