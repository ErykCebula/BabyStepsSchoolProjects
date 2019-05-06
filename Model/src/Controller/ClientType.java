/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Hawkish
 */
public class ClientType implements Runnable {

    BufferedReader in;
    Controller controller;

    public ClientType(BufferedReader in, Controller controller) {
        this.controller = controller;
        this.in = in;
    }

    public void run() {
        while (true) {
            String answer;
            try {
                answer = in.readLine();
                controller.serverDataIncome(answer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
