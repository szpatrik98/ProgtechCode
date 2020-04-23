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
public class SER  implements Base{
      public void execute(Base base) {
        base.doJob(this);
    }

   public void doJob(SER foo) {
        System.out.println("        A boltos hívja a vásárlót.");
    }

    public void doJob(BER bar) {
        System.out.println("        A boltos hívni fogja a vásárlót.");
    }

    public void doJob(TER baz) {
        System.out.println("        A boltos hívni fogja a vásárlót.");
    }
}
