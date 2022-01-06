package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;

public class ObedientRobot {

	static Robot rob = new Robot("mini");
	static String color = JOptionPane.showInputDialog("What color do you want? Red, green, or blue.");
	
	public static void main(String[] args) {
		
		rob.show();
		
	}
	
	static void drawSquare() {
		
	}

}
