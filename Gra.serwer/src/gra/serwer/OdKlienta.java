package gra.serwer;

import PapienKamienNozyce.Pkn;
import static gra.serwer.GraSerwer.pkn;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class OdKlienta implements Runnable {

    Socket kontaktClient = null;
    BufferedReader out = null;

    public OdKlienta(Socket clientSocket) {
        this.kontaktClient = clientSocket;
    }

    public void run() {
        try {
            out = new BufferedReader(new InputStreamReader(this.kontaktClient.getInputStream()));

            String messageString;
            while (true) {
                while ((messageString = out.readLine()) != null) {
                    if (messageString.equals("")) {
                        break;
                    } else if (messageString.equals("Papier")) {
                        pkn.setPapier("X");
                    } else if (messageString.equals("Nozyce")) {
                        pkn.setNozyce("X");
                    } else if (messageString.equals("Kamien")) {
                        pkn.setKamien("X");
                    }
                    System.out.println("From Client: " + messageString);
                    System.out.print("Chat to Client: ");
                }
                this.kontaktClient.close();
                System.exit(0);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
