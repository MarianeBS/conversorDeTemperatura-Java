package padrao;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
/**
 *
 * @author Mariane
 */
public class Conversor extends JFrame 
{
    JLabel titulo, label1, label2, label3;
    JTextField  celsius, fahrenheit, kelvin;
    JButton converter, limpar;
    
    public DecimalFormat df = new DecimalFormat ("0.00");
    
    public Conversor()
    {
        super("Conversor de Temperatura");
        Container tela = getContentPane();
        setLayout(null);
        titulo = new JLabel ("Conversor de Temperatura");        
        label1 = new JLabel ("Graus Celsius:");
        label2 = new JLabel ("Graus Fahrenheit:"); 
        label3 = new JLabel ("Graus Kelvin:"); 
        celsius = new JTextField (5);
        fahrenheit = new JTextField (5);
        kelvin = new JTextField (5);
        converter = new JButton ("Converter");
        limpar = new JButton ("Limpar");
        
        titulo.setBounds (65, 30, 300, 25);
        
        label1.setBounds (60, 90, 150, 20);
        celsius.setBounds (205, 90, 100, 20);
        
        label2.setBounds (60, 130, 150, 20);
        fahrenheit.setBounds (205, 130, 100, 20);
        
        label3.setBounds (60, 170, 150, 20);
        kelvin.setBounds (205, 170, 100, 20);
        
        converter.setBounds (50, 215, 120, 25);
        limpar.setBounds (210, 215, 120, 25);
           
       
        
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        label3.setFont(new Font("Arial", Font.BOLD, 16));
        converter.setFont(new Font("Arial", Font.BOLD, 16));
        limpar.setFont(new Font("Arial", Font.BOLD, 16));
        kelvin.setForeground(Color.black);
        fahrenheit.setForeground(Color.black);
        
        converter.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double c, convF, convK;
                    convF = 0.00;
                    convK = 0.00;
                    c = Double.parseDouble(celsius.getText());
               
                    convF = c * 1.8 + 32;
                    convK = c + 273.15;
                   
                    fahrenheit.setVisible(true);
                    kelvin.setVisible(true);
                    fahrenheit.setText(df.format(convF));
                    kelvin.setText(df.format(convK));      
                } 
            }
        );
        
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    celsius.setText(null);
                    fahrenheit.setText(null);
                    kelvin.setText(null);
                    celsius.requestFocus();  
                } 
            }
        );
        
        tela.add(titulo);
        
        tela.add(label1);
        tela.add(celsius);
        
        tela.add(label2);
        tela.add(fahrenheit);
        
        tela.add(label3);
        tela.add(kelvin);
 
        tela.add(converter);
        tela.add(limpar);
        
        tela.setBackground(new Color(96, 223, 255));
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(400, 300);
        setVisible(true);
    }    
}
