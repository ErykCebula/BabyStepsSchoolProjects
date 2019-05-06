/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Hawkish
 */
public class MultiThreadSort {

    public int[] arrayHandler(int threads, int[] array) throws InterruptedException {

        // Not enough threads or wrong size of array
        if (array.length < 1 || threads < 1) {
            System.out.println("Array length or number of threads can't be less than 1");
            return array;
        } // Only 1 element array or only 1 thread
        else if (array.length == 1) {
            return array;
        } else {
            if (threads >= array.length) {
                Arrays.sort(array);
                return array;
            } // Normal case
            else {
                int liczbaCzesci = array.length / threads;
                // podzial na czesci

                /*    public static int[] copyOfRange(int[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        int[] copy = new int[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }*/

 /* public static void sort(int[] a, int fromIndex, int toIndex) {
            rangeCheck(a.length, fromIndex, toIndex);
            DualPivotQuicksort.sort(a, fromIndex, toIndex - 1, null, 0, 0);
            }*/
                // specyfikacja sorta dla tablica
                int[][] czesciTablicy = new int[liczbaCzesci][];
                int znacznik = 0;
                List<Integer> posortowaneCzesci = new ArrayList<>();
                List<MyThread> wszystkieCzesci = new ArrayList<>();

                for (int i = 0; i < liczbaCzesci; i++) {
                    int part = threads;
                    czesciTablicy[i] = Arrays.copyOfRange(array, znacznik, array.length * (part / threads));
                    znacznik = array.length * (part / threads);
                    part = part - 1;

                    //znacznik, miejsce od ktorego tworzy nowy array 
                    wszystkieCzesci.add(new MyThread(czesciTablicy[i]));
                    // dodaje pociete czesci do kolejnej tablicy
                }
                // tablica pracownikow do wystartowania
                for (int i = 0; i < liczbaCzesci; i++) {
                    wszystkieCzesci.get(i).start();
                }
                // 
                for (int i = 0; i < liczbaCzesci; i++) {
                    wszystkieCzesci.get(i).join();
                }
                // łączenie tablic
                for (int i = 0; i < liczbaCzesci; i++) {
                    for (int j = 0; j < czesciTablicy[i].length; j++) {
                        posortowaneCzesci.add(czesciTablicy[i][j]);
                    }
                }
// stream z wykladu z notacja lambda
                int[] koncowa = posortowaneCzesci.stream().mapToInt(i -> i).toArray();
                return koncowa;
            }
        }
    }

    public int[] generateArray(int length) {
        Random rand = new Random();
        int[] elements = new int[length];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = rand.nextInt(100) + 1;
        }

        return elements;
    }
}
