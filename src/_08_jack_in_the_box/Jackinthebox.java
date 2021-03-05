package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Jackinthebox implements ActionListener {
int counter=0;
	public void setup(){
		 JFrame Jfox = new JFrame();
         Jfox.setVisible(true);
         Jfox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JButton Jbear = new JButton("Suprise");
         Jfox.add(Jbear);
         Jfox.pack();
         Jbear.addActionListener(this);
	}

	
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}

	//3. Also play a sound when the jack-in-the-box pops up using this method.
	//(A sample sound homer-woohoo.wav is provided in the default package)
	private void playSound(String soundFile) {
		String path = "src/_08_jack_in_the_box/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}

	public void actionPerformed(ActionEvent arg0 ) {
		// TODO Auto-generated method stub
		counter=counter+1;
		if(counter==5) {
			showPicture("jackInTheBox.png");
		}
	}
}
