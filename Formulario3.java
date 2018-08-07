import javax.swing.*;
import java.awt.event.*;


public class Formulario3 extends JFrame implements ActionListener{
	JButton boton1;
	public Formulario3(){
		setLayout(null);//Le damos las coordenadas
		boton1 = new JButton("Cerrar");
		boton1.setBounds(300,200,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			System.exit(0);
		}
	}
	
	public static void main(String args[]){
		Formulario3 formulario = new Formulario3();
		formulario.setBounds(0,0,450,350);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
			
}

