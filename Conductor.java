    
/**
* Write a description of class Conductor here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
//We define the atributtes of a "Conducto" on this class
public class Conductor
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String cedula;
    private String telefono;
    //take into account the type of vehicle (car and bike per person)
    private String placa;
    private String tv;
    
    
    
        /**
     * Constructor for objects of class Conductor
     */
    public Conductor()
    {
        // initialise instance variables
        this.nombre = "Lizeth";
        this.cedula = "12345";
        this.telefono = "67890";
        this.placa = "QWE123";
        this.tv = "Carro";
        
    }
    
    /**
     * Constructor for objects of class Conductor
     */
    public Conductor(String nombre, String cedula, String telefono, String placa, String tv)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.placa = placa;
        this.tv = tv;
    }
    
    //Getters and Setters
    public String getNombre(){
        return this.nombre;
    }
        
    public String getCedula(){
        return this.cedula;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public String getTv(){
        return this.tv;
    }
        
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
        
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setTv(String tv){
        this.tv = tv;
    }
}
