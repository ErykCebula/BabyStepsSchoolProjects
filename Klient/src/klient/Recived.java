/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klient;

/**
 *
 * @author Hawkish
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Recived implements Runnable {

    Socket socket;
    BufferedReader reader;

    public Recived(Socket sock) {
        this.socket = sock;
    }

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            String msgRecieved;
            while ((msgRecieved = reader.readLine()) != null) {
                System.out.println("Message from Server: " + msgRecieved);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
