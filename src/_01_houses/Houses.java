package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot stormy=new Robot("mini");
	public void run() {
		
		stormy.penDown();
		stormy.setRandomPenColor();
		stormy.setPenWidth(3);
		stormy.setSpeed(40);
		stormy.setX(41);
		stormy.setY(450);
		Random donut=new Random();
		
	for(int i=0; i<10; i++) {
int height=donut.nextInt(3);
if(height==0) {
	drawHouse("small",Color.red);
}
else if(height==1) {
	drawHouse("medium",Color.cyan);
}
else if(height==2) {
	drawHouse("large",Color.DARK_GRAY);
}
	
	}
		
	}
	void drawHouse(int height) {
	
		stormy.setAngle(0);
		stormy.move(height);
		if(height==250) {
		drawFlatRoof();}
		else {
			drawPointyRoof();
		}
		stormy.move(height);
		stormy.setPenColor(0,150,0);
		stormy.setAngle(90);
		stormy.move(50);
		
	}
	void drawHouse(String size,Color color) {
		stormy.setPenColor(color);
		if(size.equals("small")) {
			drawHouse(60);
		}
		if (size.equals("medium")) {
			drawHouse(120);
		}
		if(size.equals("large")) {
			
			drawHouse(250);
		}
		
	}
	void drawFlatRoof(){
		stormy.turn(90);
		stormy.move(40);
		stormy.turn(90);
		
	}
	void drawPointyRoof() {
		stormy.turn(45);
		stormy.move(25);
		stormy.turn(90);
		stormy.move(25);
		stormy.turn(45);
	}
}
