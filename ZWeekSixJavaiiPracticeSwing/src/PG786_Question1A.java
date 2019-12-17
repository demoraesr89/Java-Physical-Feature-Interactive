import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PG786_Question1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame ("What if you had a power to change the world?");
		f.setSize(new Dimension(500,200));		
		f.setLocation(500, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JLabel l = new JLabel("Mohou Jou: Madoka");
		
		f.add(p);
		p.add(l);
		
		//f.pack();
		f.setContentPane(p);
		f.setVisible(true);
	}

}
