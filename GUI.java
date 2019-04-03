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
    
    private String nombre, cedula, telefono, placa, tv, parametroBusqueda;
    private String estado, numero;
        
    public GUI()
    {
        crearVentana();
    }

    public static void main(String[] args){
        new GUI();
    }
    
    private void crearVentana(){
        ventana = new JFrame("Parking Whells");
        
        ventana.setBounds(0, 0, 1000, 1000);
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
        jbUpdaTel.addActionListener(new  updateTelefono());
        jbShowConPlaOCed.addActionListener(new  mostrarConductorPorPlacaOCedula());
        jbDeleCon.addActionListener(new  eliminarUsuarioPorCedula());
        jbShowPlaCed.addActionListener(new  searchPlazaByConductor());
        jbShowPla.addActionListener(new  monstrarPlazas());
        jbShowPlaEst.addActionListener(new  mostrarPlazasPorEstado());
        jbShoPlaDisTv.addActionListener(new  mostrarPlazasTv());
        jbOcuPla.addActionListener(new  updateEstadoPlazaOcupado());
        jbDesPla.addActionListener(new  updateEstadoPlazaDisponible());
  //      jbGenFac.addActionListener(new  ingresarVehiculo());
  //      jbGenCob.addActionListener(new ActionListener(){
  //          public void actionPerformed(ActionEvent e){
  //              new  generarCobro();
  //          }
  //      });
        
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
            //revisar: validar numero y showoptiondialog
            nombre = JOptionPane.showInputDialog("Inserte el nombre");
            cedula = JOptionPane.showInputDialog("Inserte la cedula");
            telefono = JOptionPane.showInputDialog("Inserte el telefono");
            placa = JOptionPane.showInputDialog("Inserte la placa");
            tv = JOptionPane.showInputDialog("Inserte el tv");
            textAreaConsola.setText(factura.ingresarConductor(nombre, cedula, telefono, placa, tv));
        }
    }
    
    class updateTelefono implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero
            cedula = JOptionPane.showInputDialog("Digite la cedula del usuario");
            telefono = JOptionPane.showInputDialog("Inserte el nuevo telefono");
            textAreaConsola.setText(factura.updateTelefono(cedula, telefono));
        }
    }
    
    class mostrarConductorPorPlacaOCedula implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero
            parametroBusqueda = JOptionPane.showInputDialog("Inserte la cedula/placa a buscar");
            textAreaConsola.setText(factura.mostrarConductorPorPlacaOCedula(parametroBusqueda));
        }
    }

    class eliminarUsuarioPorCedula implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero
            cedula = JOptionPane.showInputDialog("Digite la cedula del usuario");
            textAreaConsola.setText(factura.eliminarUsuarioPorCedula(cedula));
        }
    }
    
    class searchPlazaByConductor implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: validar numero
            cedula = JOptionPane.showInputDialog("Digite la cedula del usuario");
            textAreaConsola.setText(factura.searchPlazaByConductor(cedula));
        }
    }
    
    class monstrarPlazas implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            textAreaConsola.setText(factura.monstrarPlazas());
        }
    }
    
    class mostrarPlazasPorEstado implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            estado = JOptionPane.showInputDialog("Digite el estado a buscar (Disponible/Ocupado)");
            textAreaConsola.setText(factura.mostrarPlazasPorEstado(estado));
        }
    }
    
    class mostrarPlazasTv implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            tv = JOptionPane.showInputDialog("Inserte el TV a buscar (Carro/Moto)");
            textAreaConsola.setText(factura.mostrarPlazasTv(tv));
        }
    }
    
    class updateEstadoPlazaOcupado implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            textAreaConsola.setText("");
            textAreaConsola.setText(factura.mostrarPlazasPorEstado("Disponible"));
            numero = JOptionPane.showInputDialog("Escoga la plaza a ocupar.");
            cedula = JOptionPane.showInputDialog("Inserte la cedula del conductor.");
            textAreaConsola.setText("");
            textAreaConsola.setText(factura.updateEstadoPlaza(numero, cedula, "Ocupado"));
        }
    }
    
    class updateEstadoPlazaDisponible implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            textAreaConsola.setText("");
            textAreaConsola.setText(factura.mostrarPlazasPorEstado("Ocupado"));
            numero = JOptionPane.showInputDialog("Escoga la plaza a desocupar.");
            textAreaConsola.setText("");
            textAreaConsola.setText(factura.updateEstadoPlaza(numero, "", "Disponible"));
        }
    }
}
