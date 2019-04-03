import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GUI
{
    private Factura factura = new Factura();
    
    private JFrame ventana;
    private JPanel jpPrincipal, jpBotones, jpMenu;
    private JTextArea textAreaConsola;
    private JButton jbShowCon, jbInseCon, jbUpdaTel, jbShowConPlaOCed, jbDeleCon, jbShowPlaCed, jbShowPla, jbShowPlaEst, jbShoPlaDisTv,
        jbOcuPla, jbDesPla, jbGenFac, jbGenCob;
    private JLabel titleLabel;
        
    public GUI()
    {
        crearVentana();
    }

    public static void main(String[] args){
        new GUI();
    }
    
    private void crearVentana(){
        ventana = new JFrame("Parking Whells");
        
        ventana.setBounds(200, 200, 1000, 1000);
        jpPrincipal = (JPanel) ventana.getContentPane();
        jpPrincipal.setLayout(new BorderLayout());
        
        titleLabel = new JLabel("Parking Wheels - Software 2");
        
        textAreaConsola = new JTextArea("Bienvenido a Parking Wheels");
        
        jbShowCon = new JButton("Listar Conductores");
        jbInseCon = new JButton("Insertar conductor");
        jbUpdaTel = new JButton("Actualizar telefono");
        jbShowConPlaOCed = new JButton("Buscar por placa/cedula");
        jbDeleCon = new JButton("Eliminar conductor");
        jbShowPlaCed = new JButton("Buscar plaza por cedula");
        jbShowPla = new JButton("Listar plazas");
        jbShowPlaEst = new JButton("Listar plazas por estado");
        jbShoPlaDisTv = new JButton("Mostrar plazas disponibles por tv");
        jbOcuPla = new JButton("Ocupar plaza");
        jbDesPla = new JButton("Desocupar plaza");
        jbGenFac = new JButton("Ingresar vehiculo");
        jbGenCob = new JButton("Generar cobro");
        
        jbShowCon.addActionListener(new  mostrarConductores());
        jbInseCon.addActionListener(new  ingresarConductor());
        jbUpdaTel.addActionListener(new  mostrarConductores());
        jbShowConPlaOCed.addActionListener(new  mostrarConductores());
        jbDeleCon.addActionListener(new  mostrarConductores());
        jbShowPlaCed.addActionListener(new  mostrarConductores());
        jbShowPla.addActionListener(new  mostrarConductores());
        jbShowPlaEst.addActionListener(new  mostrarConductores());
        jbShoPlaDisTv.addActionListener(new  mostrarConductores());
        jbOcuPla.addActionListener(new  mostrarConductores());
        jbDesPla.addActionListener(new  mostrarConductores());
        jbGenFac.addActionListener(new  mostrarConductores());
        jbGenCob.addActionListener(new  mostrarConductores());
        jbGenCob.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new  mostrarConductores();
            }
        });
        
        jpBotones = new JPanel();
        jpBotones.setLayout(new GridLayout(0, 1));
        jpBotones.add(jbShowCon);
        jpBotones.add(jbInseCon);
        jpBotones.add(jbUpdaTel);
        jpBotones.add(jbShowConPlaOCed);
        jpBotones.add(jbDeleCon);
        jpBotones.add(jbShowPlaCed);
        jpBotones.add(jbShowPla);
        jpBotones.add(jbShowPlaEst);
        jpBotones.add(jbShoPlaDisTv);
        jpBotones.add(jbOcuPla);
        jpBotones.add(jbDesPla);
        jpBotones.add(jbGenFac);
        jpBotones.add(jbGenCob);
        jpMenu = new JPanel();
        jpMenu.add(jpBotones);
        ventana.add(titleLabel, BorderLayout.NORTH);
        ventana.add(jpBotones, BorderLayout.WEST);
        ventana.add(textAreaConsola, BorderLayout.CENTER);
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        ventana.pack();
        ventana.setVisible(true);
    }
    
    class mostrarConductores implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            textAreaConsola.setText(factura.mostrarConductores());
        }
    }
    
    class ingresarConductor implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String nombre = JOptionPane.showInputDialog("Inserte el nombre");
            String cedula = JOptionPane.showInputDialog("Inserte la cedula");
            String telefono = JOptionPane.showInputDialog("Inserte el telefono");
            String placa = JOptionPane.showInputDialog("Inserte la placa");
            String tv = JOptionPane.showInputDialog("Inserte el tv");
            textAreaConsola.setText(factura.ingresarConductor(nombre, cedula, telefono, placa, tv));
        }
    }
}
