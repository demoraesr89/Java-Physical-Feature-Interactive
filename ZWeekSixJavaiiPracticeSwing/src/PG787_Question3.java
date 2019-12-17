import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public abstract class PG787_Question3 extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final JFrame f = new JFrame("My favorite type of foods to eat!");
		f.setSize(new Dimension(500,200));	
		
		f.setLocation(500, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel p = new JPanel();
        JLabel l = new JLabel ("I like Cotton Candy");
        JLabel l1 = new JLabel ("My favorite fruit are Apples");
        JLabel l2 = new JLabel ("I like to eat Chocolate");
        JLabel l3 = new JLabel ("I enjoy eatting sweets");
        JLabel l4 = new JLabel ("I haven't slept with in 48hours!");
        JButton b = new JButton("Fun Facts instead of Historical Events");
        b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(f.getComponent(0),l);
				JOptionPane.showMessageDialog(f.getComponent(0),l1);
				JOptionPane.showMessageDialog(f.getComponent(0),l2);
				JOptionPane.showMessageDialog(f.getComponent(0),l3);
				JOptionPane.showMessageDialog(f.getComponent(0),l4);
			}
        	});
        
        f.add(p);
        p.add(b);

        	f.setVisible(true);
}
}