import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CelciusConverter1  implements ActionListener{

  JFrame converterFrame = new JFrame("Convert Celsius to      Fahrenheit");
  JPanel converterPanel = new JPanel();
  //converterPanel.setLayout(new GridLayout(2, 2));
  
 JTextField tempCelsius = new JTextField(2);
 JLabel celsiusLabel = new JLabel("Celsius",      SwingConstants.LEFT);
 JButton convertTemp = new JButton("Convert...");
  JLabel fahrenheitLabel = new JLabel("Fahrenheit",      SwingConstants.LEFT);
		
  public CelciusConverter1() {

      	converterPanel.setLayout(new GridLayout(2, 2));
		    convertTemp.addActionListener(this);
		    converterPanel.add(tempCelsius);
		    converterPanel.add(celsiusLabel);
		    converterPanel.add(convertTemp);
		    converterPanel.add(fahrenheitLabel);
		    converterFrame.getContentPane().add(converterPanel,BorderLayout.CENTER);
		    converterFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		    converterFrame.pack();
		    converterFrame.setVisible(true);
		  }

		public void actionPerformed(ActionEvent event) {
		    int tempFahr = (int) ((Integer.parseInt(tempCelsius.getText()) * 1.8 + 32));
		    fahrenheitLabel.setText(tempFahr + " Fahrenheit");
		  }

		public static void main(String[] args) 
		{
			CelciusConverter1 g=new CelciusConverter1();
			
		  }
		} 