package Prototype;


public class Hangszoro {
    //hangszoro adatai.
    String name;    
    Lejatszas_mod lejatszas_mode;
    
    //vissza adja a nevét a hangszórónak.
    public String getName(){
        return name;
    }
    //A lejátszás módját adja vissza.
    public Lejatszas_mod getLejatszas_mode(){
        return lejatszas_mode;
    }
    
    //konstruktor.
    public Hangszoro(String name,Lejatszas_mod lejatszas_mode){
        this.name = name;
        this.lejatszas_mode = lejatszas_mode;
    }
    
    
}
