import  java.util.Date;

/**
 * Write a description of class Factura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factura
{
    // instance variables - replace the example below with your own
    private String cedula;
    private String plaza;
    private Date fechaEntrada;
    private Date fechaSalida;
    private double cobro;
    
    public Factura(){
        this.cedula = "123456";
        this.plaza = "1";
        this.fechaEntrada = new Date();
        this.fechaSalida = new Date();
        this.cobro = 0.0;
    }
    
    public Factura(String cedula, String plaza, Date fechaEntrada,
                    Date fechaSalida, double cobro){
        this.cedula = cedula;
        this.plaza = plaza;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cobro = cobro;
    }
    
    public void fechaActual(){
        fechaEntrada = new Date();
        System.out.println(this.fechaEntrada);
    }
}
