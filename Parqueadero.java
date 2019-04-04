import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

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
    
    public ArrayList<Plaza> getPlazas(){
        return plazas;
    }
    
    private Plaza plaza;
    
    String estado, tv, cedula, numero, horaEntrada, cedulaConductor, plazaStr;
    String textArea = "";
    
    private FileWriter fw;
    
    int numeroPlaza;
    
    Scanner sc = new Scanner(System.in);

    /**
     * Constructor for objects of class Parqueadero
     */
    public Parqueadero()
    {
        // initialise instance variables
        plazas = new ArrayList<>();
        cargaPlazas();
    }
    
    public void cargaPlazas(){
        try{
             sc = new Scanner(new File("plazas.txt")).useDelimiter(",");
             while(sc.hasNext()){
                plazaStr = sc.nextLine();
                strToPlaza(plazaStr);
             }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No se encontro el archivo");
        }
    }
    
    public void strToPlaza(String plazaStr){
        Scanner s = new Scanner(plazaStr).useDelimiter(",");
        numero = s.next();
        estado = s.next();
        tv = s.next();
        cedulaConductor = s.next();
        horaEntrada = s.next();
        plaza = new Plaza(numero, estado, tv, cedulaConductor, horaEntrada);
        plazas.add(plaza);
    }
    
    public void guardaPlazas(){
        Iterator<Plaza> iterator = plazas.iterator();
        String textArea = "";
        while(iterator.hasNext()){
            try{
                fw = new FileWriter(new File("plazas.txt"));
                
                Plaza plaza = iterator.next();
                textArea = textArea + plaza.getNumero() + "," +
                                plaza.getEstado() + "," +
                                plaza.getTv() + "," +
                                plaza.getCedulaConductor() + "," +
                                plaza.getHoraEntrada() + "\n";
                
                fw.write(String.format("%s", textArea));
                fw.close();
            }catch(IOException ex){
                System.out.println("No se pudo escribir el archivo.");
            }
        }
    }

    public void ingresarParqueadero(String numero, String estado, String tv, String cedulaConductor, String horaEntrada){
        Plaza plaza = new Plaza(numero, estado, tv, cedulaConductor, horaEntrada);
        plazas.add(plaza);
    }
    
    public String monstrarPlazas(){
        textArea = "";
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             Plaza plaza = iterator.next();
             textArea = textArea + plaza.getNumero() +
                        ". Estado: " + plaza.getEstado() +
                        ", TV: " + plaza.getTv() +
                        ", ocupante: " + plaza.getCedulaConductor() +
                        ", hora entrada: " + plaza.getHoraEntrada() + ".\n";
        }
        return textArea;
    }
    
    public String mostrarPlazasPorEstado(String estado){
        textArea = "";
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             Plaza plaza = iterator.next();
             if(plaza.getEstado().equalsIgnoreCase(estado)){
                 textArea = textArea + plaza.getNumero() +
                            ". Estado: " + plaza.getEstado() +
                            ", TV: " + plaza.getTv() +
                            ", ocupante: " + plaza.getCedulaConductor() +
                            ", hora entrada: " + plaza.getHoraEntrada() + ".\n";
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias == false && estado.equalsIgnoreCase("Disponible")){
            textArea = "*******No hay plazas disponibles.";
        }else if(plazasVacias == false && estado.equalsIgnoreCase("Ocupado")){
            textArea = "*******No hay plazas ocupadas.";
        }else if(!estado.equalsIgnoreCase("Ocupado") && !estado.equalsIgnoreCase("Disponible")){
            textArea = "*******El estado ingresado no existe.";
        }
        return textArea;
    }
    
    public String mostrarPlazasTv(String tv){
        textArea = "";
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             plaza = iterator.next();
             if(plaza.getTv().equalsIgnoreCase(tv) && plaza.getEstado().equalsIgnoreCase("Disponible")){
                 textArea = textArea + plaza.getNumero() +
                            ". Estado: " + plaza.getEstado() +
                            ", TV: " + plaza.getTv() +
                            ", ocupante: " + plaza.getCedulaConductor() +
                            ", hora entrada: " + plaza.getHoraEntrada() + ".\n";
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias == false){
            textArea = "*******No hay plazas disponibles.";
        }
        
        return textArea;
    }
    
    public String mostrarPlazasTvYEstado(String tv,String estado){
        textArea = "";
        boolean plazasVacias = false;
        Iterator<Plaza> iterator = plazas.iterator();
        while(iterator.hasNext()){
             plaza = iterator.next();
             if(plaza.getTv().equalsIgnoreCase(tv) && plaza.getEstado().equalsIgnoreCase(estado)){
                 textArea = textArea + plaza.getNumero() +
                            ". Estado: " + plaza.getEstado() +
                            ", TV: " + plaza.getTv() +
                            ", ocupante: " + plaza.getCedulaConductor() +
                            ", hora entrada: " + plaza.getHoraEntrada() + ".\n";
                                
                 plazasVacias = true;
            }
             
        }
        
        if(plazasVacias == false){
            textArea = "*******No hay plazas disponibles.";
        }
        
        return textArea;
    }
    
    public int searchPlazaByNumber(int numeroPlaza){    
        //revisar: que la plaza no exista
        Plaza plaza = new Plaza();
        if(numeroPlaza <= plazas.size() && numeroPlaza > 0){            
            return Integer.parseInt(plazas.get(numeroPlaza - 1).getNumero());
        }else{
        }
        return -1;
    }
    
    public String searchPlazaByConductor(String cedulaConductor){                
        Iterator<Plaza> iterator = plazas.iterator();
        int contador = 0;
        while(iterator.hasNext()){
            contador++;
            Plaza plaza= iterator.next();
             if(plaza.getCedulaConductor().equalsIgnoreCase(cedulaConductor)){
                 textArea = "El usuario con cedula ´" + cedulaConductor + "´ esta parqueado en al plaza '" + contador + "'.";
                 return textArea;
             }
        }
        textArea = "*******El usuario no esta parqueado actualmente.";
        return textArea;
    }
    
    public int searchPlazaByConductorInt(String cedulaConductor){                
        Iterator<Plaza> iterator = plazas.iterator();
        int contador = 0;
        while(iterator.hasNext()){
            contador++;
            Plaza plaza= iterator.next();
             if(plaza.getCedulaConductor().equalsIgnoreCase(cedulaConductor)){
                 return contador;
             }
        }
        return -1;
    }
    
    public String updateEstadoPlaza(int numeroPlaza, String estado, String cedula, String horaEntrada){
        if(validarEstadoPlaza(numeroPlaza, estado) == 1){
            plazas.get(numeroPlaza - 1).setEstado(estado);
            plazas.get(numeroPlaza - 1).setCedulaConductor(cedula);
            plazas.get(numeroPlaza - 1).setHoraEntrada(horaEntrada);
            textArea = "Estado de la plaza -" + numeroPlaza + "- actualizado exitosamente a -" + estado + "-";
            if(!cedula.equalsIgnoreCase("")){
                textArea = textArea + "por el usuario" + " con cedula: -" + cedula + "-";
            }
            textArea = textArea + ". ---   hora entrada: " + horaEntrada ;
        }else{
            textArea = "*******La plaza no esta disponible, escoja otra plaza.";
        }
        return textArea;
    }
    
    public int validarEstadoPlaza(int numeroPlaza, String estado){
        if(plazas.get(numeroPlaza - 1).getEstado().equalsIgnoreCase(estado)){
            return -1;
        }
        return 1;
    }
    
    public int cobrar(int indexPlaza, String tv){
        Date horaActual = new Date();
        int cobro;
        if(tv.equalsIgnoreCase("Moto")){
            cobro = (horaActual.getHours() - Integer.parseInt(plazas.get(indexPlaza - 1).getHoraEntrada())) * 1000;
            if(cobro == 0){
                return 1000;
            }
        }else{
            cobro = (horaActual.getHours() - Integer.parseInt(plazas.get(indexPlaza - 1).getHoraEntrada())) * 1500;
            if(cobro == 0){
                return 1500;
            }
        }
        
        return cobro;
    }
}
