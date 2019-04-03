import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
    String tv, placa, telefono, cedula, nombre, basura;
    Scanner sc = new Scanner(System.in);


    /**
     * Constructor for objects of class Registros
     */
    public Registros()
    {
        // initialise instance variables
        conductores = new ArrayList<>();
    }
    
    public void ingresarConductor(){
        System.out.print("\nInserte el nombre -->");
        nombre = sc.nextLine();
        System.out.print("\nInserte la cedula -->");
        cedula = sc.nextLine();
        System.out.print("\nInserte el telefono -->");
        telefono = sc.nextLine();
        System.out.print("\nInserte la placa -->");
        placa = sc.nextLine();
        System.out.print("\nInserte el tv -->");
        tv = sc.nextLine();
        Conductor conductor = new Conductor(nombre, cedula, telefono, placa, tv);
        conductores.add(conductor);
        System.out.println("Usuario -" + nombre + "- insertado exitosamente.");
    }
    
    public String ingresarConductor(String nombre, String cedula, String telefono, String placa, String tv){
        Conductor conductor = new Conductor(nombre, cedula, telefono, placa, tv);
        //revisar: unique
        conductores.add(conductor);
        return "Conductor " + nombre + " ingresado correctamente\n";
    }

    public String mostrarConductores(){
        String textArea = "";
        int indice = 0;
        Iterator<Conductor> iterator = conductores.iterator();
        while(iterator.hasNext()){
            indice++;
             Conductor conductor = iterator.next();
             textArea = textArea + indice + ". Nombre: " + conductor.getNombre() +
                                ", Cedula: " + conductor.getCedula() +
                                ", Telefono: " + conductor.getTelefono() +
                                ", Placa: " + conductor.getPlaca() +
                                ", TV: " + conductor.getTv() + "\n";
        }
        
        return textArea;
    }
    
    public void mostrarConductorPorPlacaOCedula(){
        System.out.print("\nInserte la cedula/placa a buscar -->");
        //For this case cedula acts as a cedula or a placa to the search
        String parametroBusqueda = sc.nextLine();

        Iterator<Conductor> iterator = conductores.iterator();
        boolean finished = false;
        while(iterator.hasNext() && finished == false){
            Conductor conductor = iterator.next();
             if(conductor.getCedula().equalsIgnoreCase(parametroBusqueda) || conductor.getPlaca().equalsIgnoreCase(parametroBusqueda)){
                 System.out.println("\n******* - Nombre: " + conductor.getNombre() +
                                    ", Cedula: " + conductor.getCedula() +
                                    ", Telefono: " + conductor.getTelefono() +
                                    ", Placa: " + conductor.getPlaca() +
                                    ", TV: " + conductor.getTv()
                                    );
                                    
                 finished = true;
             }
        }
        
        if(finished == false){
             System.out.println("*******El conductor con cedula/placa -" + parametroBusqueda + "- no existe.");
        }
    }
    
    public int searchByCedula(){
        System.out.print("\nDigite la cedula del usuario -->");
        cedula = sc.nextLine();
        Iterator<Conductor> iterator = conductores.iterator();
        while(iterator.hasNext()){
             Conductor conductor = iterator.next();
             if(conductor.getCedula().equals(cedula)){
                 return conductores.indexOf(conductor);
             }
        }
        System.out.println("*******No existe un conductor con la cedula -" + cedula + "-.");
        return -1;
    }
    
    public Conductor getConductorByIndex(int index){
        return conductores.get(index);
    }
    
    public void updateTelefono(int indexConductor){
        if(indexConductor != -1){
            System.out.print("\nInserte el nuevo telefono -->");
            telefono = sc.nextLine();
            conductores.get(indexConductor).setTelefono(telefono);
            System.out.println("*******Se ha actualizado el telefono de -" + conductores.get(indexConductor).getNombre()+ "- exitosamente a -" + telefono + "-.");
        }
    }
    
    public void eliminarUsuarioPorCedula(int indexConductor){
        conductores.remove(indexConductor);
        System.out.println("*******Usuario eliminado exitosamete.");
    }
    
    
}
