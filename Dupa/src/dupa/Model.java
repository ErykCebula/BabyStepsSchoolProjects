/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dupa;

import java.util.ArrayList;

/**
 *
 * @author Hawkish
 */
public class Model {
    OnClear onclear;
    OnAdd onadd;
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addItem(String item){
      groceryList.add(item);
      onadd.addedItem(item);
    }
   public void clear(){
       groceryList.clear();
       onclear.wyczyszczono();
   }
   public int size(){
       return groceryList.size();
   }
   public String getItem(int number){
       return groceryList.get(number);
   }
   public void setClear(OnClear onclear){
       this.onclear=onclear;
   }
   public void setAdd(OnAdd onadd){
       this.onadd=onadd;
      }
}
