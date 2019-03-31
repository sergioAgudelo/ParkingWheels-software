
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
        parqueadero.ingresarParqueadero("1", "Disponible", "Carro");
        parqueadero.ingresarParqueadero("2", "Ocupado", "Carro");
        parqueadero.ingresarParqueadero("4", "Disponible", "Carro");
        parqueadero.ingresarParqueadero("5", "Ocupado", "Carro");
        parqueadero.ingresarParqueadero("6", "Disponible", "Carro");
        parqueadero.ingresarParqueadero("7", "Ocupado", "Carro");
        parqueadero.ingresarParqueadero("8", "Ocupado", "Carro");
        parqueadero.ingresarParqueadero("9", "Ocupado", "Carro");
        parqueadero.ingresarParqueadero("10", "Disponible", "Carro");
        
        parqueadero.ingresarParqueadero("11", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("12", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("13", "Ocupado", "Moto");
        parqueadero.ingresarParqueadero("14", "Ocupado", "Moto");
        parqueadero.ingresarParqueadero("15", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("16", "Ocupado", "Moto");
        parqueadero.ingresarParqueadero("17", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("18", "Ocupado", "Moto");
        parqueadero.ingresarParqueadero("19", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("20", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("21", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("22", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("23", "Disponible", "Moto");
        parqueadero.ingresarParqueadero("24", "Ocupado", "Moto");
        parqueadero.ingresarParqueadero("25", "Ocupado", "Moto");
        return parqueadero;
        
    }
}
