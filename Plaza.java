import java.util.Date;
/**
 * Write a description of class Plaza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//We define the caracteristics of a "Plaza" in a "Parqueadero"
public class Plaza
{
    // instance variables - replace the example below with your own
    private String numero;
    private String estado;
    private String tv;
    private String cedulaConductor;
    private String horaEntrada;
    //private String ubicacion
    

    /**
     * Constructor for objects of class Plaza
     */
    public Plaza()
    {
        // initialise instance variables
        this.numero = "99";
        this.estado = "Disponible";
        this.tv = "Carro";
        this.cedulaConductor = "123456";
        this.horaEntrada = "6";
    }
    
    public Plaza(String numero, String estado, String tv, String cedulaConductor, String horaEntrada)
    {
        // initialise instance variables
        this.numero = numero;
        this.estado = estado;
        this.tv = tv;
        this.cedulaConductor = cedulaConductor;
        this.horaEntrada = horaEntrada;
    }
    
    //Getters and setters
    public String getNumero(){
        return this.numero;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public String getTv(){
        return this.tv;
    }
    
    public String getCedulaConductor(){
        return this.cedulaConductor;
    }
    
    public String getHoraEntrada(){
        return this.horaEntrada;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setTv(String tv){
        this.tv = tv;
    }
    
    public void setCedulaConductor(String cedulaConductor){
        this.cedulaConductor = cedulaConductor;
    }

    public void setHoraEntrada(String horaEntrada){
        this.horaEntrada = horaEntrada;
    }
}
