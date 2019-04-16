package layout;

import java.awt.*;
import javax.swing.*;

public class Layouts1{
     
     public static void main(String[] args) {
     	
     	Marco_Layout marco = new Marco_Layout();

     	marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     	marco.setVisible(true);
     }


}

class Marco_Layout extends JFrame{


	  public Marco_Layout(){

	  	  setTitle("Prueba acciones");

	  	  setBounds(600, 350, 600, 300);

	  	  Panel_Layout lamina = new Panel_Layout();
	  	  Panel_Layout2 lamina2 = new Panel_Layout2();

	  	  //FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);

	  	  //lamina.setLayout(disposicion);
          
          //lamina.setLayout(new FlowLayout(FlowLayout.CENTER, 75, 100));
	  	  add(lamina, BorderLayout.NORTH);

	  	  add(lamina2, BorderLayout.SOUTH);

	  }
}

class Panel_Layout extends JPanel{

	 public Panel_Layout(){

	 	  setLayout(new FlowLayout(FlowLayout.CENTER));
	 	  //setLayout(new BorderLayout(10, 10));
          add(new JButton("Amarillo"));
          add(new JButton("Rojo"));
          
     }

}


class Panel_Layout2 extends JPanel{

	 public Panel_Layout2(){
          
          setLayout(new BorderLayout());
          add(new JButton("Azul"), BorderLayout.WEST);
          add(new JButton("Verde"), BorderLayout.EAST);
          add(new JButton("Negro"), BorderLayout.CENTER);
 

	 }
}