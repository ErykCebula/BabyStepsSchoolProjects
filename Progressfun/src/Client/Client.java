/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.in;
import java.net.Socket;
import view.View;

/**
 *
 * @author Hawkish
 */
public class Client {
    BufferedReader in;
    PrintWriter out;
    WorkThread murzyn;
    View view;
    public Client(WorkThread murzyn,View view){
        this.murzyn=murzyn;
        this.view=view;
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
        
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));// to jest wiadomosc od serwera czyli innego klienta ktory wyslal do serwera a serwer rozglosil
        out = new PrintWriter(socket.getOutputStream(), true);// to jest to co ja bede wysylal do serwera
         new Thread(new CalcThread(in,murzyn,this.view)).start();
         out.flush();

    }
    
    public void sendData(String s) {
        out.println(s);
        // synchronized nic nie daje
    }
    
}
