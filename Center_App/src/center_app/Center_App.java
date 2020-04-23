/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package center_app;

import Observer_classes.Person;
import Observer_classes.Shop;
import Observer_classes.Travel;
import Prototype.Lejatszas_mod;
import Prototype.Hangszoro;
import Prototype.Center;
import State_classes.change;
import Visitor.BER;
import Visitor.Base;
import Visitor.SER;
import Visitor.TER;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author szabb
 */
public class Center_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        
        //példányosíto  lejátszási módót.
        Lejatszas_mod CD = new Lejatszas_mod("CD-és");
        
        //példányosítok  hangszoro tipust aminek van lejátszási módja
        Hangszoro JBL = new Hangszoro("JBL",CD);
        
        //hozzá adom a hangszorok listához.
        ArrayList<Hangszoro> hangszorok = new ArrayList<Hangszoro>();
        hangszorok.add(JBL);
        
        //példányosítok és clonozok centereket.
        Center ujCenter_Sony = new Center("     Sony",                                
                                4,
                                hangszorok);
        Center ujCenter_Samsung = new Center("      Samsung",                                
                                2,
                                hangszorok);
        
       Center ujCenter_Philiphs = ujCenter_Sony.clone("     Philiphs");
        
        //létre hozok egy centerek listát majd hozzá adom a létre jött centereket.
        ArrayList<Center> centerek = new ArrayList<Center>();
        centerek.add(ujCenter_Sony);
        centerek.add(ujCenter_Samsung);
        centerek.add(ujCenter_Philiphs);

        //az összes centert tulajdonságal kiirtaom és azért forral hogy ha ksssőbbiekbe 
        //bővitve lenne a program ne keljen még ezzel foglalkozni.
        for(Center center : centerek){
            System.out.println(center.getNev() + " Típusú és A Hangszórók száma : " +                               
                                center.getHangszorok_szama());
            
            for (Hangszoro hangszoro : center.hangszorok){
                System.out.println("            a hangszoro márkája" +": " + hangszoro.getName());
                //System.out.println(" Lejátszás módja: "+ hangszoro.getLejatszas_mode());
            }
            
        }
        
        System.out.println();              
        //Observer
        
        System.out.println("           A megrendelések listája.");
        System.out.println();
        Shop shop = new Shop();
        
        Person chris = new Person("Chris");
        Person john = new Person("John");
        Person roger = new Person("Roger");
        
        Travel at_home = new Travel("John","    Házhoz szálitással kérte.");
        Travel go_to = new Travel("Chris","     Érte megy majd.");
        Travel now = new Travel("Roger","   Helyben vásárolta most.");
        
        
        shop.Attach(chris);        
        shop.Attach(john);
        shop.Attach(roger);     
                   
        shop.addTravel(at_home);                       
        shop.addTravel(go_to);
        shop.addTravel(now);
        
       
        System.out.println();   
        //visistor
        
        System.out.println("A telefonos megrendelés folymatai:  ");   
        
        Base objects[] = {new SER(), new BER(), new TER()};
        for (Base object : objects) {
            for (int j = 0; j < 3; j++) {
                object.execute(objects[j]);
            }
            System.out.println();
        }
        
        
        
        
         System.out.println();
        //A center állapotainak tesztelése.
        System.out.println("        Hangsozró állapotainak tesztelése.");
        InputStreamReader is = new InputStreamReader( System.in );
        change chain = new change();
        while (true) {
            System.out.print( "             Nyomja meg az  'Enter' gombot." );

            is.read();
            chain.pull();
        }
            
    }
    
}
