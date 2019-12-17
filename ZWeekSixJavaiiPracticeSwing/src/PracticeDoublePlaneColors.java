import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class PracticeDoublePlaneColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("Choose your Color");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setBounds(20,30,300,100);
		//f.setLayout(null);
		f.setSize(new Dimension(500,250));		//adding the sizes
		f.setLocation(500, 200);
		
		JPanel p = new JPanel();
		//BorderLayout bl = new BorderLayout();
		
		JButton b = new JButton("Red");
		b.setPreferredSize(new Dimension (60,60));

		JButton b1 = new JButton("Blue");
		b1.setPreferredSize(new Dimension (60,60));
		
		JButton b2 = new JButton("Green");
		b2.setPreferredSize(new Dimension (80,50));
		
			
		JSplitPane myPanel = new JSplitPane();
		myPanel.setOpaque(true); 
		myPanel.setDividerLocation(110);
		
		JPanel right = new JPanel();
		right.setBackground(new Color(0,0,255));
		JPanel left = new JPanel();
		left.add(b);
		left.add(b1);									//when you are adding stuff, make sure it goes in the location.
		left.add(b2);
		left.setBackground(new Color(0,255,0));
		
		myPanel.setRightComponent(right);
		myPanel.setLeftComponent(left);

		
		myPanel.setOpaque(true); 
		myPanel.setToolTipText("Smile!");
		myPanel.setBorder(BorderFactory.createLineBorder(Color.white));

		
		f.setContentPane(myPanel);
		
		f.setVisible(true);
	}

}
