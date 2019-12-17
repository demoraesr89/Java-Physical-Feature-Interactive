import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MultipleSwingCodeFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			JFrame f = new JFrame ("Alexander Tabard of Casting");
			
			f.setSize(new Dimension(200,200));		//adding the sizes (SIZE IS SUPER IMPORTANT)
			f.setLocation(500, 250);
			
			Container contentPane = f.getContentPane();
			
			JPanel p = new JPanel ();
			JPanel p2 = new JPanel ();
			FlowLayout L = new FlowLayout();
			BorderLayout bl = new BorderLayout();
			JButton b1 = new JButton("Need");
			JButton b2 = new JButton("Pass");
			JTextArea a1= new JTextArea("Weekly Lock out restricted");
			
			p.setLayout(L);
			p2.setLayout(bl);
			p.add(b1);
			p.add(b2);
			
			p.add(p2);
			contentPane.add(a1, BorderLayout.SOUTH);
			p2.add(a1);

			
			f.setContentPane(p);
			
			f.setVisible(true);
	}

}
