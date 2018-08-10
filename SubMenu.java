import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SubMenu extends JFrame implements ActionListener{
  private JMenuBar menuBar;
  private JMenu menu,subMenu1, subMenu2;
  private JMenuItem item1SM1,item2SM1,item1SM2, item2SM2;

  public SubMenu(){
    setLayout(null);

    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    menu =  new JMenu("Opciones");
    menuBar.add(menu);

    subMenu1 = new JMenu("Tamaño de la pantalla");
    menu.add(subMenu1);

    subMenu2 = new JMenu("Color de fondo");
    menu.add(subMenu2);

    item1SM1 = new JMenuItem("300*200");
    item1SM1.addActionListener(this);
    subMenu1.add(item1SM1);

    item2SM1 = new JMenuItem("640*480");
    item2SM1.addActionListener(this);
    subMenu1.add(item2SM1);

    item1SM2 = new JMenuItem("Rojo");
    item1SM2.addActionListener(this);
    subMenu2.add(item1SM2);

    item2SM2 = new JMenuItem("Verde");
    item2SM2.addActionListener(this);
    subMenu2.add(item2SM2);
  }

  public void actionPerformed(ActionEvent e){
    Container fondo = this.getContentPane();

    if(e.getSource() == item1SM1){
      setSize(300,200);
    }

    if(e.getSource() == item2SM1){
      setSize(640,480);
    }

    if(e.getSource() == item1SM1){}

    if(e.getSource() == item1SM2){
      fondo.setBackground(new Color(255,0,0));
    }

    if(e.getSource() == item2SM2){
      fondo.setBackground(new Color(0,255,0));
    }

  }

  public static void main(String args[]){
    SubMenu formulario = new SubMenu();
    formulario.setBounds(0,0,400,400);
    formulario.setVisible(true);
    formulario.setLocationRelativeTo(null);
  }
}