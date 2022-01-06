package _02_nested_loops._3_for_loop_gauntlet;

public class LoopGauntlet {

	public static void main(String[] args) {
		
				/*	  ---- SINGLE FOR LOOPS ----    */

				for(int i=0; i<101; i++) {
					System.out.println(i);
				}
			
				for(int i=100; i>-1; i--) {
					System.out.println(i);
				}
			
				for(int i=0; i<101; i++) {
					if(i%2 == 0) {
						System.out.println(i);
					}
				}
				
				for(int i=0; i<101; i++) {
					if(i%2 == 1) {
						System.out.println(i);
					}
				}
				
				for(int i=1; i<501; i++) {
					if(i%2 == 0) {
						System.out.println(i + " is even");
					}else {
						System.out.println(i + " is odd");
					}
				}
				
				for(int i=7; i<778; i+=7) {
					System.out.println(i);
				}
				
				int year = 2010;
				
				for(int i=0; i<12; i++) {
					System.out.println("In " + year + ", I was " + i + " years old.");
					year++;
				}
				
				/*    ---- NESTED FOR LOOPS ----    */
				
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						System.out.println(i + " " + j);
					}
				}
				
				for(int i=0; i<3; i++) { 
						for(int j=1; j<4; j++) {
							System.out.print((j + 3 * i)+ " ");
					}
					System.out.println();
				}
				
				for(int i=0; i<10; i++) {
					for(int j=1; j<11; j++) {
						System.out.print((j + 10 * i)+ " ");
					}
					System.out.println();
				}
				
				for(int i=0; i<7; i++) {
					for(int j=0; j<i; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
		
	}

}
