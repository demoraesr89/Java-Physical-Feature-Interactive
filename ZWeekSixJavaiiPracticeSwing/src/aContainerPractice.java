import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSlider;

public class aContainerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			JFrame frame = new JFrame ("Test Frame");
			frame.setSize(new Dimension(500,400));
			frame.setLocation(500, 500);
			Container contentPane = frame.getContentPane();
			JLabel label = new JLabel ("Here is the Label");
			contentPane.add(label, BorderLayout.NORTH);
			JButton button = new JButton("BUTTON");
			contentPane.add(button, BorderLayout.SOUTH);
			String[] options = {"Option 1", "Option 2", "Option 3"};
			JList List = new JList (options);
			contentPane.add(List, BorderLayout.CENTER);
			
			JCheckBox cbox = new JCheckBox("Check");
			contentPane.add(cbox, BorderLayout.WEST);
			
			JSlider slider = new JSlider();
			contentPane.add(slider, BorderLayout.EAST);
			
			frame.setVisible(true);
			

	}

}
