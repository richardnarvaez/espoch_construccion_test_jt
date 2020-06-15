package net.osgg.Triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest {

  	@Test // CP para verificar clase con main
    public void TC00() {
    	PrintStream out = mock(PrintStream.class); //para verificar la salida a consola
        System.setOut(out);
        App a = new App();
        App.main(new String[] {"1","2","3"});
        verify(out).println(startsWith("los valores ingresados no corresponden"));
    }
	
	
	@Test
    public void TC01() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "a", b = "4", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("los tres valores a ingresar deben ser números enteros") );
    }
		

	@Test
    public void TC02() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "b", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("los tres valores a ingresar deben ser números enteros") );
    }
	
	
	@Test
    public void TC03() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "4", c = "c";
    	assertTrue( t.getTriangleType(a, b, c).equals("los tres valores a ingresar deben ser números enteros") );
    }
	
	
	@Test
    public void TC04() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "1", b = "4", c = "3";
    	assertTrue( t.getTriangleType(a, b, c).equals("los valores ingresados no corresponden con los de un triángulo") );
    }

	
	@Test
    public void TC05() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "3", b = "1", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("los valores ingresados no corresponden con los de un triángulo") );
    }
	
	
	@Test
    public void TC06() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "3", c = "1";
    	assertTrue( t.getTriangleType(a, b, c).equals("los valores ingresados no corresponden con los de un triángulo") );
    }
	
	
	@Test
    public void TC07() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "4", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("Equilatero") );
    }
	
	
	@Test
    public void TC08() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "4", c = "3";
    	assertTrue( t.getTriangleType(a, b, c).equals("Isósceles") );
    }
	
	
	@Test
    public void TC09() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "3", b = "4", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("Isósceles") );
    }
	
	
	@Test
    public void TC10() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "3", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("Isósceles") );
    }

	
	@Test
    public void TC11() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "3", c = "2";
    	assertTrue( t.getTriangleType(a, b, c).equals("Escaleno") );
    }
	
}

