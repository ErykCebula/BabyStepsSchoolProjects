/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtread;

import java.util.Arrays;

/**
 *
 * @author Hawkish
 */
public class MyThread extends Thread {

    int[] fragment;
// konstruktor
    MyThread(int[] arrayFragment) {
        this.fragment = arrayFragment;
    }
// czynnosc wykonywana przez watek
    public void run() {
        Arrays.sort(fragment);     
    }
// klasyczny get
    int[] getValue() {
        return this.fragment;
    }
}
