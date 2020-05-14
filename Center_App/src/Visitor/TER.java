/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author szabb
 */
public class TER implements Base {
    //az összes függvény kifejtése/impelemtálás.
    public void execute(Base base) {
        base.doJob(this);
    }

    public void doJob(SER foo) {
        System.out.println("        A boltos hivni fogja a szálítót.");
    }

    public void doJob(BER bar) {
        System.out.println("        A vásárló hívni fogja a szálítót.");
    }

    public void doJob(TER baz) {
        System.out.println("        A száltíó hivja a boltost.");
    }
}
