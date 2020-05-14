package Prototype;

import java.util.ArrayList;




public class Center {
    
    //A center adatai.
    String nev;
    int hangszorok_szama;
    
    
    //hangsozrok listája.
    public ArrayList<Hangszoro> hangszorok = null;
    
    //konstruktor.
    public Center(String nev, int hangszorok_szama, ArrayList<Hangszoro> hangszorok){
        this.nev = nev;
        this.hangszorok_szama = hangszorok_szama;
        this.hangszorok = hangszorok;
    }
    
    
    
    //nevet addvissza.
    public String getNev(){
        return nev;
    }
    //a hangszorok szamat adja vissza.
    public int getHangszorok_szama(){               
        return hangszorok_szama;              
    }
    //a hangszorok listát adja vissza.
    public ArrayList getHangszorokk(){
        return hangszorok;
    }

    //ez szolgál hogy egy tipusból több clone-t létre tujak hozni.
    public Center clone(String nev){
        ArrayList<Hangszoro> hangszorok = new ArrayList<Hangszoro>();
        for (Hangszoro hangszoro : hangszorok){
            hangszorok.add(hangszoro);
        }
        Center ujCenter = new Center(nev,this.hangszorok_szama,this.hangszorok);
        return ujCenter;
    }
 










}



