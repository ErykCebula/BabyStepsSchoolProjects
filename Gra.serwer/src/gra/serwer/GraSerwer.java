/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gra.serwer;

import PapienKamienNozyce.Pkn;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Hawkish
 */
public class GraSerwer {
  ArrayList<PrintWriter> clients= new ArrayList<>();
    static Pkn pkn = new Pkn();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int port=9090;
   // ServerSocket listener = new ServerSocket(9090); 
        System.out.println("Server waiting for connection on port " + port);
        ServerSocket serverSocket = new ServerSocket(port);
        Socket clientSocket = serverSocket.accept();
        System.out.println("Received connection from " + clientSocket.getInetAddress() + " on port " + clientSocket.getPort());

        OdKlienta receive = new OdKlienta(clientSocket);
        Thread receiveThread = new Thread(receive);
        receiveThread.start();

        DoKlienta send = new DoKlienta(clientSocket);
        Thread sendThread = new Thread(send);
        sendThread.start();
    }

}
