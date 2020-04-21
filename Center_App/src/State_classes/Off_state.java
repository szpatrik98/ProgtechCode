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
public class Off_state extends State {
    
    //felveszek egy uj állapotot. A bekapcsolás állapotát.
    public void pull(change wrapper) {
        wrapper.setState(new On_state());
        System.out.println( "  Bekapcsolás. " );
 }
}