
/**
 * Write a description of class CreadorRegistros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//We initialize de database with some specific records
public class CreadorRegistros
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class CreadorRegistros
     */
    public CreadorRegistros()
    {
        // initialise instance variables
    }

    //With this methos we initialize a databse of "Conductores"
    public static Registros crearConductores(){
        Registros registros = new Registros();
        registros.ingresarConductor("Paola", "123456", "2234155", "ABC000", "Moto");
        registros.ingresarConductor("Sergio", "234567", "31245677", "BCD000", "Moto");
        registros.ingresarConductor("Andres", "345678", "412345667", "CDE000", "Carro");
        return registros;
    }   
}
