package _10_cuteness_tv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
public void run() {
	JFrame bear = new JFrame();
	bear.setVisible(true);
bear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel balloon = new JPanel();
	bear.add(balloon);
	balloon.add(sequioa);
	balloon.add(brutus);
	balloon.add(snoopy);
	sequioa.addActionListener(this);
	brutus.addActionListener(this);
	snoopy.addActionListener(this);
	sequioa.setText("Watch some cute ducks!");
	brutus.setText("Watch a funny frog!");
	snoopy.setText("Watch some floofy unicorns!");
	bear.pack();
}
JButton sequioa = new JButton();

JButton brutus = new JButton();
JButton snoopy = new JButton();
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    

    try {
    if (System.getProperty("os.name").toLowerCase().contains("linux")) {
    if (Runtime.getRuntime().exec(new String[] { 
     "which", "xdg- open" }).getInputStream().read() != -1) {
    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
    }
    } else {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    }      } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==sequioa) {
		showDucks();
		JOptionPane.showMessageDialog(null, "Duck");
	}
	
	if(buttonPressed==brutus) {
		showFrog();
		JOptionPane.showMessageDialog(null,"Froggo");
	}
	if(buttonPressed==snoopy) {
		showFluffyUnicorns();
		JOptionPane.showMessageDialog(null, "a floofy unicorn");
	}
}
}
