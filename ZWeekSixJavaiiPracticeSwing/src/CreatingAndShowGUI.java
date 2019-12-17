import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;				//adding sizes
import javax.swing.*;

public class CreatingAndShowGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//create and set up the window
			JFrame frame = new JFrame("Hi..");
			
			frame.setSize(new Dimension(300,200));		//adding the sizes
			frame.setLocation(500, 250);
			
			JPanel p = new JPanel();								//adding JPanel
			JButton b = new JButton("Press me!");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
			//Add a label.
			JLabel label = new JLabel("Hello World!");
			JLabel label1 = new JLabel("How are you today?");
			JLabel label2 = new JLabel("Domo!");
			
			p.add(label);													//frame>panel>components>listenig
			p.add(label1);
			p.add(label2);
			p.add(b);
	//frame.getContentPane().add(label);        //another type of GET
			
			frame.setContentPane(p);
			//Display the Window.
										//when you add PACK do not put 
			//frame.pack();													//if you are adding, you go backwards listening>comp>panel>frame
			frame.setVisible(true); 	//frame.show();		
	}

}
