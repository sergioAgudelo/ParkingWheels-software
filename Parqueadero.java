import java.util.ArrayList;
import java.util.Iterator;

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
    private Plaza plaza;

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
    
    public void monstrarPlazas(){
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             Plaza plaza = iterator.next();
             System.out.println("******* - Número: " + plaza.getNumero() +
                                ", Estado: " + plaza.getEstado() +
                                ", TV: " + plaza.getTv()
                                );
        }
    }
    
    public void mostrarPlazasDisponibles(){
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             Plaza plaza = iterator.next();
             if(plaza.getEstado().equalsIgnoreCase("Disponible")){
                 System.out.println("******* - Número: " + plaza.getNumero() +
                                ", Estado: " + plaza.getEstado() +
                                ", TV: " + plaza.getTv()
                                );
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias){
            System.out.println("*******No hay plazas vacias.");
        }
    }
    
    public void mostrarPlazasTv(String tv){
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             plaza = iterator.next();
             if(plaza.getTv().equalsIgnoreCase(tv)){
                 System.out.println("******* - Número: " + plaza.getNumero() +
                                ", Estado: " + plaza.getEstado() +
                                ", TV: " + plaza.getTv()
                                );
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias){
            System.out.println("*******No hay plazas vacias.");
        }
    }
    
    public void updateEstadoPlaza(int numeroPlaza, String estado){
        plaza = plazas.get(numeroPlaza - 1);
        //plaza.setEstado(
    }
}
