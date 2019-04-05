/**
*Text genereted by Simple GUI Extension for BlueJ
*/
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
import java.awt.Window;

public class GUI_project extends JFrame {

    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JPanel panel1;
    private JTextArea textarea1;
    private JLabel footerLabel;
    private JScrollPane scroll;
    
    private Factura factura = new Factura();
    private String nombre, cedula, telefono, placa, tv, parametroBusqueda;
    private String estado, numero;
    private String textArea;
    private segundaVenta ventan2;
    
    

    //Constructor 
    public GUI_project(){

        this.setTitle("ParkingWheels");
        this.setSize(809,500);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(809,500));
        contentPane.setBackground(new Color(192,192,192));
        //1040 - 400
        
        
        textarea1 = new JTextArea();
        
        textarea1.setBackground(new Color(148,148,148));
        textarea1.setForeground(new Color(255,255,255));
        textarea1.setEnabled(true);
        textarea1.setFont(new Font("sansserif",0,20));
        textarea1.setText("Bienvenidos a Parking Wheels");
        textarea1.setBorder(BorderFactory.createBevelBorder(1));
        textarea1.setVisible(true);
        textarea1.setLineWrap(true);
        textarea1.setWrapStyleWord(true);
        
        scroll = new JScrollPane(textarea1);
        scroll.setBounds(230,250,1040,400);
       
        
        button1 = new JButton();
        button1.setBounds(26,630,178,38);
        button1.setBackground(new Color(68,68,68));
        button1.setForeground(new Color(255,255,255));
        button1.setEnabled(true);
        button1.setFont(new Font("Trebuchet MS",0,14));
        button1.setText("Generar Cobro");
        button1.setVisible(true);
       
        button2 = new JButton();
        button2.setBounds(26,580,178,38);
        button2.setBackground(new Color(68,68,68));
        button2.setForeground(new Color(255,255,255));
        button2.setEnabled(true);
        button2.setFont(new Font("Trebuchet MS",0,14));
        button2.setText("Insertar Vehiculo");
        button2.setVisible(true);

        button3 = new JButton();
        button3.setBounds(26,530,178,38);
        button3.setBackground(new Color(68,68,68));
        button3.setForeground(new Color(255,255,255));
        button3.setEnabled(true);
        button3.setFont(new Font("Trebuchet MS",0,14));
        button3.setText("Desocupar Plaza");
        button3.setVisible(true);

        button4 = new JButton();
        button4.setBounds(26,480,178,38);
        button4.setBackground(new Color(68,68,68));
        button4.setForeground(new Color(255,255,255));
        button4.setEnabled(true);
        button4.setFont(new Font("Trebuchet MS",0,14));
        button4.setText("Ocupar Plaza");
        button4.setVisible(true);

        button5 = new JButton();
        button5.setBounds(26,430,178,38);
        button5.setBackground(new Color(68,68,68));
        button5.setForeground(new Color(255,255,255));
        button5.setEnabled(true);
        button5.setFont(new Font("Trebuchet MS",0,14));
        button5.setText("MostrarPlazas Disponibles/TV");
        button5.setVisible(true);

        button6 = new JButton();
        button6.setBounds(26,380,178,38);
        button6.setBackground(new Color(68,68,68));
        button6.setForeground(new Color(255,255,255));
        button6.setEnabled(true);
        button6.setFont(new Font("Trebuchet MS",0,14));
        button6.setText("Listar Plazas por Estado");
        button6.setVisible(true);

        button7 = new JButton();
        button7.setBounds(26,330,178,38);
        button7.setBackground(new Color(68,68,68));
        button7.setForeground(new Color(255,255,255));
        button7.setEnabled(true);
        button7.setFont(new Font("Trebuchet MS",0,14));
        button7.setText("Listar Plazas");
        button7.setVisible(true);
        button7.addActionListener(accion);
        
        

        button8 = new JButton();
        button8.setBounds(26,280,178,38);
        button8.setBackground(new Color(68,68,68));
        button8.setForeground(new Color(255,255,255));
        button8.setEnabled(true);
        button8.setFont(new Font("Trebuchet MS",0,14));
        button8.setText("Buscar Plaza por Ced");
        button8.setVisible(true);

        button9 = new JButton();
        button9.setBounds(26,230,178,38);
        button9.setBackground(new Color(68,68,68));
        button9.setForeground(new Color(255,255,255));
        button9.setEnabled(true);
        button9.setFont(new Font("Trebuchet MS",0,14));
        button9.setText("Eliminar Conductor");
        button9.setVisible(true);

        button10 = new JButton();
        button10.setBounds(26,180,178,38);
        button10.setBackground(new Color(68,68,68));
        button10.setForeground(new Color(255,255,255));
        button10.setEnabled(true);
        button10.setFont(new Font("Trebuchet MS",0,14));
        button10.setText("Buscar por Placa/Ced");
        button10.setVisible(true);

        button11 = new JButton();
        button11.setBounds(26,130,178,38);
        button11.setBackground(new Color(68,68,68));
        button11.setForeground(new Color(255,255,255));
        button11.setEnabled(true);
        button11.setFont(new Font("Trebuchet MS",0,14));
        button11.setText("Actualizar Telefono");
        button11.setVisible(true);

        button12 = new JButton();
        button12.setBounds(26,80,178,38);
        button12.setBackground(new Color(68,68,68));
        button12.setForeground(new Color(255,255,255));
        button12.setEnabled(true);
        button12.setFont(new Font("Trebuchet MS",0,14));
        button12.setText("Insertar Conductor");
        button12.setVisible(true);

        button13 = new JButton();
        button13.setBounds(26,30,178,38);
        button13.setBackground(new Color(68,68,68));
        button13.setForeground(new Color(255,255,255));
        button13.setEnabled(true);
        button13.setFont(new Font("Trebuchet MS",0,14));
        button13.setText("Listar Conductores");
        button13.setVisible(true);
       
        
        
        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(25,25,1320,685);
        panel1.setBackground(new Color(255,255,255));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);
        
        ImageIcon icon = new ImageIcon("logo5.png");
        JLabel label = new JLabel(icon);
        label.setBounds(500,10,400,226);
       
        
        footerLabel = new JLabel("Desarrrollado por Sergio Agudelo y Lizeth Parra.");
        
        button13.addActionListener(new  mostrarConductores());
        button12.addActionListener(new  ingresarConductor());
        button11.addActionListener(new  updateTelefono());
        button10.addActionListener(new  mostrarConductorPorPlacaOCedula());
        button9.addActionListener(new  eliminarUsuarioPorCedula());
        button8.addActionListener(new  searchPlazaByConductor());
        button7.addActionListener(new  monstrarPlazas());
        button6.addActionListener(new  mostrarPlazasPorEstado());
        button5.addActionListener(new  mostrarPlazasTv());
        button4.addActionListener(new  updateEstadoPlazaOcupado());
        button3.addActionListener(new  updateEstadoPlazaDisponible());
        button2.addActionListener(new  ingresarVehiculo());
        button1.addActionListener(new generarCobro());

        //adding components to contentPane panel
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(button10);
        panel1.add(button11);
        panel1.add(button12);
        panel1.add(button13);
        panel1.add(label);
        panel1.add(scroll);
        panel1.add(scroll);
        contentPane.add(panel1);
        

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
    }
    
<<<<<<< HEAD
        ActionListener accion = new ActionListener(){
        
            @Override
                public void actionPerformed(ActionEvent ae){
                    //saludo.setText("Hola soy Liz");
                    if(ae.getSource()==button7){
                       ventan2 = new segundaVenta();
                       ventan2.setVisible(true);
                    }
                      
        }
                   
        };
=======
    ActionListener accion = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            //saludo.setText("Hola soy Liz");
            if(ae.getSource()==button7){
               ventan2 = new segundaVenta();
               ventan2.setVisible(true);
            }     
        }        
    };
>>>>>>> 37b660dcb9e92275912442404943343906898c86

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }
    class mostrarConductores implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            textarea1.setText(factura.mostrarConductores());
        }
    }
    
    class ingresarConductor implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero y showoptiondialog
            nombre = JOptionPane.showInputDialog("Inserte el nombre");
            cedula = JOptionPane.showInputDialog("Inserte la cedula");
            telefono = JOptionPane.showInputDialog("Inserte el telefono");
            placa = JOptionPane.showInputDialog("Inserte la placa");
            tv = JOptionPane.showInputDialog("Inserte el tv");
            textarea1.setText(factura.ingresarConductor(nombre, cedula, telefono, placa, tv));
        }
    }
    
    class updateTelefono implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero
            cedula = JOptionPane.showInputDialog("Digite la cedula del usuario");
            telefono = JOptionPane.showInputDialog("Inserte el nuevo telefono");
            textarea1.setText(factura.updateTelefono(cedula, telefono));
        }
    }
    
    class mostrarConductorPorPlacaOCedula implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero
            parametroBusqueda = JOptionPane.showInputDialog("Inserte la cedula/placa a buscar");
            textarea1.setText(factura.mostrarConductorPorPlacaOCedula(parametroBusqueda));
        }
    }

    class eliminarUsuarioPorCedula implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero
            cedula = JOptionPane.showInputDialog("Digite la cedula del usuario");
            textarea1.setText(factura.eliminarUsuarioPorCedula(cedula));
        }
    }
    
    class searchPlazaByConductor implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero
            cedula = JOptionPane.showInputDialog("Digite la cedula del usuario");
            textarea1.setText(factura.searchPlazaByConductor(cedula));
        }
    }
    
    class monstrarPlazas implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            textarea1.setText(factura.monstrarPlazas());
        }
    }
    
    class mostrarPlazasPorEstado implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            estado = JOptionPane.showInputDialog("Digite el estado a buscar (Disponible/Ocupado)");
            textarea1.setText(factura.mostrarPlazasPorEstado(estado));
        }
    }
    
    class mostrarPlazasTv implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            tv = JOptionPane.showInputDialog("Inserte el TV a buscar (Carro/Moto)");
            textarea1.setText(factura.mostrarPlazasTv(tv));
        }
    }
    
    class updateEstadoPlazaOcupado implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            textarea1.setText("");
            textarea1.setText(factura.mostrarPlazasPorEstado("Disponible"));
            numero = JOptionPane.showInputDialog("Escoga la plaza a ocupar.");
            cedula = JOptionPane.showInputDialog("Inserte la cedula del conductor.");
            textarea1.setText("");
            textarea1.setText(factura.updateEstadoPlaza(numero, cedula, "Ocupado"));
        }
    }
    
    class updateEstadoPlazaDisponible implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            textarea1.setText("");
            textarea1.setText(factura.mostrarPlazasPorEstado("Ocupado"));
            numero = JOptionPane.showInputDialog("Escoga la plaza a desocupar.");
            textarea1.setText("");
            textarea1.setText(factura.updateEstadoPlaza(numero, "", "Disponible"));
        }
    }
    
    class ingresarVehiculo implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            textArea = "";
            textarea1.setText("");
            tv = JOptionPane.showInputDialog("Inserte el TV a estacionar (Carro/Moto)");
            textArea = "Las plazas libres para '" + tv + "' son:\n\n";
            textArea = textArea + factura.mostrarPlazasTvYEstado(tv, "Disponible");
            textarea1.setText(textArea);
            numero = JOptionPane.showInputDialog("Escoga la plaza a ocupar.");
            cedula = JOptionPane.showInputDialog("Inserte la cedula del conductor.");
            textarea1.setText("");
            textarea1.setText(factura.ingresarVehiculo(numero, cedula, "Ocupado"));
        }
    }
    
    class generarCobro implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            textarea1.setText("");
            textarea1.setText(factura.mostrarPlazasPorEstado("Ocupado"));
            numero = JOptionPane.showInputDialog("Escoga la plaza a desocupar.");
            textarea1.setText("");
            textarea1.setText(factura.generarCobro(numero, "Disponible"));
        }
    }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_project();
            }
        });
    }

}