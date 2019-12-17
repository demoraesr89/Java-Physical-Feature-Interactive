import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class PG786_Question1B {

    public static void main(String[] args) {

        final JFrame f = new JFrame("A world with magic cannot exsist?");
		f.setSize(new Dimension(500,200));		
		f.setLocation(500, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel p = new JPanel();
        JLabel label = new JLabel ("Mahoujou Magica: Madoka");
        JLabel label2 = new JLabel ("Your Wish will become your greatest enemy");

        JButton b = new JButton("Movie Quote");

        f.add(p);
        p.add(label2);
        p.add(b);
        f.setVisible(true);

        b.addActionListener(new ActionListener() 
        {

            public void actionPerformed(ActionEvent arg0) 
            {
              JOptionPane.showMessageDialog(f.getComponent(0), "Mahajou Magica: Madoka");
            }
        });

    }

}