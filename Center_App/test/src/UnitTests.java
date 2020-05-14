package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Prototype.Center;
import Prototype.Hangszoro;
import Prototype.Lejatszas_mod;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 *
 * @author szabb
 */
public class UnitTests {
    
    public UnitTests() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void CenterTestEverythingOK(){
       //Arrange
       Lejatszas_mod CD = new Lejatszas_mod("CD-és");
       Hangszoro JBL = new Hangszoro("JBL",CD);
       ArrayList<Hangszoro> hangszorok = new ArrayList<Hangszoro>(); 
       hangszorok.add(JBL);
       Center center = new Center("Samsung",2,hangszorok); 
       
       //Act
       String name = center.getNev();
       int hangszoro_db = center.getHangszorok_szama();
       int list_db = center.getHangszorokk().size();
       
       //Assert
       Assertions.assertEquals("Samsung",name);
       Assertions.assertEquals(2,hangszoro_db);
       Assertions.assertEquals(1,list_db);
    }
    @Test
    public void HangszorokNullReference(){
       //Arrange
       Lejatszas_mod CD = new Lejatszas_mod("CD-és");
       Hangszoro JBL = new Hangszoro("JBL",CD);
       ArrayList<Hangszoro> hangszorok = null;
       Center center = new Center("Samsung",2,hangszorok); 
       
       //Act
       try{
            int list_db = center.getHangszorokk().size();
            Assertions.fail();
       }
       catch(Exception e){
            //Assert
            Assertions.assertTrue(true);
       }
    }
    @Test
    public void HangszorokDbNullReference(){
       //Arrange
       Lejatszas_mod CD = new Lejatszas_mod("CD-és");
       Hangszoro JBL = new Hangszoro("JBL",CD);
       ArrayList<Hangszoro> hangszorok = new ArrayList<Hangszoro>(); 
       hangszorok.add(JBL);
       Center center = new Center("Samsung",0,hangszorok); 
       
       //Act
       try{
            int hangszoro_db = center.getHangszorok_szama();
            Assertions.fail();
       }
       catch(Exception e){
            //Assert
            Assertions.assertTrue(true);
       }
    }
}
