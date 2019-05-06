/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serwersprog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hawkish
 */
public class PodlaczonyKlient implements Runnable {
    Socket socket;
    Serwer server;
    PodlaczonyKlient(Serwer server, Socket socket) {
        this.socket = socket;
        this.server = server;

    }

    @Override
    public void run() {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true) {
                String inputStr = in.readLine();
                server.broadcastToAll(inputStr);
            }   
        } catch (IOException ex) {
            Logger.getLogger(Serwer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(Serwer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
