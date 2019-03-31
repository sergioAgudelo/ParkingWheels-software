
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


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
    
    String estado, tv;
    
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
                                ", TV: " + plaza.getTv()
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
                                ", TV: " + plaza.getTv()
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
                                ", TV: " + plaza.getTv()
                                );
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias == false){
            System.out.println("*******No hay plazas disponibles.");
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
        System.out.println("*******La plaza -" + numeroPlaza + "- no existe.");
        return -1;
    }
    
    public void updateEstadoPlaza(int numeroPlaza, String estado){
        plazas.get(numeroPlaza - 1).setEstado(estado);
        System.out.println("*******Estado de la plaza -" + numeroPlaza + "- actualizado exitosamente a -" + estado +"-.");
        //plaza.setEstado(
    }
}
