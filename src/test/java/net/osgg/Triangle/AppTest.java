package net.osgg.Triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void TC01() {
        TriangleUtils t = new TriangleUtils();
        String a = "2", b = "2", c = "2";
        assertEquals("Equilatero", t.getTriangleType(a, b, c));
    }

    @Test
    public void TC02() {
        TriangleUtils t = new TriangleUtils();
        String a = "4", b = "4", c = "2";
        assertEquals("Isósceles", t.getTriangleType(a, b, c));
    }

    @Test
    public void TC03() {
        TriangleUtils t = new TriangleUtils();
        String a = "4", b = "2", c = "4";
        assertEquals("Isósceles", t.getTriangleType(a, b, c));
    }

    @Test
    public void TC04() {
        TriangleUtils t = new TriangleUtils();
        String a = "5", b = "3", c = "4";
        assertEquals("Escaleno", t.getTriangleType(a, b, c));
    }

    @Test
    public void TC05() {
        TriangleUtils t = new TriangleUtils();
        assertEquals(t.getTriangleType("3", "b", "c"), "los tres valores a ingresar deben ser números enteros");
        assertEquals(t.getTriangleType("a", "3", "c"), "los tres valores a ingresar deben ser números enteros");
        assertEquals(t.getTriangleType("a", "b", "3"), "los tres valores a ingresar deben ser números enteros");
        assertEquals(t.getTriangleType("3", "b", "3"), "los tres valores a ingresar deben ser números enteros");
        assertEquals(t.getTriangleType("a", "4", "3"), "los tres valores a ingresar deben ser números enteros");
        assertEquals(t.getTriangleType("3", "4", "c"), "los tres valores a ingresar deben ser números enteros");
    }

    @Test
    public void TC06() {
        TriangleUtils t = new TriangleUtils();
        assertEquals(t.getTriangleType("1", "5", "2"), "los valores ingresados no corresponden con los de un triángulo");
        assertEquals(t.getTriangleType("8", "2", "2"), "los valores ingresados no corresponden con los de un triángulo");
    }

    @Test
    public void TC07() {
        TriangleUtils t = new TriangleUtils();
        assertEquals(t.getTriangleType("1", "2", "2"), "Isósceles");
    }

    @Test
    public void TMain() {
        App.main(new String[]{"1", "2", "3"});
    }

    @Test
    public void TApp() {
        App app = new App();
        assertTrue(app instanceof App);
    }


}

