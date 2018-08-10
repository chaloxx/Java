import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Acepto extends JFrame implements ActionListener, ChangeListener{

  private JCheckBox check;
  private JLabel label;
  private JButton boton;

  public Acepto(){
    setLayout(null);

    label = new JLabel("Acepto términos y condiciones");
    label.setBounds(10,10,400,30);
    add(label);

    check = new JCheckBox("");
    check.setBounds(10,50,100,30);
    check.addChangeListener(this);
    add(check);

    boton = new JButton("Continuar");
    boton.setBounds(10,100,150,30);
    add(boton);
    boton.addActionListener(this);
    boton.setEnabled(false);
  }

  public void stateChanged(ChangeEvent e){
    if(check.isSelected() == true){
      boton.setEnabled(true);
    }
    else{
      boton.setEnabled(false);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton){
      System.exit(0);
    }
  }

  public static void main(String arg[]){
    Acepto formulario = new Acepto();
    formulario.setBounds(0,0,350,200);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);

  }


}

