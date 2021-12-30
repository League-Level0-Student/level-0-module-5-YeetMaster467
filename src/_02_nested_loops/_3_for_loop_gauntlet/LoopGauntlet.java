package _02_nested_loops._3_for_loop_gauntlet;

public class LoopGauntlet {

	public static void main(String[] args) {
		
				/*	  ---- SINGLE FOR LOOPS ----    */

				for(int a=0; a<101; a++) {
					System.out.println(a);
				}
			
				for(int b=100; b>-1; b--) {
					System.out.println(b);
				}
			
				for(int c=0; c<101; c++) {
					if(c%2 == 0) {
						System.out.println(c);
					}
				}
				
				for(int d=0; d<101; d++) {
					if(d%2 == 1) {
						System.out.println(d);
					}
				}
				
				
		
	}

}
