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
    public void test(){
       Articulo instancia = new Articulo();
        int nro_articulo=123;
        String tipo_articulo = "calefones";
        String nombre="universal";
       Field field = instancia.getClass().getDeclaredField("nro_articulo");
       field.setAccessible(true);
       String unAtributoPrivado = (String) field.get(instancia);
       
   }
        
    
}
