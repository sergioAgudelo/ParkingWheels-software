import java.util.Date;
/**
 * Write a description of class fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fecha
{
    // instance variables - replace the example below with your own
    private Date fechaEntrada;
    
    public void imprimirFecha(){
        fechaEntrada = new Date();
        System.out.println("completa: " + fechaEntrada + " hora: " + fechaEntrada.getHours() + " dia: " + fechaEntrada.getDay() 
        + "\n----------------" + new Date(118, 11, 24, 22, 0));
    }

    /**
     * Constructor for objects of class fecha
     */
    public fecha()
    {
    }

    
}
