package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		
		SkillPractice skills = new SkillPractice();
			skills.skill1();
			skills.skill2();
			skills.skill3();
			skills.skill4();
			skills.skill5();
	}

	void skill1() {
		String dimeInput = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(dimeInput);
		JOptionPane.showMessageDialog(null, "You have " + (dimes*10) + " cents.");
		
		String hightInput = JOptionPane.showInputDialog("How tall are you in inches?");
		int hight = Integer.parseInt(hightInput);
		if(hight < 36) {
			JOptionPane.showMessageDialog(null, "You need to eat your Wheaties.");
		}
	}
	
	void skill2() {
		for(int i=1; i<31; i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(" ");
	}
	
	void skill3() {
		Random ran = new Random();
		int number1 = ran.nextInt(20);
		System.out.println(number1);
		int number2 = ran.nextInt(10);
		System.out.println(number2);
		
		JOptionPane.showMessageDialog(null, number1 + " - " + number2 + " = " + (number1-number2));
	}
	
	void skill4() {
		String city = JOptionPane.showInputDialog("What city do you live in?");
		if(city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "Nice! I've heard they have a cool zoo there.");
		}else {
			JOptionPane.showMessageDialog(null, "Have you ever tried visiting San Diego?");
		}
		
		int cars = 2;
		if(cars == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
		}else if(cars == 1) {
			JOptionPane.showMessageDialog(null, "Toyota Tundra");
		}else if(cars > 1) {
			JOptionPane.showMessageDialog(null, "All your cars combined have " + (cars*4) + " wheels.");
		}
	}
	
	void skill5() {
		String school = JOptionPane.showInputDialog("What is the name of your school?");
		JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
	}
	
}
