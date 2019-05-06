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

import java.util.List;

import static sortowanie.QuickSort.numThreads;
 
public class QuickSort <T extends Comparable> extends Thread {
 
    private List<T> data;
    private int left;
    private int right;
    public static int numThreads = Runtime.getRuntime().availableProcessors();
    public static int count = 0;
 
    public QuickSort(List<T> data){
        this.data=data;
        this.left = 0;
        this.right = data.size() - 1;
    }
 
    public QuickSort(List<T> data, int left, int right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
 
    @Override
            public void run(){

        }
           
    protected void compute() throws InterruptedException {
        if (left < right) {
            int pivotIndex = left + ((right - left) / 2);

            pivotIndex = partition(pivotIndex);
            QuickSort[] pracownicy = new QuickSort[numThreads];

            for (int i = 0; i < pracownicy.length; i++) {
                pracownicy[i] = new QuickSort(data, left, pivotIndex - 1);
                pracownicy[i].start();
            }
            QuickSort[] pracownicy2 = new QuickSort[numThreads];
            for (int i = 0; i < pracownicy2.length; i++) {
                pracownicy2[i] = new QuickSort(data, pivotIndex + 1, right);
                pracownicy[i].start();
            }
            //  pracownicy[i] =new QuickSort(data, pivotIndex+1, right);
            for (int i = 0; i < pracownicy.length; i++) {
                pracownicy[i].join();
            }
            for (int i = 0; i < pracownicy2.length; i++) {
                pracownicy[i].join();
            }
        }

    }

    private int partition(int pivotIndex){
        T pivotValue = data.get(pivotIndex);
 
        swap(pivotIndex, right);
 
        int storeIndex = left;
        for (int i=left; i<right; i++){
            if (data.get(i).compareTo(pivotValue) < 0){
                swap(i, storeIndex);
                storeIndex++;
            }
        }
 
        swap(storeIndex, right);
 
        return storeIndex;
    }
 
    private void swap(int i, int j){
        if (i != j){
            T iValue = data.get(i);
 
            data.set(i, data.get(j));
            data.set(j, iValue);
        }
    }
}

