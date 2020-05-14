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
public class Person implements Observer{
    
    String name ;
    
    public Person(String name){
        this.name=name;
    }

    
    public void checkTravel(Travel t){
        
            if(name.compareTo(t.receiverName) == 0)
                System.out.println("       " +name + ": "+t.content);
        
    }
    
    public void update(Object o) {
       
        if(o instanceof  Shop){
            Shop so = (Shop) o;
            checkTravel(so.getState());
        }
    }
}
