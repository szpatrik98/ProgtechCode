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
public class BER implements Base {
    public void execute(Base base) {
        base.doJob(this);
    }

    public void doJob(SER foo) {
            System.out.println("        A Boltos hívni fogja a vásárlót.");
    }

    public void doJob(BER bar) {
        System.out.println("        A vásárló hivja a boltost.");
    }

    public void doJob(TER baz) {
                System.out.println("        A szálító hivni fogja a boltost.");
    }
}
