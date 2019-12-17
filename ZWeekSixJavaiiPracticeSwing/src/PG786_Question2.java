import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class PG786_Question2 extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final JFrame f = new JFrame("On or Off");
		f.setSize(new Dimension(500,200));	
		
		f.setLocation(500, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel p = new JPanel();
        JLabel label = new JLabel ();
        JButton b = new JButton("Option1");
        f.add(p);
        p.add(b);
        JButton b1 = new JButton("Option2");
        b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
					b.setEnabled(false);
					b1.setEnabled(true);					
			}
	});
        

        p.add(b1);
        b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				b1.setEnabled(false);
				b.setEnabled(true);
			} 
    });

        	f.setVisible(true);
}
}