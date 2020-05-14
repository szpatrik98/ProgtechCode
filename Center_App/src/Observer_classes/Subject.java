/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_classes;


/**
 *
 * @author szabb
 */
public interface Subject {
   
// a szükséges hozza adás,törlés,és kiírás metodus.
  void Attach(Observer o);
  void Dettach(Observer o);
  void Notify();

    
}
