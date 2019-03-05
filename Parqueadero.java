import java.util.ArrayList;

/**
 * Write a description of class Parqueadero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parqueadero
{
    // instance variables - replace the example below with your own
    private ArrayList<Plaza> plazas;

    /**
     * Constructor for objects of class Parqueadero
     */
    public Parqueadero()
    {
        // initialise instance variables
        plazas = new ArrayList<>();
    }

    public void ingresarParqueadero(String numero, String estado, String tv){
        Plaza plaza = new Plaza(numero, estado, tv);
        plazas.add(plaza);
    }
        
    
}
