package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado{


      public static void main(String[] args) {
      
      MarcoCentrado mimarco = new MarcoCentrado();

      mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      mimarco.setVisible(true);

     }
}

class MarcoCentrado extends JFrame{


	 public MarcoCentrado(){
          //Alamcena mi sistema nativo de pantallas
	  	 Toolkit mipantalla = Toolkit.getDefaultToolkit();

	  	 //para saber el tamaño de la pantalla
         //En esta clase dimension almacene la resolucion de mi pantalla
	  	 Dimension tamanoPantalla = mipantalla.getScreenSize();
         //height y width son variables de la clase Dimension
	  	 int alturaPantalla = tamanoPantalla.height;
	  	 int anchoPantalla = tamanoPantalla.width;


	  	 setSize(anchoPantalla/2, alturaPantalla/2);
	  	 setLocation(anchoPantalla/4, alturaPantalla/4);
	  	 setTitle("Marco centrado");




	  }
}