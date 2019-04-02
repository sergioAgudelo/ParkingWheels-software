
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
        //REVISAR: cedula, telefono y placa unicos
        registros.ingresarConductor("Paola", "123456", "2234155", "ABC000", "Moto");
        registros.ingresarConductor("Sergio", "234567", "31245677", "BCD000", "Moto");
        registros.ingresarConductor("Andres", "345678", "412345667", "CDE000", "Carro");
        registros.ingresarConductor("Andres", "445678", "512345667", "DDE000", "Carro");
        registros.ingresarConductor("Andres", "545678", "612345667", "EDE000", "Carro");
        registros.ingresarConductor("Andres", "645678", "712345667", "FDE000", "Carro");
        registros.ingresarConductor("Andres", "745678", "812345667", "GDE000", "Carro");
        registros.ingresarConductor("Andres", "845678", "912345667", "IDE000", "Carro");
        registros.ingresarConductor("Andres", "945678", "422345667", "DE000", "Carro");
        registros.ingresarConductor("Andres", "115678", "432345667", "KCDE000", "Carro");
        registros.ingresarConductor("Andres", "225678", "442345667", "LDE000", "Carro");
        registros.ingresarConductor("Andres", "335678", "452345667", "MDE000", "Carro");
        registros.ingresarConductor("Andres", "455678", "462345667", "NDE000", "Carro");
        registros.ingresarConductor("Andres", "565678", "472345667", "ODE000", "Carro");
        registros.ingresarConductor("Andres", "675678", "482345667", "PDE000", "Carro");
        registros.ingresarConductor("Andres", "785678", "492345667", "QDE000", "Carro");
        registros.ingresarConductor("Andres", "895678", "411345667", "RDE000", "Carro");
        registros.ingresarConductor("Andres", "905678", "413345667", "SDE000", "Carro");
        registros.ingresarConductor("Andres", "115678", "414345667", "TDE000", "Carro");
        registros.ingresarConductor("Andres", "225678", "415345667", "UDE000", "Carro");
        registros.ingresarConductor("Andres", "335678", "416345667", "VDE000", "Carro");
        
        return registros;
    }   
}
