import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PracticeSwingApplication extends JFrame implements ActionListener
	 {
	  private static String labelPrefix = "Number of 	button clicks: ";
	  private int numClicks = 0;
	  JLabel label = new JLabel(labelPrefix + "0    ");

	  public PracticeSwingApplication(String title) //the viable is title & If you dont want to send it as a parameter, leave it blank like ()
	{
	    super(title);		//the title is here
		setSize(200,150);
	    JButton button = new JButton("I'm a Swing button!");
	    button.addActionListener(this);
	    JPanel panel = new JPanel();
	    panel.add(button);
	    panel.add(label);
	    getContentPane().add(panel);
	    //pack();
	    setVisible(true);
	  }

	  public void actionPerformed(ActionEvent e) //e=dynamic object
	     {
	        label.setText(labelPrefix + numClicks++);
	      }
	    
	    
	  public static void main(String[] args) {
	    new PracticeSwingApplication("SwingApplication"); //If you are making a parameter take out the center
	 }
	}
