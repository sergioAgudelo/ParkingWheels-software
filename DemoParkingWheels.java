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
//    static private Factura factura = Factura
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int opcionElegida = 0;
        
        do{
            
            String tv, placa, telefono, cedula, nombre, basura;
            String numeroPlaza;
            int indexConductor;
            Conductor conductor = new Conductor();
            
            System.out.println("\n\n-------------\n\nBienvenido a ParkingWheels, \n\t¿Qué tarea deseas realizar?");
            System.out.println("1 - Mostrar conductores.");
            //with car or bike
            System.out.println("2 - Insertar conductor.");
            System.out.println("3 - Modificar telefono.");
            System.out.println("4 - Mostrar conductor por placa o cedula.");
            System.out.println("5 - Eliminar usuario.");
            
            //do the same to update "placa" and "tv"
            //DO THE SAME TO PLAZAS
            //show "plazas" by state
            
            System.out.println("10 - Generar factura.");
            
            System.out.println("0 - Salir");
            System.out.print("--------> ");
            opcionElegida = sc.nextInt();
            
            switch (opcionElegida){
                case 1:
                    registros.mostrarConductores();
                    break;
                
                case 2:
                    System.out.print("\nInserte el nombre -->");
                    basura = sc.nextLine();
                    nombre = sc.nextLine();
                    System.out.print("\nInserte el cedula -->");
                    cedula = sc.nextLine();
                    System.out.print("\nInserte el telefono -->");
                    telefono = sc.nextLine();
                    System.out.print("\nInserte el placa -->");
                    placa = sc.nextLine();
                    System.out.print("\nInserte el tv -->");
                    tv = sc.nextLine();
                    
                    registros.ingresarConductor(nombre, cedula, telefono, placa, tv);
                    break;
                   
                case 3:
                    System.out.print("\nDigite la cedula del usuario a modificar -->");
                    basura = sc.nextLine();
                    cedula = sc.nextLine();
                    indexConductor = registros.searchByCedula(cedula);
                    if(indexConductor == -1){
                        System.out.println("*******No existe un usuario con esta cedula");
                    }else{
                        System.out.print("\nInserte el nuevo telefono -->");
                        telefono = sc.nextLine();
                        registros.updateTelefono(indexConductor, telefono);
                    }
                    break;
                    
                case 4:
                    System.out.print("\nInserte la cedula/placa a buscar -->");
                    //For this case cedula acts as a cedula or a placa to the search
                    basura = sc.nextLine();
                    cedula = sc.nextLine();
                    registros.mostrarConductorPorPlacaOCedula(cedula);
                    break;
                    
                case 5:
                    System.out.print("\nDigite la cedula del usuario a eliminar -->");
                    basura = sc.nextLine();
                    cedula = sc.nextLine();
                    indexConductor = registros.searchByCedula(cedula);
                    if(indexConductor == -1){
                        System.out.println("No existe un usuario con esta cedula");
                    }else{
                        registros.eliminarUsuarioPorCedula(indexConductor);
                    }
                    break;
                    
                case 10:
                    System.out.print("\nInserte el cedula -->");
                    basura = sc.nextLine();
                    cedula = sc.nextLine();
                    indexConductor = registros.searchByCedula(cedula);
                    if(indexConductor == -1){
                        System.out.println("No existe un usuario con esta cedula");
                    }else{
                        conductor = registros.getConductorByIndex(indexConductor);
                        //no estoy seguro si sea una buena practica usar los get desde aca o si deberia hacerlo
                        //de la clase registros unicamente
                        nombre = conductor.getNombre();
                        placa = conductor.getPlaca();
                        tv = conductor.getTv();
                        System.out.print("\nLas plazas libres para " + tv + " son: ");
                        //parqueadero.mostrarPlazasLibres();
                        System.out.print("\nInserte la plaza en la cual va a estacionar -->");
                        numeroPlaza = sc.nextLine();
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
        }while( opcionElegida >= 1 && opcionElegida <= 10);
            
    }
}
