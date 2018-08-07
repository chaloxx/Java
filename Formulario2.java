import javax.swing.*;


public class Formulario2 extends JFrame{
        private JLabel label1;
        private JLabel label2;
        
        public Formulario2(){
			    setLayout(null);
          label1 = new JLabel("Pepe");  
          label1.setBounds(30, 50, 200,200);
          add(label1);
          label2 = new JLabel("Pepito");
          label2.setBounds(100, 50, 200,500);
          add(label2);
        }
        
      public static void main(String args[]){
  			Formulario2 formulario = new Formulario2();
  			formulario.setBounds(0,0,400,400);
  			formulario.setVisible(true);
  			formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
			
		}
    
    
}
