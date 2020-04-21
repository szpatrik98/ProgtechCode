package Prototype;

import java.util.ArrayList;



public class Center {
    String nev;
    int hangszorok_szama;
    
    public ArrayList<Hangszoro> hangszorok = null;
    
    public Center(String nev, int hangszorok_szama, ArrayList<Hangszoro> hangszorok){
        this.nev = nev;
        this.hangszorok_szama = hangszorok_szama;
        this.hangszorok = hangszorok;
    }

    public String getNev(){
        return nev;
    }
    
    public int getHangszorok_szama(){
        return hangszorok_szama;
    }
    
    public ArrayList getHangszorokk(){
        return hangszorok;
    }

    
    public Center clone(String nev){
        ArrayList<Hangszoro> hangszorok = new ArrayList<Hangszoro>();
        for (Hangszoro hangszoro : hangszorok){
            hangszorok.add(hangszoro);
        }
        Center ujCenter = new Center(nev,this.hangszorok_szama,this.hangszorok);
        return ujCenter;
    }
 










}



