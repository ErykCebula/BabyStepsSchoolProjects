/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dupa;

/**
 *
 * @author Hawkish
 */
class Controller {
    Model model=null;
    void setModel(Model model ) {
        this.model = model;
    }

    void addItem(String text) {
        model.addItem(text);
    }
    void clear(){
        model.clear();
    }

    int size() {
        return model.size();
    }

    String getItem(int number) {
        return model.getItem(number);
    }
    
}
