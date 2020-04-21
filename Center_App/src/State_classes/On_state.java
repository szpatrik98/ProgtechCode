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
public class On_state extends State {
    //felveszek egy uj állapotot. A hangerő fel állapot.
    public void pull(change wrapper) {
        wrapper.setState(new Volume_Up_state());
        System.out.println("  Hangerő fel.");
    }
}