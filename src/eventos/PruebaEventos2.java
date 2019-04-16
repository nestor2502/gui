package eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;/**

public class PruebaEventos2{
     
     public static void main(String[] args) {
     	
     	MarcoBotones2 mimarco = new MarcoBotones2();

     	mimarco.setVisible(true);

     	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }


}

class MarcoBotones2 extends JFrame{


	  public MarcoBotones2(){

	  	   setTitle("Botones y Eventos");

	  	   setBounds(500, 300, 500, 300);

	  	   LaminaBotones2 milamina = new LaminaBotones2();

	  	   add(milamina);
	  }
}

class LaminaBotones2 extends JPanel {


	 JButton botonAzul = new JButton("Azul");
	 JButton botonAmarillo = new JButton("Amarillo");
	 JButton botonRojo = new JButton("Rojo");

	 public LaminaBotones2(){

		  add(botonAzul);
		  add(botonAmarillo);
		  add(botonRojo);

		  ColorFondo amarillo = new ColorFondo(Color.yellow);
		  ColorFondo azul = new ColorFondo(Color.blue);
		  ColorFondo rojo = new ColorFondo(Color.red); 
          //Action es lo mismo que decirle: al hacer click (Objeto evento)
          //botonAzul (Objeto fuente)
          //this (Objeto fuente)
		  botonAzul.addActionListener(amarillo);
		  botonRojo.addActionListener(rojo);
		  botonAmarillo.addActionListener(amarillo);


	}


	private class ColorFondo implements ActionListener{

         private final Color colorDeFondo;

         public ColorFondo (Color c){


         	  colorDeFondo = c;
         }

         public void actionPerformed(ActionEvent e){

         	   setBackGround(colorDeFondo);
         }
    }

    }*/
