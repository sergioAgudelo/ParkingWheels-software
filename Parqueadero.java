import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Date;


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
    
    String estado, tv, cedula;
    
    int numeroPlaza;
    
    Scanner sc = new Scanner(System.in);

    /**
     * Constructor for objects of class Parqueadero
     */
    public Parqueadero()
    {
        // initialise instance variables
        plazas = new ArrayList<>();
    }

    public void ingresarParqueadero(String numero, String estado, String tv, String cedulaConductor, Date fechaEntrada){
        Plaza plaza = new Plaza(numero, estado, tv, cedulaConductor, fechaEntrada);
        plazas.add(plaza);
    }
    
    public void monstrarPlazas(){
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             Plaza plaza = iterator.next();
             System.out.println("******* - Número: " + plaza.getNumero() +
                                ", Estado: " + plaza.getEstado() +
                                ", TV: " + plaza.getTv() +
                                ", ocupante: " + plaza.getCedulaConductor()
                                );
        }
    }
    
    public void mostrarPlazasPorEstado(){
        System.out.print("\nDigite el estado a buscar (Disponible/Ocupado) -->");
        estado = sc.nextLine();
        
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             Plaza plaza = iterator.next();
             if(plaza.getEstado().equalsIgnoreCase(estado)){
                 System.out.println("******* - Número: " + plaza.getNumero() +
                                ", Estado: " + plaza.getEstado() +
                                ", TV: " + plaza.getTv() +
                                ", ocupante: " + plaza.getCedulaConductor()
                                );
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias == false && estado.equalsIgnoreCase("Disponible")){
            System.out.println("*******No hay plazas disponibles.");
        }else if(plazasVacias == false && estado.equalsIgnoreCase("Ocupado")){
            System.out.println("*******No hay plazas ocupadas.");
        }else if(!estado.equalsIgnoreCase("Ocupado") && !estado.equalsIgnoreCase("Disponible")){
            System.out.println("*******El estado ingresado no existe.");
        }
        
    }
    
    public void mostrarPlazasPorEstado(String searchEstado){
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             Plaza plaza = iterator.next();
             if(plaza.getEstado().equalsIgnoreCase(searchEstado)){
                 System.out.println("******* - Número: " + plaza.getNumero() +
                                ", Estado: " + plaza.getEstado() +
                                ", TV: " + plaza.getTv() +
                                ", ocupante: " + plaza.getCedulaConductor()
                                );
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias == false && searchEstado.equalsIgnoreCase("Disponible")){
            System.out.println("*******No hay plazas disponibles.");
        }else if(plazasVacias == false && searchEstado.equalsIgnoreCase("Ocupado")){
            System.out.println("*******No hay plazas ocupadas.");
        }else if(!searchEstado.equalsIgnoreCase("Ocupado") && !searchEstado.equalsIgnoreCase("Disponible")){
            System.out.println("*******El estado ingresado no existe.");
        }
    }
    
    public void mostrarPlazasTv(){
        System.out.print("\nInserte el TV a buscar -->");
        tv = sc.nextLine();
                
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             plaza = iterator.next();
             if(plaza.getTv().equalsIgnoreCase(tv) && plaza.getEstado().equalsIgnoreCase("Disponible")){
                 System.out.println("******* - Número: " + plaza.getNumero() +
                                ", Estado: " + plaza.getEstado() +
                                ", TV: " + plaza.getTv() +
                                ", ocupante: " + plaza.getCedulaConductor()
                                );
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias == false){
            System.out.println("*******No hay plazas disponibles.");
        }
    }
    
    public void mostrarPlazasTvYEstado(String tv,String estado){
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             plaza = iterator.next();
             if(plaza.getTv().equalsIgnoreCase(tv) && plaza.getEstado().equalsIgnoreCase(estado)){
                 System.out.println("******* - Número: " + plaza.getNumero() +
                                ", Estado: " + plaza.getEstado() +
                                ", TV: " + plaza.getTv() +
                                ", ocupante: " + plaza.getCedulaConductor()
                                );
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias == false){
            System.out.println("*******No hay plazas disponibles.");
        }
    }
    
    public int searchPlazaByNumber(){
        System.out.print("\nEscoga la plaza a ocupar/desocupar. -->");
        numeroPlaza = sc.nextInt();
                
        Plaza plaza = new Plaza();
        if(numeroPlaza <= plazas.size() && numeroPlaza > 0){            
            return numeroPlaza;
        }
        System.out.println("*******La plaza -" + numeroPlaza + "- no existe." +plazas.size());
        return -1;
    }
    
    public void searchPlazaByConductor(){         
        System.out.print("\nIngrese la cedula del conductor. -->");
        cedula = sc.nextLine();
        
        Iterator<Plaza> iterator = plazas.iterator();
        boolean finished = false;
        int contador = 0;
        while(iterator.hasNext() && finished == false){
            contador++;
            Plaza plaza= iterator.next();
             if(plaza.getCedulaConductor().equalsIgnoreCase(cedula)){
                 System.out.println("*******El condcutor con cedula: '" + cedula + "' parqueó en la plaza número '" + contador + "'.");
                 finished = true;
             }
        }
        if(finished == false){
            System.out.println("*******El conductor con cedula/placa -" + cedula + "- no ha parqueado.");
        }
    }
    
    public int searchPlazaByConductor(String cedulaConductor){                

        Iterator<Plaza> iterator = plazas.iterator();
        boolean finished = false;
        int contador = 0;
        while(iterator.hasNext() && finished == false){
            contador++;
            Plaza plaza= iterator.next();
             if(plaza.getCedulaConductor().equalsIgnoreCase(cedulaConductor)){
                 return contador;
             }
        }
        System.out.println("*******El conductor con cedula/placa -" + cedulaConductor + "- no ha parqueado.");
        return -1;
    }
    
    public void updateEstadoPlaza(int numeroPlaza, String estado, String cedula, Date fechaEntrada){
        if(validarEstadoPlaza(numeroPlaza, estado) == 1){
            plazas.get(numeroPlaza - 1).setEstado(estado);
            plazas.get(numeroPlaza - 1).setCedulaConductor(cedula);
            plazas.get(numeroPlaza - 1).setFechaEntrada(fechaEntrada);
            int year = 1900 + fechaEntrada.getYear();
            System.out.println("*******Estado de la plaza -" + numeroPlaza + "- actualizado exitosamente a -" + estado +"-."
            + "(" + fechaEntrada.getHours() + " - " + fechaEntrada.getDay() + "/" + fechaEntrada.getMonth() + "/"
            + year   + ")");
        }
    }
    
    public int validarEstadoPlaza(int numeroPlaza, String estado){
        if(plazas.get(numeroPlaza - 1).getEstado().equalsIgnoreCase(estado)){
            System.out.println("*******La plaza -" + numeroPlaza + "- ya esta -" + estado +". Escoga otra plaza.");
            return -1;
        }
        return 1;
    }
    
    public int cobrar(int indexPlaza, String tv){
        Date horaActual = new Date();
        int cobro;
        if(tv.equalsIgnoreCase("Moto")){
            cobro = (horaActual.getHours() - plazas.get(indexPlaza - 1).getFechaEntrada().getHours()) * 1000;
            if(cobro == 0){
                return 1000;
            }
        }else{
            cobro = (horaActual.getHours() - plazas.get(indexPlaza - 1).getFechaEntrada().getHours()) * 1500;
            if(cobro == 0){
                return 1500;
            }
        }
        
        //System.out.println("-------------------horaactual " + horaActual.getHours() 
//        + "plaza " + plazas.get(indexPlaza - 1).getNumero() + " cedula " + plazas.get(indexPlaza - 1).getCedulaConductor()
//        + "fechaentrada " + plazas.get(indexPlaza - 1).getFechaEntrada()
//        + " cobro " + cobro);
        
        return cobro;
    }
}
