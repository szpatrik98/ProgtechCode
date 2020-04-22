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
public class Volume_Up_state extends State {
    
    //felveszek egy uj állapotot. A hangerő le állapot.
    public void pull(change wrapper) {
        wrapper.setState(new Volume_Low_state());
        System.out.println("         Hangerő le.");
    }
}