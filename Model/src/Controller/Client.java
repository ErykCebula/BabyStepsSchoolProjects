/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Client {
    BufferedReader in;
    PrintWriter out;
    Controller controller;
    public Client(Controller controller){
        this.controller=controller;
    }

    /**
     * Runs the client as an application.  First it displays a dialog
     * box asking for the IP address or hostname of a host running
     * the date server, then connects to it and displays the date that
     * it serves.
     */
    public void run() throws IOException {
        /*
        String serverAddress = JOptionPane.showInputDialog(
            "Enter IP Address of a machine that is\n" +
            "running the date service on port 9090:");
*/
        String serverAddress = "127.0.0.1";
        Socket socket = new Socket(serverAddress, 9090); 
        
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));// to dostaje od serwera wiadomosc
        out = new PrintWriter(socket.getOutputStream(), true);
        new Thread(new ClientType(in,controller)).start();
        
    }
    
    public void sendData(String s) {
        out.println(s);
        // synchronized nic nie daje
    }
}
