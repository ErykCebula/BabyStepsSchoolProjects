/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gra.serwer;

/**
 *
 * @author Hawkish
 */
import static gra.serwer.GraSerwer.pkn;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class DoKlienta implements Runnable {

    String choseOptions = ("Opcje do wyboru:\n").concat(pkn.avaiblePicks());

    PrintWriter pwMsg;
    Socket kontaktClient;

    public DoKlienta(Socket clientSock) {
        this.kontaktClient = clientSock;
    }

    public void run() {
        try {
            pwMsg = new PrintWriter(new OutputStreamWriter(this.kontaktClient.getOutputStream()));
            if (kontaktClient.isConnected()) {
                pwMsg.println(choseOptions
                        + "\n\n Wybierz jedną z trzech opcji"
                        + "\n/albo wcisnij enter zeby wyjsc");
                pwMsg.flush();
            }
            while (true) {

                String msgToClientString;
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

                msgToClientString = input.readLine();
                if (pkn.isWin() == true) {
                    pwMsg.println("Wygrales");
                    pwMsg.flush();
                    break;
                } else if(pkn.isLose()) {
                    pwMsg.println(msgToClientString + "\nINFO ABOUT GAME:\n" + pkn.avaiblePicks());
                    pwMsg.flush();
                } else
                {pkn.isTie();
                 pwMsg.println("Remis");
                 pwMsg.flush();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
