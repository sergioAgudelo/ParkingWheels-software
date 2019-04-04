import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GUI extends JFrame{
    private Factura factura = new Factura();
    
    private JFrame ventana;
    private JPanel jpPrincipal, jpBotones, jpMenu;
    private JTextArea textAreaConsola;
    private JButton jbShowCon, jbInseCon, jbUpdaTel, jbShowConPlaOCed, jbDeleCon, jbShowPlaCed, jbShowPla, jbShowPlaEst, jbShoPlaDisTv,
        jbOcuPla, jbDesPla, jbGenFac, jbGenCob;
    private JLabel titleLabel, footerLabel;
    
    private String nombre, cedula, telefono, placa, tv, parametroBusqueda;
    private String estado, numero;
    private String textArea;
<<<<<<< HEAD
    private JPanel panel1;
    private JMenuBar menuBar;
=======
>>>>>>> 6f52dbb52dc7771d92f842dba025a60ba1ea80e2
    
        
    public GUI()
    {
        crearVentana();
    }

    public static void main(String[] args){
        new GUI();
    }
    
    private void crearVentana(){
        
        
        
        
        ventana = new JFrame("Parking Whells");
        
        ventana.setBounds(0, 0, 10000, 700);
        ventana.setLayout(new BorderLayout());
        //jpPrincipal = (JPanel) ventana.getContentPane();
        //jpPrincipal.setLayout(new BorderLayout());
        
        JMenuBar menuBar = new JMenuBar();
        ventana.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem acercaDe = new JMenuItem("Acerca de ...");
        acercaDe.addActionListener(new acercaDe());
        fileMenu.add(acercaDe);
        JMenuItem guardar = new JMenuItem("Guardar");
        guardar.addActionListener(new guardar());
        fileMenu.add(guardar);


        
        titleLabel = new JLabel("Parking Wheels - Software 2");
        
        textAreaConsola = new JTextArea("Bienvenido a Parking Wheels");
        
        footerLabel = new JLabel("Desarrrollado por Sergio Agudelo y Lizeth Parra.");
        
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
        jbGenFac.addActionListener(new  ingresarVehiculo());
        jbGenCob.addActionListener(new generarCobro());
        
        
		panel1 = new JPanel(null);
		panel1.setBorder(BorderFactory.createEtchedBorder(1));
		panel1.setBounds(43,36,411,331);
		panel1.setBackground(new Color(214,217,223));
		panel1.setForeground(new Color(0,0,0));
		panel1.setEnabled(true);
		panel1.setFont(new Font("sansserif",0,12));
		panel1.setVisible(true);
        
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
        ventana.add(footerLabel, BorderLayout.SOUTH);
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        ventana.setVisible(true);
    }
    
    class acercaDe implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(ventana, 
            "Este proyecto fue desarrollador para la materia Software 2 dictada por Fernando Rojas.\n" +
            "Funciona como sistema de gestión para un parqueadero, permite manejar conductores y las plazas.\n" +
            "Realizado por Sergio Agudelo y Lizeth Parra el 3 de Abril de 2019.\n"
            , "About Parking Wheels", JOptionPane.INFORMATION_MESSAGE);
        }
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
    
    class ingresarVehiculo implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            textArea = "";
            textAreaConsola.setText("");
            tv = JOptionPane.showInputDialog("Inserte el TV a estacionar (Carro/Moto)");
            textArea = "Las plazas libres para '" + tv + "' son:\n\n";
            textArea = textArea + factura.mostrarPlazasTvYEstado(tv, "Disponible");
            textAreaConsola.setText(textArea);
            numero = JOptionPane.showInputDialog("Escoga la plaza a ocupar.");
            cedula = JOptionPane.showInputDialog("Inserte la cedula del conductor.");
            textAreaConsola.setText("");
            textAreaConsola.setText(factura.ingresarVehiculo(numero, cedula, "Ocupado"));
        }
    }
    
    class generarCobro implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //revisar: showOptiOonDialog
            textAreaConsola.setText("");
            textAreaConsola.setText(factura.mostrarPlazasPorEstado("Ocupado"));
            numero = JOptionPane.showInputDialog("Escoga la plaza a desocupar.");
            textAreaConsola.setText("");
            textAreaConsola.setText(factura.generarCobro(numero, "Disponible"));
        }
    }
    
    class guardar implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            factura.guardar();
            JOptionPane.showMessageDialog( ventana, "Archivo conductores.txt y plazas.txt guardados satistactoriamente." );
        }
    }
}
