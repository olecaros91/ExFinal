/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import exfinal.ExFinal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class registraUsuarioTest {
    
    public registraUsuarioTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
     @Test
    public void testRegistro() {
        System.out.println("registro flujo basico");
        ExFinal instance = new ExFinal();
        instance.regitrarUsuario("olecaros", "123");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("flujo basico", "olecaros", instance.getUsuario());
    }
    
    @Test
     public void testRegistroUsuarioVacio() {
        System.out.println("registro usuario vacio");
        ExFinal instance = new ExFinal();
        instance.regitrarUsuario(" ", "123");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("flujo basico", " ", instance.getUsuario());
    }
    
         @Test
     public void testRegistroContraseñaVacia() {
        System.out.println("registro contraseña vacia");
        ExFinal instance = new ExFinal();
        instance.regitrarUsuario("olecaros", " ");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("flujo basico", " ", instance.getPass());
    }
        @Test
     public void testRegistroCamposVacios() {
        System.out.println("registro campos vacios");
        ExFinal instance = new ExFinal();
        instance.regitrarUsuario(" ", " ");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("flujo basico", " ", instance.getPass());
        assertEquals("flujo basico", " ", instance.getUsuario());
    }
}
