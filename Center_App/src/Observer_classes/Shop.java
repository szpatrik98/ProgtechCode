/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_classes;

import java.util.ArrayList;

/**
 *
 * @author szabb
 */
public class Shop implements Subject{
    private ArrayList<Travel> allTravel;
    private ArrayList<Observer> observers;
    
    
    public  Shop(){
        allTravel = new ArrayList<>();
        observers = new ArrayList<>();
    }
    
    public void addTravel(Travel t){
        allTravel.add(t);
        Notify();
    }

    public Travel getState(){
        return allTravel.get(allTravel.size()-1);
    }
    
    
    public void Attach(Observer o) {
        observers.add(o);
    }

   
    public void Dettach(Observer o) {
         observers.remove(o);
    }

    
    public void Notify() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }
}
