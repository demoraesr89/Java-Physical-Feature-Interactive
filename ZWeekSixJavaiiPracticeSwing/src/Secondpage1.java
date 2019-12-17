import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Secondpage1 extends JFrame
{
	Secondpage1(String usertext,String passtext)	//getting the information from the first page. ex: int userid, string lname
{
		
		setLayout(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		setTitle("Welcome");
		
		JLabel lab=new JLabel("Welcome  "+usertext);
		
		lab.setBounds(10,10,500,20);
		add(lab);
		
		setSize(300,100);
} //method call ends
}
