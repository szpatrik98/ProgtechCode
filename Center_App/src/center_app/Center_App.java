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
    public static void main(String[] args)throws IOException, Exception{
        
        //példányosít  lejátszási módót.
        Lejatszas_mod CD = new Lejatszas_mod("CD-és");
        
        //példányosít  hangszoro tipust aminek van lejátszási módja
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
       Center ujCenter_Acer = ujCenter_Samsung.clone("     ACER");
        //létre hozok egy centerek listát majd hozzá adom a létre jött centereket.
        ArrayList<Center> centerek = new ArrayList<Center>();
        centerek.add(ujCenter_Sony);
        centerek.add(ujCenter_Samsung);
        centerek.add(ujCenter_Philiphs);
        centerek.add(ujCenter_Acer);
        
        
        //az összes centert tulajdonságal kiirtaom és azért forral hogy ha késsőbbiekbe 
        //bővitve lenne a program ne keljen még ezzel foglalkozni.
        for(Center center : centerek){
            System.out.println(center.getNev() + " Típusú és A Hangszórók száma : " +                               
                                center.getHangszorok_szama());
            
            for (Hangszoro hangszoro : center.hangszorok){
                System.out.println("            a hangszoro márkája" +": " + hangszoro.getName());
                System.out.println(" Lejátszás módja: "+ hangszoro.getLejatszas_mode());
            }
            
        }
        //Ez csak egy plus sor hogy a consolon jol nézen ki.
        System.out.println();  
        
        
        
        //Observer
        
        System.out.println("           A megrendelések listája.");
        
        //Ez csak egy plus sor hogy a consolon jol nézen ki.
        System.out.println();
        
        //példányosítok egy boltot.
        Shop shop = new Shop();
        
        //példányosítom az embereket.akik a megrendelők.
        Person chris = new Person("Chris");
        Person john = new Person("John");
        Person roger = new Person("Roger");
        
        //létre hozom hogy ki milyen tipusu megrendelést kér.
        Travel at_home = new Travel("John","    Házhoz szálitással kérte.");
        Travel go_to = new Travel("Chris","     Érte megy majd.");
        Travel now = new Travel("Roger","   Helyben vásárolta most.");
        
        //hozza adom az observeket az observer listához.Akik a megrendelők.
        shop.Attach(chris);        
        shop.Attach(john);
        shop.Attach(roger);     
             
        //Itt a kiszáltás listához adom hozzá a kiszálíítás típusát.
        shop.addTravel(at_home);                       
        shop.addTravel(go_to);
        shop.addTravel(now);
        

         
        
        
        //Ez csak egy plus sor hogy a consolon jol nézen ki.
         System.out.println();
         
         
        //A center állapotainak tesztelése.
        System.out.println("        Hangsozró állapotainak tesztelése.");
        
        //létre hozom az input bekérésére szolgálo eltárt változot.
        InputStreamReader is = new InputStreamReader( System.in );
        change chain = new change();
        //addig fut a ciklus ameddig történik input-ról érkező billentyűzet lenoymás.
        while (true) {
            System.out.print( "             Nyomja meg az  'Enter' gombot." );

            is.read();
            chain.pull();
        }
            
    }
    
}
