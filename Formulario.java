import javax.swing.*;


public class Formulario extends JFrame{
		private JLabel label1;
		
		public Formulario(){
			setLayout(null);//Vamos a indicar donde crear el formulario
			label1 = new  JLabel("Algo");
			label1.setBounds(10,20,200,300);
			add(label1);
		}
		
		public static void main(String args[]){
			Formulario formulario = new Formulario();
			formulario.setBounds(0,0,400,300);
			formulario.setVisible(true);
			formulario.setLocationRelativeTo(null);
			}
}
