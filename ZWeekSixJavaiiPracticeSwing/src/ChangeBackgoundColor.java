import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeBackgoundColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("I am a JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(20,30,300,100);
		frame.setLayout(null);
		//Create a panel 
		JPanel myPanel = new JPanel();
		myPanel.setBackground(new Color(255,3,25));
		myPanel.setOpaque(true); 
		//The tooltip appears on the mouse cursor when held over it for a second or 2. Useful to tell users what a button will do before they click it. 
		myPanel.setOpaque(true); 
		myPanel.setToolTipText("I'm a JPanel");
		myPanel.setBorder(BorderFactory.createLineBorder(Color.white));
		//Make it the content pane.
		frame.setContentPane(myPanel);
		frame.setVisible(true);
	}
}
