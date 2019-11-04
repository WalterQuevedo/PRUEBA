/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WOLLY
 */
public class ArticuloTest {
    
    public ArticuloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCampoExistente(){
       Articulo instancia = new Articulo(123,"calefones","universal");
        int nro_articulo=123;
        String tipo_articulo = "calefones";
        String nombre="universal";
       //try {            
         //Articulo c = new Articulo();
         //Class cls = c.getClass();
         //Field campo  = cls.getDeclaredField("nro_articulo");
         //System.out.println("Field = " + campo.toString());
     // } catch(Exception e) {
         //System.out.println(e.toString());
         instancia.nro_articulo=123;
         instancia.tipo_articulo="algo";
         instancia.nombre="algo";
      }
   }
        
   
        
    

