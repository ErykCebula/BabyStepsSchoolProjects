/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klient;

import java.net.Socket;

/**
 *
 * @author Hawkish
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String serverAddress = "127.0.0.1";
            Socket socket = new Socket(serverAddress, 9000);
            ToSend sendToServer = new ToSend(socket);
            Thread sendThread = new Thread(sendToServer);
            sendThread.start();
            Recived recieveThread = new Recived(socket);
            Thread receiveThread = new Thread(recieveThread);
            receiveThread.start();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

}
