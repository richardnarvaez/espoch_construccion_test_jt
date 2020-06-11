package net.osgg.Triangle;


public class TriangleUtils {
	
    private boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }
     
    public String getTriangleType(String a, String b, String c) {
    	String type="none";
    	
    	if ( !isInteger(a) || !isInteger(b) || !isInteger(c) )
    	   return "los tres valores a ingresar deben ser números enteros";
    	else if ( (Integer.valueOf(a) + Integer.valueOf(b)) <= Integer.valueOf(c) || 
    			  (Integer.valueOf(a) + Integer.valueOf(c)) <= Integer.valueOf(b) || 
    			  (Integer.valueOf(b) + Integer.valueOf(c)) <= Integer.valueOf(a) ) 
    		return "los valores ingresados no corresponden con los de un triángulo"; 
    	else if(Integer.valueOf(a)==Integer.valueOf(b) && Integer.valueOf(b)==Integer.valueOf(c))
    		type = "Equilatero";
    	else if (Integer.valueOf(a)==Integer.valueOf(b)  || Integer.valueOf(a)==Integer.valueOf(c)  || 
    			 Integer.valueOf(c)==Integer.valueOf(b) )
    		type = "Isósceles";
    	else
    		type = "Escaleno";
        return type;
    }

}
