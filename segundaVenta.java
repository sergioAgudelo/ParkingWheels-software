import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.lang.String;

<<<<<<< HEAD
=======
    



>>>>>>> 37b660dcb9e92275912442404943343906898c86


public class segundaVenta extends JFrame {
    JPanel p = new JPanel();
    private creadorPlazas plazas;
    JButton buttons[]=new JButton[25];
    ImageIcon ocupado = new ImageIcon(this.getClass().getResource("rojo.jpg"));
    int value = 0;
    private JScrollPane scroll;
<<<<<<< HEAD
    Parqueadero park =  plazas.crearPlazas();
    Factura factura = new Factura();
    String nombre, cedula, telefono, placa, tv, parametroBusqueda;
    String estado, numero;
=======
>>>>>>> 37b660dcb9e92275912442404943343906898c86
    
    public static void main(String args[]){
        new segundaVenta ();
    
    }
    
    public segundaVenta (){
        
        super("segundaVenta");
        setSize(300,300);
        setResizable(false);
        setPreferredSize(new Dimension(400,400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(5,5));
        
<<<<<<< HEAD
 

        for(int i=0; i<25; i++){
            ImageIcon disponible =  new ImageIcon(this.getClass().getResource("verde.jpg"));
            buttons[i] = new JButton(disponible);
            Plaza a = park.getPlazas().get(i);
            String estado = a.getEstado();
            
            if(estado == "Disponible"){
                buttons[i].addActionListener(accion2);
            }
            

=======
        
        
 

        for(int i=0; i<25; i++){
          
            ImageIcon disponible =  new ImageIcon(this.getClass().getResource("verde.jpg"));
            buttons[i] = new JButton(disponible);
            
            Parqueadero park =  plazas.crearPlazas();
            Plaza a = park.getPlazas().get(i);
            String estado = a.getEstado();
           
>>>>>>> 37b660dcb9e92275912442404943343906898c86
            if(estado == "Ocupado"){
               buttons[i].setIcon(ocupado);
               buttons[i].addActionListener(accion);
            }
<<<<<<< HEAD
 
=======
            
>>>>>>> 37b660dcb9e92275912442404943343906898c86
            p.add(buttons[i]);
            
            
        }
        
        add(p);
        
        
        this.setVisible(true);
        
    }
    
    ActionListener accion = new ActionListener(){
        
            @Override
                public void actionPerformed(ActionEvent ae){
<<<<<<< HEAD
                    for(int i=0; i<25; i++){
                        if(ae.getSource()==buttons[i]){
                            Plaza a = park.getPlazas().get(i);
                            String estado = a.getEstado();
                            JOptionPane.showMessageDialog(null,"Plaza"+" "+ estado);
                        }
                    }
    };
  };
  
   ActionListener accion2 = new ActionListener(){
        
            @Override
                public void actionPerformed(ActionEvent ae){
                    for(int i=0; i<25; i++){
                        if(ae.getSource()==buttons[i]){
                            Plaza a = park.getPlazas().get(i);
                            String estado = a.getEstado();
                            if(estado == "Disponible"){
                                JOptionPane.showMessageDialog(null,factura.updateEstadoPlaza(String.valueOf(i), "", estado));
                                
                            }
                        }
                    }
    };
  };
   
  }

=======
                    for(int i=0; i<9; i++){
                        if(ae.getSource()==buttons[i])
                        JOptionPane.showMessageDialog(null,"PlazaOcupada!");
                        }
                    }
    };
                    
                      
};
>>>>>>> 37b660dcb9e92275912442404943343906898c86
     
 
