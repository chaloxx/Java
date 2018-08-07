import javax.swing.*;
import java.awt.event.*;


public class Formulario5 extends JFrame {
  private JTextField textField1;
  private JLabel label1;
  private JButton boton1;
  private JTextArea textArea1;
  private JScrollPane scrollPane1;

  public Formulario5(){
    setLayout(null);
    label1 = new JLabel("Usuario:");
    label1.setBounds(10,10,100,30);
    add(label1);

    textField1 = new JTextField();
    textField1.setBounds(10,10,200,30);
    add(textField1);

    /*boton1 = new JButton("Aceptar");
    boton1.setBounds(10,80,100,30);
    add(boton1);
    boton1.addActionListener(this);*/

    textArea1 = new JTextArea();
    scrollPane1 = new JScrollPane(textArea1);
    scrollPane1.setBounds(1,50,400,300);
    add(scrollPane1);
  }

  /*public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      String texto = textField1.getText();
      setTitle(texto);
    }*/

  public static void main(String args[]){
    Formulario5 formulario = new Formulario5();
    formulario.setBounds(0,0,540,400);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);

  }


}