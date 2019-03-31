import java.util.Scanner;


/**
* Write a description of class DemoParkingWheels here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class DemoParkingWheels
{
    // instance variables - replace the example below with your own
    static private Registros registros = CreadorRegistros.crearConductores();
    static private Parqueadero parqueadero = creadorPlazas.crearPlazas();
    //static private Factura factura = Factura
    
    static Scanner sc = new Scanner(System.in);
    static int opcionElegida = 0;
    
    public static void main(String[] args)
    {
        
        String tv, placa, telefono, cedula, nombre, basura;
        int indexConductor;
        String estado;
        int indexPlaza;
        int numeroPlaza;
        
        Conductor conductor = new Conductor();
       
        do{
            menu();
            
            switch (opcionElegida){
                //mostrar conductores
                case 1:
                    registros.mostrarConductores();
                    break;
                
                    //Insertar nuevo conductor
                case 2:
                    registros.ingresarConductor();
                    break;
                       
                //modificar telefono
                case 3:
                    indexConductor = registros.searchByCedula();
                    registros.updateTelefono(indexConductor);
                    break;
                
                //buscar por placa o cedula
                case 4:
                    registros.mostrarConductorPorPlacaOCedula();
                    break;
                
                //eliminar conductor
                case 5:
                    indexConductor = registros.searchByCedula();
                    registros.eliminarUsuarioPorCedula(indexConductor);
                    break;
                
                //monstrar estados plazas
                case 7:
                    parqueadero.monstrarPlazas();
                    break;
                    
                case 8:
                    parqueadero.mostrarPlazasPorEstado();
                    break;
                    
                case 9:
                    parqueadero.mostrarPlazasTv();
                    break;
                    
                case 10:
                    parqueadero.mostrarPlazasPorEstado("Disponible");
                    indexPlaza = parqueadero.searchPlazaByNumber();
                    if(indexPlaza != -1){
                        parqueadero.updateEstadoPlaza(indexPlaza, "Ocupado");
                    }
                    break;
                    
                case 11:
                    parqueadero.mostrarPlazasPorEstado("Ocupado");
                    indexPlaza = parqueadero.searchPlazaByNumber();
                    if(indexPlaza != -1){
                        parqueadero.updateEstadoPlaza(indexPlaza, "Disponible");
                    }
                    break;
                    
                case 12:
                    indexConductor = registros.searchByCedula();
                    if(indexConductor != -1){
                        conductor = registros.getConductorByIndex(indexConductor);
                        //no estoy seguro si sea una buena practica usar los get desde aca o si deberia hacerlo
                        //de la clase registros unicamente
                        nombre = conductor.getNombre();
                        placa = conductor.getPlaca();
                        tv = conductor.getTv();
                        System.out.print("\nLas plazas libres para '" + tv + "' son: ");
                        parqueadero.mostrarPlazasTv(tv);
                        System.out.print("\nInserte la plaza en la cual va a estacionar -->");
                        numeroPlaza = sc.nextInt();
                        //factura.
                    }
                    break;
                    
                case 0:
                    System.out.println("\n\n------>Gracias por preferirnos<-------");
                    break;
                   
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while( opcionElegida >= 1 && opcionElegida <= 13);
    }
    
    public static void menu(){
        System.out.println("\n\n-------------\n\nBienvenido a ParkingWheels, \n¿Qué tarea deseas realizar?");
        System.out.println("1 - Mostrar conductores.");
        //with car or bike
        System.out.println("2 - Insertar conductor.");
        System.out.println("3 - Modificar telefono.");
        System.out.println("4 - Mostrar conductor por placa o cedula.");
        System.out.println("5 - Eliminar conductor.");
        
        //do the same to update "placa" and "tv"
        //DO THE SAME TO PLAZAS
        //show "plazas" by state
            System.out.println("7 - Listar Plazas.");
            System.out.println("8 - Listar plazas por estado.");
            System.out.println("9 - Listar plazas disponibles según TV.");
            System.out.println("10 - Ocupar plaza.");
            System.out.println("11 - Desocupar plaza.");
            //metodo para obtener plazas y vehiculo estacionado
            
            System.out.println("12 - Generar factura.");
            System.out.println("13 - Generar cobro.");
            
            System.out.println("0 - Salir");
            System.out.print("--------> ");
            opcionElegida = sc.nextInt();
    }
}