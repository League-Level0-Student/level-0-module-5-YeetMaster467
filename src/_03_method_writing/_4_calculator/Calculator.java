package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		int answer = 0;
		// 3) Call the correct method depending on what option the user chooses
		if(task == 0) {
			answer = divide(number1, number2);
		}else if(task == 1) {
			answer = multiply(number1, number2);
		}else if(task == 2) {
			answer = subtract(number1, number2);
		}else if(task == 3) {
			answer = add(number1, number2);
		}
		// 4) Call the result() method and put the answer in a pop-up
		JOptionPane.showMessageDialog(null, result(answer));
		
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	static int add(int x, int y) {
		return x + y;
	}
	
	static int subtract(int x, int y) {
		return x - y;
	}
	
	static int multiply(int x, int y) {
		return x * y;
	}
	
	static int divide(int x, int y) {
		return x / y;
	}
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	 static String result(int x) {
		return "Your answer is " + x + ".";
	 }
	
}
