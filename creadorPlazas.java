
/**
 * Write a description of class creadorPlazas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//We add some records to the class "Parqueadero"
public class creadorPlazas
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class creadorPlazas
     */
    public creadorPlazas()
    {
        // initialise instance variables
    }

    public static Parqueadero crearPlazas(){
        Parqueadero parqueadero = new Parqueadero();
        parqueadero.ingresarParqueadero("1", "Disponible", "Carrro");
        parqueadero.ingresarParqueadero("2", "Ocupado", "Carrro");
        parqueadero.ingresarParqueadero("3", "Disponible", "Moto");
        return parqueadero;
        
    }
}
