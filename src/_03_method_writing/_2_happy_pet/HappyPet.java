package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String typeOfPet = JOptionPane.showInputDialog("What kind of pet do you want to buy? A dog or a cat.");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for(int i=0; i<50; i++) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "You want to make your pet happy, what shall you do?", "Pet Option", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed it","Take it on a walk","Pet it" }, null);
			
			// 6. Use user input to call the appropriate method created in step 5 below.
			if(task == 0) {
				feed(typeOfPet);
			}else if(task == 1) {
				walk(typeOfPet);
			}else if(task == 2) {
				pet(typeOfPet);
			}
			
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 100) {
				JOptionPane.showMessageDialog(null, "You love your pet very much, it is at peak happiness! But it is tired now and wants to sleep.");
				break;
			}
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void feed(String pet) {
		if(pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "You open a can of cat food and poor it in a bowl, your cat walks over and takes its time to enjoy the food. It purrs and rubs on you when it is done.");
		}else if(pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "You pour some dog kibble into a bowl, your dog sprints over and devours it in 2 seconds. It then proceeds to run in circles.");
		}else {
			JOptionPane.showMessageDialog(null, "You put some apple slices on a dish, your lizard crawls over and eats them. It seems content.");
		}
		happinessLevel += 10; // All animals like food! :D
		
	}
	
	static void walk(String pet) {
		if(pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "You try to put your cat outside, but it hisses at you and proceeds to go back inside and lay on the couch.");
			happinessLevel += 1;
		}else if(pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "You get out the leash. Your dog instantly knows what's up. It zooms to the door, you put the leash on,\nand you sprint around the neighborhood trying to keep up with your dog. Your dog is beyond happy when you get home!");
			happinessLevel += 15;
		}else {
			JOptionPane.showMessageDialog(null, "You take your lizard out of its enclosure, it crawls on the celing. It seems happy.");
			happinessLevel += 8;
		}
		
	}
	
	static void pet(String pet) {
		if(pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "You stroke your cat on its back, it purrs loudly. You then try to rub its belly, it scratches you.");
			happinessLevel += 5;
		}else if(pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "You start to pet your dog, it rolls over and you rub its belly, it is very happy!");
			happinessLevel += 10;
		}else {
			JOptionPane.showMessageDialog(null, "You try to pet your lizard, it gives you a look that says, \"What the heck are you doing?\"");
			happinessLevel += 3;
		}
		
	}
	
}