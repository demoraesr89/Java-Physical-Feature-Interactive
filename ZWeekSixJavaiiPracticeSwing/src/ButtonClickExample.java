import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonClickExample extends JFrame implements ActionListener {
			
		   JButton b = new JButton("Click me!"); //classlevel declaration of GUI components on JFrame

		   public ButtonClickExample() //constructor create JFRame
		   {
			   super("Title");				//The super will be here, just fine
			   setSize(500,550);			//no need for JFrame here.
		    b.addActionListener(this);
		    getContentPane().add(b);
		    //pack();
		    setVisible(true);
		    
		     }

		  public void actionPerformed(ActionEvent e)//GUI triggered by user to run this specific function
		   {
		    b.setBackground(Color.CYAN);
		    }

		  public static void main(String[] args) //main method that makes a method call to constructor to start with creation,adding components on JFRAME
		   {
		    new ButtonClickExample();			//you can put this anywhere, the main static.
		    }

		}
