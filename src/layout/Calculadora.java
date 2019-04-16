package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Calculadora{


	  public static void main(String[] args) {

	  	MarcoCalculadora mimarco = new MarcoCalculadora();

	  	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  	mimarco.setVisible(true);
	  	


	  }
}

class MarcoCalculadora extends JFrame{

	  public MarcoCalculadora(){

	  	 setTitle("Calculadora");
	  	 //setBounds(500, 300, 450, 300);
	  	 LaminaCalculadora milamina = new LaminaCalculadora();
	  	 add(milamina);
	  	 //Le indicamos que se adapte a los componentes que hay en su interior
	  	 pack();
	  }

}

class LaminaCalculadora extends JPanel{
      
     private JPanel milamina2;
     private JButton pantalla;
     private boolean principio;
     private double resultado;
     private String ultimaOperacion;

     public LaminaCalculadora(){

     	  principio = true;

      	  setLayout(new BorderLayout());

      	  pantalla = new JButton("0");

          //desactiva el boton
      	  pantalla.setEnabled(false);

      	  add(pantalla, BorderLayout.NORTH);
          
          milamina2 = new JPanel();

      	  milamina2.setLayout(new GridLayout(4,4));

      	  //para agregar botones
          // JButton boton1 = new JButton("1");
      	  // milamina2.add(boton1);
      	  ActionListener insertar = new InsertaNumero();
      	  ActionListener orden = new Accionorden();

      	  ponerBoton("7", insertar);
      	  ponerBoton("8", insertar);
      	  ponerBoton("9", insertar);
      	  ponerBoton("/", orden);
      	  ponerBoton("4", insertar);
      	  ponerBoton("5", insertar);
      	  ponerBoton("6", insertar);
      	  ponerBoton("*", orden);
      	  ponerBoton("1", insertar);
      	  ponerBoton("2", insertar);
      	  ponerBoton("3", insertar);
      	  ponerBoton("-", orden);
      	  ponerBoton("0", insertar);
      	  ponerBoton(".", insertar);
      	  ponerBoton("=", orden);
      	  ponerBoton("+", orden);

      	  add(milamina2, BorderLayout.CENTER);

      	  ultimaOperacion= "=";
      } 


      private void ponerBoton(String rotulo, ActionListener oyente){

      	   JButton boton = new JButton(rotulo);
      	   boton.addActionListener(oyente);
      	   milamina2.add(boton);

      }

      private class InsertaNumero implements ActionListener{

      	 @Override
      	 public void actionPerformed(ActionEvent e){
            //lee el texto del boton que es un String
      	 	String entrada= e.getActionCommand();

      	 	if(principio==true){
      	 		pantalla.setText("");
      	 		principio=false;
      	 	}


      	 	pantalla.setText(pantalla.getText()+entrada);
      	 }

      }


     private class Accionorden implements ActionListener{

     	 @Override
     	 public void actionPerformed(ActionEvent e){
     	 	 //almacenar un string que corresponde al texto del boton
             String operacion = e.getActionCommand();
             //System.out.println(operacion);
             calcular((Double.parseDouble(pantalla.getText())));
             ultimaOperacion = operacion;
     		 principio =true;
     	}

     	public void calcular(double x){

              if(ultimaOperacion.equals("+")){

              	 resultado+=x;

              }
              else if(ultimaOperacion.equals("-")){

              	 resultado -=x;
              }
              else if(ultimaOperacion.equals("*")){

              	 resultado *=x;
              }
              else if(ultimaOperacion.equals("/")){

              	 resultado /=x;
              }

              else if(ultimaOperacion.equals("=")){

              	  resultado = x;


              }

              pantalla.setText(""+resultado);


     	}
     }




}