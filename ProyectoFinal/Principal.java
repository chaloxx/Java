import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Principal extends JFrame implements ActionListener,ItemListener{
  private JMenuBar barraMenu;
  private JMenu opciones, calcular, acercaDe, selecFondo;
  private JMenuItem roJo, neGro, moRado, nuevo, salir, vacaciones, elCreador;
  private JTextField tNombre, tApellidoP, tApellidoM;
  private JScrollPane scrollRes;  
  private JTextArea textAreaRes;
  private JLabel lImagen, lBienvenido,lUsuario, lDatosTitulos, lNombre, lApellidoP, lApellidoM, lDepto, lAntiguedad, lRes, lCopy;
  private JComboBox comboDepto, comboAntiguedad;
  Font fuente = new Font("Andale Mono",2,18), fuenteCampos = new Font("Andale Mono",2,20), fuenteMensaje = new Font("Andale Mono",1,46);
  Color blanco = new Color(255,255,255),rojo = new Color(255,0,0), morado = new Color(55,42,127), negro = new Color(0,0,0);
  String usuario = "";

  public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    getContentPane().setBackground(rojo);
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Licencia licencia = new Licencia();
    usuario = licencia.nombre;

    barraMenu = new JMenuBar();
    setJMenuBar(barraMenu);

    //Menu opciones
    opciones = new JMenu("Opciones");
    opciones.setForeground(blanco);
    barraMenu.add(opciones);

    selecFondo = new JMenu("Color de fondo");
    opciones.add(selecFondo);

    roJo = new JMenuItem("Rojo");
    roJo.addActionListener(this);
    selecFondo.add(roJo);

    neGro = new JMenuItem("Negro");
    neGro.addActionListener(this);
    selecFondo.add(neGro);

    moRado = new JMenuItem("Morado");
    moRado.addActionListener(this);
    selecFondo.add(moRado);

    nuevo = new JMenuItem("Nuevo");
    nuevo.addActionListener(this);
    opciones.add(nuevo);

    salir = new JMenuItem("Salir");
    salir.addActionListener(this);
    opciones.add(salir);

    //Menu calcular
    calcular = new JMenu("Calcular");
    calcular.setForeground(blanco);
    barraMenu.add(calcular);
    vacaciones = new JMenuItem("Vacaciones");
    vacaciones.addActionListener(this);
    calcular.add(vacaciones);

    //Menu Acerca De
    acercaDe = new JMenu("Acerca De");
    acercaDe.setForeground(blanco);
    barraMenu.add(acercaDe);
    elCreador = new JMenuItem("El Creador");
    elCreador.addActionListener(this);
    acercaDe.add(elCreador);




    ImageIcon image = new ImageIcon(getClass().getResource("images/logo-coca.png"));
    lImagen = new JLabel(image);
    lImagen.setBounds(10,20,250,110);
    add(lImagen);

    lBienvenido = new JLabel("Bienvenido");
    lBienvenido.setBounds(400,65,300,40);
    lBienvenido.setFont(fuenteMensaje);
    lBienvenido.setForeground(blanco);
    add(lBienvenido);

    lUsuario = new JLabel(usuario);
    lUsuario.setBounds(400,110,300,40);
    lUsuario.setFont(fuenteMensaje);
    lUsuario.setForeground(blanco);
    add(lUsuario);


    lDatosTitulos = new JLabel("Datos del trabajador para el cálculo de vacaciones:");
    lDatosTitulos.setBounds(50,180,520,30);
    lDatosTitulos.setFont(new Font("Andale Mono",2,20));
    lDatosTitulos.setForeground(blanco);
    add(lDatosTitulos);

    lNombre = new JLabel("Nombre:");
    lNombre.setBounds(20,250,100,30);
    lNombre.setFont(fuente);
    lNombre.setForeground(blanco);
    add(lNombre);

    tNombre = new JTextField();
    tNombre.setBounds(20,280,150,30);
    tNombre.setFont(fuenteCampos);
    add(tNombre);

    lApellidoP = new JLabel("Apellido Paterno:");
    lApellidoP.setBounds(20,320,180,30);
    lApellidoP.setFont(fuente);
    lApellidoP.setForeground(blanco);
    add(lApellidoP);

    tApellidoP = new JTextField();
    tApellidoP.setBounds(20,350,150,30);
    tApellidoP.setFont(fuenteCampos);
    add(tApellidoP);

    lApellidoM = new JLabel("Apellido Materno:");
    lApellidoM.setBounds(20,400,180,30);
    lApellidoM.setFont(fuente);
    lApellidoM.setForeground(blanco);
    add(lApellidoM);

    tApellidoM = new JTextField();
    tApellidoM.setBounds(20,430,150,30);
    tApellidoM.setFont(fuenteCampos);
    add(tApellidoM);

    lDepto = new JLabel("Departamento:");
    lDepto.setBounds(300,250,150,30);
    lDepto.setFont(fuente);
    lDepto.setForeground(blanco);
    add(lDepto);

    comboDepto = new JComboBox();
    comboDepto.setBounds(300,280,200,30);
    comboDepto.addItem("Atención al cliente");
    comboDepto.addItem("Logística");
    comboDepto.addItem("Gerente");
    add(comboDepto);

    lAntiguedad = new JLabel("Antigüedad:");
    lAntiguedad.setBounds(300,320,150,30);
    lAntiguedad.setFont(fuente);
    lAntiguedad.setForeground(blanco);
    add(lAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(300,350,200,30);
    comboAntiguedad.addItem("1 año");
    comboAntiguedad.addItem("2 a 6 años");
    comboAntiguedad.addItem("7 años o más");
    add(comboAntiguedad);

    lRes = new JLabel("Resultado:");
    lRes.setBounds(300,400,100,30);
    lRes.setFont(fuente);
    lRes.setForeground(blanco);
    add(lRes);

    textAreaRes = new JTextArea();
    textAreaRes.setFont(new Font("Andale Mono",2,18));
    textAreaRes.setForeground(rojo);
    textAreaRes.setText("\n  Aquí se mostrara la correspondiente cantidad\nde días de vacaciones\n");
    textAreaRes.setEditable(false);
    scrollRes = new JScrollPane(textAreaRes);
    scrollRes.setBounds(300,430,400,100);
    add(scrollRes);

    lCopy = new JLabel("©2017 The Coca-Cola Company");
    lCopy.setBounds(250,550,300,30);
    lCopy.setFont(new Font("Andale Mono",1,12));
    lCopy.setForeground(blanco);
    add(lCopy);


    //Agregar color a los items de menu y al fondo
    cambiaColor(rojo);
  }


  public void itemStateChanged(ItemEvent e){

    
  }



  public void actionPerformed(ActionEvent e){

    if(e.getSource() == roJo){
      cambiaColor(rojo);
    }

    if(e.getSource() == neGro){
      cambiaColor(negro);
    }

    if(e.getSource() == moRado){
      cambiaColor(morado);
    }

    if(e.getSource() == elCreador){
      JOptionPane.showMessageDialog(null,"Yo lo hice");
    }

    if(e.getSource() == vacaciones){
      String nombreTrabajador = tNombre.getText().trim();
      String apellidoP = tApellidoP.getText().trim();
      String apellidoM = tApellidoM.getText().trim();
      String depto = comboDepto.getSelectedItem().toString();
      String antiguedad = comboAntiguedad.getSelectedItem().toString();

      if(nombreTrabajador.equals("") || apellidoP.equals("") || apellidoM.equals("")){
        JOptionPane.showMessageDialog(null,"Rellene todos los campos");
      }
      else{
        textAreaRes.setText("A " + nombreTrabajador + " " + apellidoM + " " +
        apellidoP + "\n" + "le corresponden " + cantDiasVacaciones(depto,antiguedad) +
        " días\nde vacaciones.");
      }
    }

    if(e.getSource() == salir){
      Bienvenido ventana = new Bienvenido();
      ventana.setBounds(0,0,350,450);
      ventana.setVisible(true);
      ventana.setResizable(false);
      ventana.setLocationRelativeTo(null);
      this.setVisible(false);
    }

    if(e.getSource() == nuevo){
      tNombre.setText("");
      tApellidoP.setText("");
      tApellidoM.setText("");
      comboDepto.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      textAreaRes.setText("\n  Aquí se mostrara la correspondiente cantidad\nde días de vacaciones\n");
    }

  }

  public void cambiaColor(Color nuevoColor){
    Container contenedor = this.getContentPane();
    contenedor.setBackground(nuevoColor);
    barraMenu.setBackground(nuevoColor);
    opciones.setBackground(nuevoColor);
    selecFondo.setBackground(nuevoColor);
    calcular.setBackground(nuevoColor);
    acercaDe.setBackground(nuevoColor);
    textAreaRes.setForeground(nuevoColor);
    selecFondo.setForeground(nuevoColor);
    roJo.setForeground(nuevoColor);
    neGro.setForeground(nuevoColor);
    moRado.setForeground(nuevoColor);
    nuevo.setForeground(nuevoColor);
    salir.setForeground(nuevoColor);
    vacaciones.setForeground(nuevoColor);
    elCreador.setForeground(nuevoColor);
    tNombre.setForeground(nuevoColor);
    tApellidoP.setForeground(nuevoColor);
    tApellidoM.setForeground(nuevoColor);

  }

  public String cantDiasVacaciones(String depto,String antiguedad){
    if(depto.equals("Atención al cliente")){
      if (antiguedad.equals("1 año")) {return "6";}
      else if(antiguedad.equals("2 a 6 años")){return"14";}
      else{return "20";}
        }
    else if(depto.equals("Logística")){
      if (antiguedad.equals("1 año")) {return "7";}
      else if(antiguedad.equals("2 a 6 años")){return"15";}
      else{return "22";}
    }
    else{
      if (antiguedad.equals("1 año")) {return "10";}
      else if(antiguedad.equals("2 a 6 años")){return"20";}
      else{return "30";}
    }
  }
}