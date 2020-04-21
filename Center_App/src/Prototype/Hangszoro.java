package Prototype;


public class Hangszoro {
    String name;    
    Lejatszas_mod lejatszas_mode;
    
    public String getName(){
        return name;
    }
    
    public Lejatszas_mod getLejatszas_mode(){
        return lejatszas_mode;
    }
    
    public Hangszoro(String name,Lejatszas_mod lejatszas_mode){
        this.name = name;
        this.lejatszas_mode = lejatszas_mode;
    }
    
    
}
