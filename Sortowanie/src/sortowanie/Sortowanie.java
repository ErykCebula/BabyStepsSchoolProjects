/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortowanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Hawkish
 */
public class Sortowanie {
    

    /**
     * @param args the command line arguments
     */
    
         public static void main(String[] args) throws InterruptedException {
         final int SIZE = 10;
 
        List<Integer> myList = new ArrayList<Integer>(SIZE);
 
        for (int i=0; i<SIZE; i++){
            int value = (int) (Math.random() * 100);
            myList.add(value);
        }
        myList.forEach(System.out::println);
 
        QuickSort<Integer> quickSort = new QuickSort<Integer>(myList);
       QuickSort quicksort=new QuickSort(myList); 
       quicksort.compute();
       myList.forEach(System.out::println);
 

    
     

         
         
         
         }}

    
    

