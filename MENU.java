import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class MENU extends JFrame implements ActionListener{

  private  JMenuBar menuBar;
  private JMenu menu;
  private JMenuItem menuItem1, menuItem2, menuItem3;

  public MENU(){
    setLayout(null);
    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    menu = new JMenu("Opciones");
    menuBar.add(menu);

    menuItem1 = new JMenuItem("Rojo");
    menuItem1.addActionListener(this);
    menu.add(menuItem1);

    menuItem2 = new JMenuItem("Verde");
    menuItem2.addActionListener(this);
    menu.add(menuItem2);

    menuItem3 = new JMenuItem("Azul");
    menuItem3.addActionListener(this);
    menu.add(menuItem3);
  }

  public void actionPerformed(ActionEvent e){
    Container fondo = this.getContentPane();

    if(e.getSource() == menuItem1){
      fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuItem2){
      fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == menuItem3){
      fondo.setBackground(new Color(0,0,255));
    }
  }

  public static void main(String args[]){
    MENU formulario = new MENU();
    formulario.setBounds(0,0,400,300);
    formulario.setVisible(true);
    formulario.setLocationRelativeTo(null);
  }
}
