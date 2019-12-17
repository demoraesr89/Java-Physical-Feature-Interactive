import javax.swing.*;
import java.awt.*;
public class PracticeJavaLabelFont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int Frame_Width = 250;
		final int Frame_Height = 100;
		Font headlineFont = new Font ("Arial", Font.BOLD, 36);
		Font f1 = new Font("Arial", Font.ITALIC, 15);
		
		JFrame aFrame = new JFrame ("Fourth frame");
		
		aFrame.setSize(Frame_Width, Frame_Height);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel morning = new JLabel ("Good morning!");
		morning.setFont(f1);
		aFrame.add(morning);

		JLabel greeting = new JLabel ("Good day");
		greeting.setFont(headlineFont);		
		aFrame.add(greeting);
		
	}

}
