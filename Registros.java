import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Registros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//This class manage the drivers defined in the class "Conductor"
public class Registros
{
    // instance variables - replace the example below with your own
    private ArrayList<Conductor> conductores;

    /**
     * Constructor for objects of class Registros
     */
    public Registros()
    {
        // initialise instance variables
        conductores = new ArrayList<>();
    }
    
    public void ingresarConductor(String nombre, String cedula, String telefono, String placa, String tv){
        Conductor conductor = new Conductor(nombre, cedula, telefono, placa, tv);
        conductores.add(conductor);
    }

    public void mostrarConductores(){
        Iterator<Conductor> iterator = conductores.iterator();
        while(iterator.hasNext()){
             Conductor conductor = iterator.next();
             System.out.println("\n - Nombre: " + conductor.getNombre() +
                                ", Cedula: " + conductor.getCedula() +
                                ", Telefono: " + conductor.getTelefono() +
                                ", Placa: " + conductor.getPlaca() +
                                ", TV: " + conductor.getTv()
                                );
        }
    }
    
    public int searchByCedula(String searchCedula){
        Iterator<Conductor> iterator = conductores.iterator();
        while(iterator.hasNext()){
             Conductor conductor = iterator.next();
             if(conductor.getCedula().equals(searchCedula)){
                 return conductores.indexOf(conductor);
             }
        }
        return -1;
    }
    
    public void updateTelefono(int indexConductor, String newTel){
        conductores.get(indexConductor).setTelefono(newTel);
        System.out.println("Telefono actualizado exitosamente.");
    }
    
    public void mostrarConductorPorPlacaOCedula(String parametroBusqueda){
        Iterator<Conductor> iterator = conductores.iterator();
        boolean finished = false;
        while(iterator.hasNext() && finished == false){
            Conductor conductor = iterator.next();
             if(conductor.getCedula().equals(parametroBusqueda) || conductor.getPlaca().equals(parametroBusqueda)){
                 System.out.println("\n - Nombre: " + conductor.getNombre() +
                                    ", Cedula: " + conductor.getCedula() +
                                    ", Telefono: " + conductor.getTelefono() +
                                    ", Placa: " + conductor.getPlaca() +
                                    ", TV: " + conductor.getTv()
                                    );
                                    
                 finished = true;
                 System.out.println(finished);
             }
        }
    }
    
    public void eliminarUsuarioPorCedula(int indexConductor){
        conductores.remove(indexConductor);
        System.out.println("Usuario eliminado exitosamete.");
    }
    
    
}
