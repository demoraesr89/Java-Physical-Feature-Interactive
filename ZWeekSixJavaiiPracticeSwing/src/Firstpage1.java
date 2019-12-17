import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Firstpage1 extends JFrame
{
JTextField usertext;
JPasswordField passtext;			//it keeps it secret (mask)
JLabel user;
JLabel pass;
Firstpage1(){				//complier will read it from here
	
	     user=new JLabel("Username ");
	     pass=new JLabel("Password ");
         usertext=new JTextField(20);			//the 20 is the size/characters
         passtext=new JPasswordField(20);
        
         			//10,10=0,0 moniter, 100 wd, 20 is hrt.
        user.setBounds(10,10,100,20);
        usertext.setBounds(80,10,100,20);
       
        pass.setBounds(220,10,150,20);
        passtext.setBounds(300,10,150,20);
        
        	add(user);
        	add(usertext);
        	add(pass);
        	add(passtext);
        	setLayout(null);
        
         JButton b=new JButton("Send");
         b.setBounds(120,40,80,20);
         add(b);
         setPreferredSize(new Dimension(500,110));
         
         pack();
         setVisible(true);

         b.addActionListener(new ActionListener()
         {
        	 public void actionPerformed(ActionEvent e)
         {
        		 //int userid = lname.gettext();
        		 String uservalue=usertext.getText();				//get the get for text
        		 String passvalue= new String (passtext.getPassword());			//get the password
        		 Secondpage1 page3 = new Secondpage1 (uservalue, passvalue);		//will pick up the constrictor
        		 	if (uservalue.equals("admin") && passvalue.equals("pass"))
        		 		page3.setVisible(true);											//

        		 	else {
        		 		JOptionPane.showMessageDialog(null, "Incorrect Username or Password!");
        		 		page3.setVisible(false);
        		 	}}
         });
	}

public static void main(String[]args)
{
new Firstpage1();				//this where it starts
}
}
