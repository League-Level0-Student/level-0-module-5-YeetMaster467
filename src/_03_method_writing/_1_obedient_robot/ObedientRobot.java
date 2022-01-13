package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

import javax.swing.JOptionPane;

public class ObedientRobot {

	static Robot rob = new Robot("mini");
	static String color = JOptionPane.showInputDialog("What color do you want? Red, green, or blue.");
	static String shape = JOptionPane.showInputDialog("What shape do you want? Square, circle, or triangle.");
	
	public static void main(String[] args) {
		
		if(shape.equalsIgnoreCase("square")) {
			drawSquare();
		}else if(shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}else if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}else {
			JOptionPane.showMessageDialog(null, "That is not an avalible shape.");
		}
		
		rob.hide();
		
	}
	
	static void drawSquare() {
		
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}else {
			rob.setRandomPenColor();
		}
		
		rob.penDown();
		rob.setSpeed(10);
		for(int i=0; i<4; i++) {
			rob.turn(90);
			rob.move(100);
		}
		
	}
	
	static void drawTriangle() {

		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}else {
			rob.setRandomPenColor();
		}
		
		rob.penDown();
		rob.setSpeed(10);
		for(int i=0; i<3; i++) {
			rob.turn(120);
			rob.move(100);
		}
		
		
	}
	
	static void drawCircle() {

		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}else if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.green);
		}else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}else {
			rob.setRandomPenColor();
		}
		
		rob.penDown();
		rob.setSpeed(100);
		for(int i=0; i<360; i++) {
			rob.turn(1);
			rob.move(1);
		}
		
	}
}
