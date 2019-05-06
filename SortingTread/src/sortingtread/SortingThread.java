/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtread;

/**
 *
 * @author Hawkish
 */

    /**
     * @param args the command line arguments
     */
   public class SortingThread {
        /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
//tablica tablic
//podzielic na mniejsze, copyofrange(sprawdzic)?
//wystartowac
//join
//dodac do tablicy
    public static void main(String[] args) throws InterruptedException {
        System.out.println(args.length);
        //int arrayLength= 10;
        int numOfThreads = Runtime.getRuntime().availableProcessors();
        int arrayLength = Integer.parseInt(args[0]);
       // int amountOfThreads = Integer.parseInt(args[1]);
        

        MultiThreadSort test1 = new MultiThreadSort();
        int[] mojaTablica = test1.generateArray(arrayLength);

        System.out.println("Array before sorting: ");
        for (int x = 0; x < mojaTablica.length; x++) {
            System.out.print(mojaTablica[x] + " ");
        }
        mojaTablica = test1.arrayHandler(numOfThreads, mojaTablica);

        System.out.println("\n\nArray after sorting: ");

        for (int j = 0; j < mojaTablica.length; j++) {
            System.out.print(mojaTablica[j] + " ");
        }
        System.out.println("");
    }

   }