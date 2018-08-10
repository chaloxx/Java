import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;



public class Licencia extends JFrame implements ActionListener,ChangeListener{
  static final int altura = 480, ancho = 768;
  private JCheckBox check;
  private JButton continuar, noAceptar;
  private JLabel label1, label2;
  private JTextArea textArea;
  private JScrollPane scroll;
  public static String nombre = "";


  public static String center(){
    String centrado = "";
    for(int i = 0; i < 100; i++){
      centrado += " ";
    }
    return centrado;
  }
  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenido ventana = new Bienvenido();
    nombre = ventana.texto;

    continuar = new JButton("Continuar");
    continuar.setBounds(50,altura-75,110,30);
    continuar.setEnabled(false);
    add(continuar);

    continuar.addActionListener(this);

    noAceptar = new JButton("No Acepto");
    noAceptar.setBounds(180,altura-75,110,30);
    add(noAceptar);
    noAceptar.addActionListener(this);

    label1 = new JLabel("Términos y condiciones");
    label1.setBounds((ancho/2)-100,10,200,30);
    label1.setFont(new Font("Andale Mono",1,14));
    add(label1);



    check = new JCheckBox("Yo " + nombre + " eh leído y acepto los términos y condiciones");
    check.setBounds(50,altura-115,400,30);
    check.addChangeListener(this);
    add(check);

    textArea = new JTextArea();
    textArea.setFont(new Font("Andale Mono",0,10));
    textArea.setText(center() + "Bases y condiciones");
    textArea.setEditable(false);
    scroll = new JScrollPane(textArea);
    scroll.setBounds(10,50,ancho-20,altura-200);
    add(scroll);

    ImageIcon image = new ImageIcon(getClass().getResource("images/coca-cola.png"));
    label2 = new JLabel(image);
    label2.setBounds(450,altura-130,300,100);
    add(label2);

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == continuar){
      Principal principal = new Principal();
      principal.setBounds(0,0,800,630);
      principal.setVisible(true);
      principal.setResizable(false);
      principal.setLocationRelativeTo(null);
      this.setVisible(false);
    }

    if(e.getSource() == noAceptar){
      Bienvenido ventana = new Bienvenido();
      ventana.setBounds(0,0,350,450);
      ventana.setVisible(true);
      ventana.setResizable(false);
      ventana.setLocationRelativeTo(null);
      this.setVisible(false);
    }


  }

  public void stateChanged(ChangeEvent e){
    if(check.isSelected() == true){
      continuar.setEnabled(true);
      noAceptar.setEnabled(false);
    }
    else{
      continuar.setEnabled(false );
      noAceptar.setEnabled(true);
    }

  }
}