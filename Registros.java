import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

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
    String textArea = "";
    Scanner sc = new Scanner(System.in);
    
    String conductorStr;
    
    private FileWriter fw;

    Conductor conductor;
    
    /**
     * Constructor for objects of class Registros
     */
    public Registros()
    {
        // initialise instance variables
        conductores = new ArrayList<>();
        cargaConductores();
    }
    
    public void cargaConductores(){
        try{
             sc = new Scanner(new File("conductores.txt")).useDelimiter(",");
             while(sc.hasNext()){
                conductorStr = sc.nextLine();
                strToConductor(conductorStr);
             }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No se encontro el archivo");
        }
    }
    
    public void strToConductor(String conductorStr){
        Scanner s = new Scanner(conductorStr).useDelimiter(",");
        nombre = s.next();
        cedula = s.next();
        telefono = s.next();
        placa = s.next();
        tv = s.next();
        conductor = new Conductor(nombre, cedula, telefono, placa, tv);
        conductores.add(conductor);
    }
    
    public void guardaConductores(){
        Iterator<Conductor> iterator = conductores.iterator();
        String textArea = "";
        while(iterator.hasNext()){
            try{
                fw = new FileWriter(new File("conductores.txt"));
                
                Conductor conductor = iterator.next();
                textArea = textArea + conductor.getNombre() + "," +
                                conductor.getCedula() + "," +
                                conductor.getTelefono() + "," +
                                conductor.getPlaca() + "," +
                                conductor.getTv() + "\n";
                
                fw.write(String.format("%s", textArea));
                fw.close();
            }catch(IOException ex){
                System.out.println("No se pudo escribir el archivo.");
            }
        }
    }
    
    public String ingresarConductor(String nombre, String cedula, String telefono, String placa, String tv){
        Conductor conductor = new Conductor(nombre, cedula, telefono, placa, tv);
        //revisar: unique
        conductores.add(conductor);
        return "Conductor " + nombre + " ingresado correctamente\n";
    }

    public String mostrarConductores(){
        textArea = "";
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
    
    public String mostrarConductorPorPlacaOCedula(String parametroBusqueda){
        textArea = "";
        Iterator<Conductor> iterator = conductores.iterator();
        boolean finished = false;
        while(iterator.hasNext() && finished == false){
            Conductor conductor = iterator.next();
             if(conductor.getCedula().equalsIgnoreCase(parametroBusqueda) || conductor.getPlaca().equalsIgnoreCase(parametroBusqueda)){
                 textArea = " - Nombre: " + conductor.getNombre() +
                            ", Cedula: " + conductor.getCedula() +
                            ", Telefono: " + conductor.getTelefono() +
                            ", Placa: " + conductor.getPlaca() +
                            ", TV: " + conductor.getTv();
                                    
                 finished = true;
             }
        }
        
        if(finished == false){
             textArea = "*******El conductor con cedula/placa -" + parametroBusqueda + "- no existe.";
        }
        return textArea;
    }
    
    public int searchByCedula(String cedula){
        Iterator<Conductor> iterator = conductores.iterator();
        while(iterator.hasNext()){
             Conductor conductor = iterator.next();
             if(conductor.getCedula().equals(cedula)){
                 return conductores.indexOf(conductor);
             }
        }
        return -1;
    }
    
    public Conductor getConductorByIndex(int index){
        return conductores.get(index);
    }
    
    public String updateTelefono(int indexConductor, String telefono){
        if(indexConductor != -1){
            conductores.get(indexConductor).setTelefono(telefono);
            textArea = "Se ha actualizado el telefono de -" + conductores.get(indexConductor).getNombre()+ "- exitosamente a -" + telefono + "-.";
        }else{
            textArea = "*******El conductor no existe.";
        }
        
        return textArea;
    }
    
    public String eliminarUsuarioPorCedula(int indexConductor){
        if(indexConductor != -1){
            conductores.remove(indexConductor);
            textArea = "Usuario eliminado exitosamete.";
        }else{
            textArea = "*******El conductor no existe.";
        }
        return textArea;
    }
    
    
}
