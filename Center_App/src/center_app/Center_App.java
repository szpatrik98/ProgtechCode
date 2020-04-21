/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package center_app;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author szabb
 */
public class Center_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ParseException{
        
        //példányosíto  lejátszási módót.
        Lejatszas_mod CD = new Lejatszas_mod("CD-és");
        
        //példányosítok  hangszoro tipust aminek van lejátszási módja
        Hangszoro JBL = new Hangszoro("JBL",CD);
        
        //hozzá adom a hangszorok listához.
        ArrayList<Hangszoro> hangszorok = new ArrayList<Hangszoro>();
        hangszorok.add(JBL);
        
        //példányosítok és clonozok centereket.
        Center ujCenter_Sony = new Center("Sony",                                
                                4,
                                hangszorok);
        Center ujCenter_Samsung = new Center("Samsung",                                
                                2,
                                hangszorok);
        
       Center ujCenter_Philiphs = ujCenter_Sony.clone("Philiphs");
        
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
                System.out.println("a hangszoro márkája" +": " + hangszoro.getName());
                System.out.println(" Lejátszás módja: "+ hangszoro.getLejatszas_mode());
            }
            
        }
        
                                
                                
          
       
    }
    
}
