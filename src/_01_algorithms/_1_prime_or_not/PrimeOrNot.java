package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		String numberString = JOptionPane.showInputDialog("Enter a number.");
		int number = Integer.parseInt(numberString);
		
		boolean isPrime = true;
		
		for(int i=2; i<number/2; i++) {
			
			if(number % i == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		if(isPrime) {
			JOptionPane.showMessageDialog(null, "Your number is prime.");
		}else {
			JOptionPane.showMessageDialog(null, "Your number is composite.");
		}
		
	}

}
