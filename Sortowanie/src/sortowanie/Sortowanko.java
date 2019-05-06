/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortowanie;

/**
 *
 * @author Hawkish
 */
public class Sortowanko extends Thread {

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low-1;
        int j = high+1;
         do
           i= i + 1;
        while (arr[i] < pivot);
        do
            j= j - 1;
        while (arr[j] > pivot);

        if (i >= j)
            return j;
        return j;
    }
        private int arr[];
        private int low,high;
        public static int numThreads = Runtime.getRuntime().availableProcessors();
        public static int count = 0;

        public Sortowanko(int[] arr, int low, int high){
            this.arr = arr;
            this.low = low;
            this.high = high;
        }
        public void run(){
            parallelQuicksort(arr,low,high);    
        }

        public static void quicksort(int[] arr, int low, int high){
            if (high>low){
                int i = partition(arr,low,high);
                quicksort(arr,low,i-1);
                quicksort(arr,i+1,high);
            }
        }
            public static  void parallelQuicksort(int[] arr, int low, int high){
            if (high>low){
                int i = partition(arr,low,high);
                if (count < numThreads){
                    count++;
                    Sortowanko quicksort  = new Sortowanko(arr, low, i-1);
                    quicksort.start();
                    try{
                        quicksort.join();
                    }
                    catch (InterruptedException e){}
                }
                else{
                    quicksort(arr,low,i-1);
                }   
                if (count < numThreads){
                    count++;
                    Sortowanko quicksort  = new Sortowanko(arr, i+1, high);
                    quicksort.start();
                    try{
                        quicksort.join();
                    }
                    catch (InterruptedException e){}
                }
                else{
                    quicksort(arr,i+1,high);
                }   
                    for
                            (int k : arr) {
                System.out.println(k + ", ");
                     
            }}
               // for (int i : arr) {
     // System.out.print(i + ", ");
    //}
        }

}