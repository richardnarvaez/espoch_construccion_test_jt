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
    	String a = "4", b = "4", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("Equilatero") );
    }

}

