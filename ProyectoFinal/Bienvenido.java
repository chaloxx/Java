import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenido extends JFrame implements ActionListener{
  private JTextField textField;
  private JLabel label1, label2, label3, label4;
  private JButton boton;
  public static String texto = "";

  public Bienvenido(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

    ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
    label1 = new JLabel(imagen);
    label1.setBounds(25,15,300,150);
    add(label1);

    label2 = new JLabel("Sistema de control vacacional");
    label2.setBounds(35,135,350,30);
    label2.setFont(new Font("Andale Mono",3,18));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su nombre:");
    label3.setBounds(42,212,200,30);
    label3.setFont(new Font("Andale Mono",1,12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("©2017 The Coca-Cola Company");
    label4.setBounds(85,340,300,30);
    label4.setFont(new Font("Andale Mono",1,12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textField = new JTextField();
    textField.setBounds(45,240,255,25);
    textField.setBackground(new Color(224,224,224));
    textField.setFont(new Font("Andale Mono",1,12));
    textField.setForeground(new Color(220,0,0));
    add(textField);


    boton = new JButton("Ingresar");
    boton.setBounds(125,280,100,30);
    boton.setBackground(new Color(255,255,255));
    boton.setFont(new Font("Andale mono",1,14));
    boton.setForeground(new Color(255,0,0));
    boton.addActionListener(this);
    add(boton);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton){
      texto = textField.getText().trim();
      if(texto.equals("")){
        JOptionPane.showMessageDialog(null,"Debes ingresar un nombre");
      }
      else{
        Licencia licencia = new Licencia();
        licencia.setBounds(0,0,768,480);
        licencia.setVisible(true);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
        this.setVisible(false);
      }
    }
  }

  public static void main(String arg[]){
    Bienvenido ventana = new Bienvenido();
    ventana.setBounds(0,0,400,400);
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
  }
}