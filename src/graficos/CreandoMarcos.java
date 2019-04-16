package graficos;
import javax.swing.*;

public class CreandoMarcos{


	 public static void main(String[] args) {

         // JFrame marco1;
	 	 // marco1 = new JFrame();

	 	 miMarco marco1 = new miMarco(); 
	 	 //marco1.setSize(500, 300);

	 	 marco1.setVisible(true);//metodo que hace visible la ventana

	 	 marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//metodo que termina el programa cuando se cierra la ventana
		//se puede usar  HIDE_ON_CLOSE para ocultar la ventana asi cuando se cierra la ventana no se termina la aplicacion
		//por si teniamos mas ventanas abiertas
	}
}

class miMarco extends JFrame{

	 public miMarco(){
         
         //setSize(500, 300); //

         // setLocation(500, 300);

         //con esto agregamos tenemos (x, y, w, z),(x, y)es la posicion, (w, z)es el tamaño
	 	//es mas comodo en vez de usar setSize y setLocation
         setBounds(500, 300, 550, 250);

         //hace que se pueda modificar la dimension de la ventana por el usuario
         setResizable(false);
         
         //Pone un nombre a la ventana
         setTitle("Mi ventana");
          
          //abre la ventana a pantalla completa
         //setExtendedState(JFrame.MAXIMIZED_BOTH);
         //setExtendedState(6);


	}
}