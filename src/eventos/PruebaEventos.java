package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos{
     
     public static void main(String[] args) {
     	
     	MarcoBotones mimarco = new MarcoBotones();

     	mimarco.setVisible(true);

     	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }


}

class MarcoBotones extends JFrame{


	  public MarcoBotones(){

	  	   setTitle("Botones y Eventos");

	  	   setBounds(500, 300, 500, 300);

	  	   LaminaBotones milamina = new LaminaBotones();

	  	   add(milamina);
	  }
}

class LaminaBotones extends JPanel implements ActionListener{


	 JButton botonAzul = new JButton("Azul");
	 JButton botonAmarillo = new JButton("Amarillo");
	 JButton botonRojo = new JButton("Rojo");

	 public LaminaBotones(){

		  add(botonAzul);
		  add(botonAmarillo);
		  add(botonRojo);
          //Action es lo mismo que decirle: al hacer click (Objeto evento)
          //botonAzul (Objeto fuente)
          //this (Objeto fuente)
		  botonAzul.addActionListener(this);
		  botonRojo.addActionListener(this);
		  botonAmarillo.addActionListener(this);
	}

    @Override
	public void actionPerformed(ActionEvent e){
         //capturar el origen del evento
		 Object botonPulsado = e.getSource();//e es el objeto evento 

		 if(botonPulsado == botonAzul)
		 setBackground(Color.blue);

		 else if(botonPulsado == botonAmarillo)
		 setBackground(Color.yellow);

		 else
		 setBackground(Color.red);
	}
} 