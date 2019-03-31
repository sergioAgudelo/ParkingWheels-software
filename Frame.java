import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//herencia, abstraccion-interfaces, 
//9: GUIs, clases internas, anonymous inner classes, modularization

//awt, awt.event, javax.swing, ActionListener, WIndowEvent, ActionEvent



public class Frame implements ActionListener//awt.event
{
    private JFrame frame;
    private JLabel titleLabel, versionLabel, statusLabel;
    private JPanel toolbar, flowToolbar;
    private JButton smallerButton, largerButton;
    //error: how to use ImagePanel chapter 11 slide 11
    //private ImagePanel imagePanel;
    /**
     * Constructor for objects of class Frame
     */
    public Frame(){
        makeFrame();
    }
        
    private void makeFrame(){
        //swing
        frame = new JFrame("Frame Parking Wheels");
        //error: chapter 11 slide 36
        //frame.addWindowListener(            new WindowAdapter()            {                public void windowClosing(WindowEvent e){ System.exit(0); }            }        );
        
        //awt
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        //menu
        hacerMenu(frame);
        
        //swing, NORTH
        titleLabel = new JLabel("primer version estudio y diseño GUI proyecto final software 2");
        contentPane.add(titleLabel, BorderLayout.NORTH);
        
        //CENTER
        //imagePanel = new ImagePanel();
        //contentPane.add(imagePanel, BorderLayout.CENTER);
        
        //SOUTH
        versionLabel = new JLabel("version 1.0");
        contentPane.add(versionLabel, BorderLayout.SOUTH);
        
        //WEST
        toolbar = new JPanel();
        toolbar.setLayout(new GridLayout(0, 1));
        smallerButton = new JButton("Smaller");
        smallerButton.addActionListener(this);
        toolbar.add(smallerButton);
        largerButton = new JButton("Larger");
        largerButton.addActionListener(this);
        toolbar.add(largerButton);
        flowToolbar = new JPanel();
        flowToolbar.add(toolbar);
        contentPane.add(flowToolbar, BorderLayout.WEST);
        
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e.getActionCommand());
    }
    
    private void hacerMenu(JFrame frame)
    {
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        
        
        
        //inner class
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        itemAbrir.addActionListener(new OyenteAbrir());
        fileMenu.add(itemAbrir);
        
        //anonymous inner class
        JMenuItem itemCerrar = new JMenuItem("Cerrar");
        itemCerrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        fileMenu.add(itemCerrar);
        
        showAbout();
    }
    
    class OyenteAbrir implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("open");
        }
    }
    
    private void showAbout(){
        JOptionPane.showMessageDialog(frame, "Frame\n", "About Frame", JOptionPane.INFORMATION_MESSAGE);
    }
}
