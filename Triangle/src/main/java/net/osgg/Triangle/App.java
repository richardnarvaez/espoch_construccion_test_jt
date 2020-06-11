package net.osgg.Triangle;


/**
 * Description. 
 * A triangle is valid if sum of its two sides is 
 * greater than the third side. If three sides are 
 * a, b and c, then three conditions should be met.
 *
 */
public class App{
    public static void main( String[] args ){   
        TriangleUtils t = new TriangleUtils();
        System.out.println(t.getTriangleType(args[0], args[1], args[2]));
    }      
}
