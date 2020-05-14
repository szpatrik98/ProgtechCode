/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State_classes;

/**
 *
 * @author szabb
 */
public class change {
   
    //létre hozok egy state változot.
    private State current;

    //létre hozom az alap állapot.
    public change() {
        current = new Off_state();
    }

    //létre hozok egy állapot beálitás metodust.
    public void setState(State state) {
        current = state;
    }

    //létre hozom a felküldés metodust.
    public void pull() {
        current.pull(this);
    }
}
