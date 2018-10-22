import java.util.Scanner;
public class GuessingNumbers {
	
	public static void main(String[]args) {
	/*Guessing numbers 
	 * guess what number your computer has in mind
	 * 1.  generate a random number	
	 * 2.  prompt user to enter guess
	 * 3.  then compare guesses
	 * 
	 */
	
	float computerGuess = (float)Math.random();
	//System.out.println(computerGuess);
	float zeroToOneHundred = computerGuess*100;
	//System.out.println(zeroToOneHundred);
	int computerGuessRounded = (int) Math.ceil(zeroToOneHundred);
	
	//System.out.println("The computer's random integer is " + computerGuessRounded);
	
	Scanner input = new Scanner (System.in);
	int userGuess = input.nextInt();
	
		while (true) {
			if (userGuess == computerGuessRounded) {
				
				System.out.println("Your guess is correct!  Let's play again!" 
						+"\n\nEnter a new number: ");
					
				
				} else if (userGuess < computerGuessRounded){
				
				System.out.println("Your guess is too low! Try again!");
				
				} else {
					System.out.println("Your guess is too high! Try again!");
				}	
			
			userGuess = input.nextInt();
		}
	
}
}
