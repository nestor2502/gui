package graficos;
import javax.swing.*;

public class CreandoMarcos{


	 public static void main(String[] args) {

	 	miMarco marco1 = new miMarco();

	 	marco1.setVisible(true);//metodo que hace visible la ventana

	 	marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//metodo que termina el programa cuando se cierra la ventana
		
	}
}

class miMarco extends JFrame{

	 public miMarco(){
         
         setSize(500, 300);
         

	}
}