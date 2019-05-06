/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serwersprog;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Hawkish
 */
public class Serwer {
    ArrayList<PrintWriter> clients= new ArrayList<>();

    /**
     * Runs the server.
     */
    public void run() throws IOException {
        ServerSocket listener = new ServerSocket(9090);        
        try {
            while (true) {
                Socket socket = listener.accept();                
                try {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    clients.add(out);
                    Thread PodlaczonyKlient = new Thread(new PodlaczonyKlient(this,socket));
                    PodlaczonyKlient.start();

                } finally {
                }
            }
        }
        finally {
            listener.close();
        }
    }

    synchronized void broadcastToAll(String outputStr) {
        System.out.println("broadcasting:"+outputStr);
        for(PrintWriter out : clients) {
            out.println(outputStr);
        }}}
