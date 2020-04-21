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
abstract  class State {
    
    //felveszek egy uj állapotot. Kikapcsolás.
    public void pull(change wrapper) {
        wrapper.setState(new Off_state());
        System.out.println("  Kikapcsolás.");
    }
}
