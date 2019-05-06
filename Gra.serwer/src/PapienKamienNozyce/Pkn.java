/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PapienKamienNozyce;

/**
 *
 * @author Hawkish
 */
public class Pkn {
    
    String papier = "Papier";
    String kamien = "Kamień";
    String nozyce = "Nożyce";
    
    
        public boolean isWin() {
        if ((papier.equals("X") && kamien.equals("X"))
                || (kamien.equals("X") && nozyce.equals("X"))
                || (nozyce.equals("X") && papier.equals("X"))
                ) {
            return true;
        } else {
            return false;
        }
    }
       public boolean isTie() {
        if ((papier.equals("X") && papier.equals("X"))
                || (kamien.equals("X") && kamien.equals("X"))
                || (nozyce.equals("X") && nozyce.equals("X"))
                ) {
            return true;
        } else {
            return false;
        }
    }
        public boolean isLose() {
        if ((kamien.equals("X") && papier.equals("X"))
                || (nozyce.equals("X") && kamien.equals("X"))
                || (papier.equals("X") && nozyce.equals("X"))
                ) {
            return true;
        } else {
            return false;
        }
    }
        
      public String avaiblePicks() {
        return "\n " + papier + "\n " + kamien +"\n " + nozyce;
    }
          public void setPapier(String arg) {
        this.papier = arg;
    }

    public void setKamien(String arg) {
        this.kamien = arg;
    }

    public void setNozyce(String arg) {
        this.nozyce = arg;
    }
}
