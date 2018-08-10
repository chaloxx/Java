import javax.swing.*;
import javax.swing.event.*;

public class CheckBox extends JFrame implements ChangeListener{

  private JCheckBox check1, check2, check3;

  public CheckBox(){
    setLayout(null);

    check1 = new JCheckBox("Ingles");
    check1.setBounds(10,10,150,30);
    check1.addChangeListener(this);
    add(check1);

    check2 = new JCheckBox("Frances");
    check2.setBounds(10,50,150,30);
    check2.addChangeListener(this);
    add(check2);

    check3 = new JCheckBox("Aleman");
    check3.setBounds(10,90,150,30);
    check3.addChangeListener(this);
    add(check3);
  }

  public void stateChanged(ChangeEvent e){
    String cad = "";

    if(check1.isSelected() == true){
      cad += "Inglés-";
    }
      
    if(check2.isSelected() == true){
      cad += "Francés-";
    }

    if(check3.isSelected() == true){
      cad += "Alemán-";
    }

    setTitle(cad);
  }

  public static void main(String arg[]){
    CheckBox formulario = new CheckBox();
    formulario.setBounds(0,0,350,200);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }


}