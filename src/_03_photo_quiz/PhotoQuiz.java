package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String bear = "https://www.vhv.rs/dpng/d/453-4530790_honey-kawaii-cute-bear-brown-sweet-freetoedit-kawaii.png";
		// 2. create a variable of type "Component" that will hold your image
Component image;
		// 3. use the "createImage()" method below to initialize your Component
image=createImage(bear);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String honey=JOptionPane.showInputDialog("Does bear like honey?");
		// 7. print "CORRECT" if the user gave the right answer
if(honey.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "Correct! bear is happy");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "try again next time!");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
String pusheenAndFriends= "https://pusheen.com/wp-content/uploads/2020/04/How-well-do-you-know-Pusheen-and-co-12.jpg";
Component image2;
image2=createImage(pusheenAndFriends);
quizWindow.add(image2);
		// 11. add the second image to the quiz window

		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String bo = JOptionPane.showInputDialog(null,"who's the bird on sloth's hand?");
		// 14+ check answer, say if correct or incorrect, etc.
if(bo.equalsIgnoreCase("bo")) {
	JOptionPane.showMessageDialog(null,"correct!");
}
else {
	JOptionPane.showMessageDialog(null, "try again next time!");
}
String bordercollie = "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/12235957/Border-Collie-On-White-01.jpg";
Component image3;
image3=createImage("bordercollie");
quizWindow.add(image3);
quizWindow.pack();
String dogBreed = JOptionPane.showInputDialog(dogBreed);
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
