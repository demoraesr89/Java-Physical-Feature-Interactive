import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SplitScreenJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("I am a JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(20,30,300,100);

		//Create a split pane
		JSplitPane myPane = new JSplitPane();
		myPane.setOpaque(true);
		myPane.setDividerLocation(150);

		// make two panels
		JPanel right = new JPanel();
		right.setBackground(new Color(255,0,0));
		JPanel left = new JPanel();
		left.setBackground(new Color(0,255,0));

		// set as left and right in split
		myPane.setRightComponent(right);
		myPane.setLeftComponent(left);
		

		frame.setVisible(true);
		}

	}
