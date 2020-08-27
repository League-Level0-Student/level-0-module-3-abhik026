
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		
		
		
		
		Random random = new Random();
		int number = random.nextInt(100)+1;
		
		
	for(int i=10; i>0;i--) {
		int triesleft = i -1;
		String guess =JOptionPane.showInputDialog("Guess a number between 1-100, you have "+i+" tries");
		int guessNum = Integer.parseInt(guess);
		
		if(guessNum == number) {
			JOptionPane.showMessageDialog(null, guessNum+" Is Correct. You Win, Congratulations");
			System.exit(0);
		}
		else if(guessNum > number) {
			JOptionPane.showMessageDialog(null, "Guess was too high\nTries Left : "+triesleft);
		}
		else if(guessNum<number) {
			JOptionPane.showMessageDialog(null, "Guess was too low\nTries Left: "+triesleft);
		}
		else if(guess.isBlank()){
			JOptionPane.showMessageDialog(null, "No Guess\nTries Left: "+triesleft);
		}
		
	}
		JOptionPane.showMessageDialog(null, "You Lose\nCorrect Answer: "+number);
		
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


