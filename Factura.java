import java.util.Scanner;
import java.util.Date;

/**
* Write a description of class Factura here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Factura
{
    // instance variables - replace the example below with your own
    static private Registros registros = CreadorRegistros.crearConductores();
    static private Parqueadero parqueadero = creadorPlazas.crearPlazas();
    //static private Factura factura = Factura
    
    static Scanner sc = new Scanner(System.in);
    static int opcionElegida = 0;
    
    public static void main(String[] args)
    {
        
    }
       
    
    String tv, placa, telefono, cedula, nombre, basura;
    String textArea = "";
    int indexConductor;
    String estado, numeroPlaza;
    int indexPlaza;
    
    Conductor conductor = new Conductor();
       
    public String mostrarConductores(){
        return registros.mostrarConductores();
    }
                
    public String ingresarConductor(String nombre, String cedula, String telefono, String placa, String tv){
        return registros.ingresarConductor(nombre, cedula, telefono, placa, tv);
    }
                       
    public String updateTelefono(String cedula, String telefono){
        indexConductor = registros.searchByCedula(cedula);
        return registros.updateTelefono(indexConductor, telefono);
    }
                
    public String mostrarConductorPorPlacaOCedula(String parametroBusqueda){
        return registros.mostrarConductorPorPlacaOCedula(parametroBusqueda);
    }
                
    public String eliminarUsuarioPorCedula(String cedula){
        indexConductor = registros.searchByCedula(cedula);
        return registros.eliminarUsuarioPorCedula(indexConductor);
    }
                
    public String searchPlazaByConductor(String cedula){
        return parqueadero.searchPlazaByConductor(cedula);
    }
        
    public String monstrarPlazas(){
        return parqueadero.monstrarPlazas();
    }
        
    public String mostrarPlazasPorEstado(String estado){
        return parqueadero.mostrarPlazasPorEstado(estado);
    }
        
    public String mostrarPlazasTv(String tv){
        return parqueadero.mostrarPlazasTv(tv);
    }
    
    public String mostrarPlazasTvYEstado(String estado, String tv){
        return parqueadero.mostrarPlazasTvYEstado(estado, tv);
    }
        
    public String updateEstadoPlaza(String numero, String cedula, String estado){
        if(!cedula.equalsIgnoreCase("")){
            indexConductor = registros.searchByCedula(cedula);
        }else{
            indexConductor = 1;
        }
            
        if(indexConductor != -1){
            indexPlaza = parqueadero.searchPlazaByNumber(Integer.parseInt(numero));
            if(indexPlaza != -1){
                if(estado.equalsIgnoreCase("Ocupado")){
                    textArea = parqueadero.updateEstadoPlaza(indexPlaza, "Ocupado", cedula, new Date());
                }else if(estado.equalsIgnoreCase("Disponible")){
                    textArea = parqueadero.updateEstadoPlaza(indexPlaza, "Disponible", "", new Date(0, 0, 1, 0, 0));
                }
            }else{
                textArea = "******La plaza no existe";
            }
        }else{
            textArea = "*******El conductor no existe.";
        }
        
        return textArea;
    }
        
    public String ingresarVehiculo(String numero, String cedula, String estado){
        indexConductor = registros.searchByCedula(cedula);
        if(indexConductor != -1){
            conductor = registros.getConductorByIndex(indexConductor);
            tv = conductor.getTv();
            indexPlaza = parqueadero.searchPlazaByNumber(Integer.parseInt(numero));
            if(indexPlaza != -1){
                textArea = parqueadero.updateEstadoPlaza(indexPlaza, estado, cedula, new Date());
            }else{
                textArea = "******La plaza no existe";
            }
        }else{
            textArea = "*******El conductor no existe.";
        }
        return textArea;
    }
        
    public String generarCobro(String numero, String estado){
        indexPlaza = parqueadero.searchPlazaByNumber(Integer.parseInt(numero));
        if(indexPlaza != -1){
            cedula = parqueadero.getPlazas().get(indexPlaza - 1).getCedulaConductor();
            indexConductor = registros.searchByCedula(cedula);
            if(indexConductor != -1){
                conductor = registros.getConductorByIndex(indexConductor);
                tv = conductor.getTv();
                textArea = "El conductor '" + cedula + "' debe cancelar: " + parqueadero.cobrar(indexPlaza, tv) + " pesos.\n";
                textArea = textArea + parqueadero.updateEstadoPlaza(indexPlaza, estado, "", new Date(0, 0, 1, 0, 0));
            }else{
                textArea = "*******El conductor no existe.";
            }
        }else{
            textArea = "******La plaza no existe";
        }
        
        return textArea;
    }
}
