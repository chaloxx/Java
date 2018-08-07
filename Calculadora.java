import javax.swing.*;
import java.awt.event.*;






public class Calculadora extends JFrame implements ActionListener{
  private JTextField valor1, valor2;
  private JButton sumar, restar, multiplicar, dividir;
  private JLabel resText;
  String texto = "",valText1 = "", valText2 = "";
  float valNum1 = 0, valNum2 = 0, resNum = 0;

  public Calculadora(){
    setLayout(null);
    valor1 = new JTextField();
    valor1.setBounds(10,10,100,30);
    add(valor1);

    valor2 = new JTextField();
    valor2.setBounds(10,110,100,30);
    add(valor2);

    resText = new JLabel("=");
    resText.setBounds(10,310,500,20);
    add(resText);



    sumar = new JButton("+");
    sumar.setBounds(10,210,50,30);
    add(sumar);
    sumar.addActionListener(this);


    restar = new JButton("-");
    restar.setBounds(110,210,50,30);
    add(restar);
    restar.addActionListener(this);

    multiplicar = new JButton("*");
    multiplicar.setBounds(210,210,50,30);
    add(multiplicar);
    multiplicar.addActionListener(this);

    dividir = new JButton("/");
    dividir.setBounds(310,210,50,30);
    add(dividir);
    dividir.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
        if(e.getSource() == sumar){
          try{
            valText1 = valor1.getText();
            valText2 = valor2.getText();
            resNum = Float.parseFloat(valText1) + Float.parseFloat(valText2);
            resText.setText("= " + Float.toString(resNum));            
          } 
          catch(NumberFormatException exception){
            resText.setText("Valores inválidos");
          }
          valor1.setText("");
          valor2.setText("");
        }

        if(e.getSource() == restar){
          try{
            valText1 = valor1.getText();
            valText2 = valor2.getText();
            resNum = Float.parseFloat(valText1) - Float.parseFloat(valText2);
            resText.setText("= " + Float.toString(resNum));            
          } 
          catch(NumberFormatException exception){
            resText.setText("Valores inválidos");
          }
          valor1.setText("");
          valor2.setText("");
        }

        if(e.getSource() == multiplicar){
          try{
            valText1 = valor1.getText();
            valText2 = valor2.getText();
            resNum = Float.parseFloat(valText1) * Float.parseFloat(valText2);
            resText.setText("= " + Float.toString(resNum));            
          } 
          catch(NumberFormatException exception){
            resText.setText("Valores inválidos");
          }
          valor1.setText("");
          valor2.setText("");
        }

        if(e.getSource() == dividir){
          try{
            valText1 = valor1.getText();
            valText2 = valor2.getText();
            if(Float.parseFloat(valText2) == 0){
            resText.setText("No se puede dividir por 0!");
            }
            else{
              resNum = Float.parseFloat(valText1) / Float.parseFloat(valText2);
              resText.setText("= " + Float.toString(resNum));              
            }
          } 
          catch(NumberFormatException exception){
            resText.setText("Valores inválidos");
          }
          valor1.setText("");
          valor2.setText("");
        }
        
    }


  public static void main(String args[]){
    Calculadora calculadora = new Calculadora();
    calculadora.setBounds(0,0,400,400);
    calculadora.setVisible(true);
    calculadora.setResizable(false);
    calculadora.setLocationRelativeTo(null);
  }
}