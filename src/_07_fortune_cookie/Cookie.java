package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cookie implements ActionListener {
	
        public void showButton() {
            JFrame Jfox = new JFrame();
            Jfox.setVisible(true);
            Jfox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton Jbear = new JButton("tap for a forutne");
            Jfox.add(Jbear);
            Jfox.pack();
            Jbear.addActionListener(this);
       }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null,"woohoo");
			   int rand = new Random().nextInt(5);
			   if(rand==0) {
				   JOptionPane.showMessageDialog(null,"You will find a cool treasure or something");
			   }
			   if(rand==1) {
				   JOptionPane.showMessageDialog(null,"You'll be very lucky and coinsidental this week but next week you are never lucky");
			   }
			   if(rand==2) {
				   JOptionPane.showMessageDialog(null,"You will do something that gets in the news");
			   }
			   if(rand==3) {
				   JOptionPane.showMessageDialog(null, "You'll find a four leaf clover while playing in the fields");
			   }
			   if(rand==4) {
				   JOptionPane.showMessageDialog(null, "You will find a dollar bill in your book ");
			   }
		}
		   
    }


