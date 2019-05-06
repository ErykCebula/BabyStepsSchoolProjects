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
import java.io.PrintWriter;
import java.net.Socket;

public class ToSend implements Runnable {

    Socket socket = null;
    PrintWriter out = null;
    BufferedReader in = null;

    public ToSend(Socket sock) {
        this.socket = sock;
    }

    public void run() {
        try {
            if (socket.isConnected()) {
                System.out.println("Podlaczono uzytkownika");
                this.out = new PrintWriter(socket.getOutputStream(), true);
                while (true) {
                    in = new BufferedReader(new InputStreamReader(System.in));
                    String msgToServer = null;
                    msgToServer = in.readLine();
                    this.out.println(msgToServer);
                    this.out.flush();

                    if (msgToServer.equals("")) {
                        break;
                    }
                    System.out.print("Hi, hey Hello into chatroom:");
                }
                socket.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
