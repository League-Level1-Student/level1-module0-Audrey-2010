package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class SoundEffectMachine implements ActionListener {
	public Object run;
	JButton Jbear = new JButton();
	JButton Jbadger = new JButton();
public void setup() {
	JFrame Jferret = new JFrame();
	Jferret.setVisible(true);
	Jferret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel Jparakeet = new JPanel();
	Jferret.add(Jparakeet);
	Jbear.setText("Bear");
	Jparakeet.add(Jbear);
	Jparakeet.add(Jbadger);
	Jbadger.setText("Badger");
	Jbear.addActionListener(this);
	JButton Jbadger = new JButton();
	Jbadger.addActionListener(this);
Jferret.pack();
}
private void playSound(String soundFile) {
	String path = "src/_09_sound_effects_machine/";
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


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==Jbear) {
		playSound(null);
		JOptionPane.showMessageDialog(null, "Bear!");
	}
	if(buttonPressed==Jbadger) {
		playSound(null);
		JOptionPane.showMessageDialog(null,"Badger");
	}
}

}
