import java.util.Scanner;

public class start
{
	private static Scanner input;

	// There isn't really any reason to keep all these in separate Strings unless we plan on using them more than once.
    // I'm keeping all of these for the sake of easier-to-read code.
	private static String playerName;
	private static String nameCorrect;


	/**
     * This represents the number of questions in the quiz.
     *
     * If you plan to make all questions multiple choice, we can just make the whole quiz into a loop.
     * An iterator will cycle through this loop [QUESTIONS] times.
     * Then there would have to be an array for questions' text, and another for possible answer choices.
     * We can access a specific question's text given the question # using array indices. Don't forget that they start at 0.
     * For answer choices, we'd have a 2-dimensional array.
    */
   

	// An array to keep the users' answers to questions.


	public static void main(String[] args)
    {
		int points = 0;
		// Introduction to game
		input = new Scanner(System.in);

		System.out.println("Hello! Welcome to my game.");

//"checking" if name is right
do {
    System.out.println("What is your name?");
    playerName = input.nextLine();
    // I got rid of the "println" and just made it a "print". Because it looks cooler when you take input on the same line if it's just a Y/n
	System.out.print("You entered: " + playerName + ". Is this correct? (yes/no) ");
    nameCorrect = input.nextLine();
} while (!nameCorrect.equalsIgnoreCase("yes"));
		// introducing controls
		String startgame;
		do {
			System.out.println("Type up, down, right, or left to chose/move. Type up to continue");
			startgame = input.nextLine();
		} while (!startgame.equalsIgnoreCase("up"));

		// first question
		System.out.println("Let's get started. You will need to choose a pokemon stronger than the opponents.");
		System.out.println("You are going against a Piplup");
		System.out.println("To choose turtwig go up.");
		System.out.println("To choose chimchar go left.");
		System.out.println("To choose lilipup go right.");
		System.out.println("Choose wisely.");
		String firstanswer = input.nextLine();

		switch (firstanswer.toLowerCase()) {

		case "up":
			points = points + 2;
			System.out.println("You use vine whip. Super Effective. Easy win. You gained 2 points");
			break;

		case "left":
			System.out.println("Opponent used bubble beam. Super effective. You lost");
			break;

		case "right":
			System.out.println("You barely won. You manage to get a point");
			points++;
			break;

		default:
			System.out.println("next time check your spelling");
		}
		String secondanswer;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Your next question is about the first evolution of a pokemon.");
		System.out.println("What is the first evolution for charizard");
		System.out.println("To choose chimchar type up.");
		System.out.println("To choose charmander type left.");
		System.out.println("To choose turtwig type right.");
		System.out.println("To chose chespin type down");
		System.out.println("Choose wisely");
		secondanswer = input.nextLine();
		switch (secondanswer.toLowerCase()) {
		case "up" :
			System.out.println("WROOOOOOOONG");
			break;
		case "left":
			System.out.println("Good Job!");
			points++;
			break;
		case "right":
			System.out.println("WROOOOOOOONG");
			break;
		case "down":
			System.out.println("WROOOOOOOONG");
			break;
		default:
			System.out.println("next time check your spelling");
			
		}
		String thirdanswer;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("What is the first evolution of raichu");
		System.out.println("To choose pikachu type up");
		System.out.println("To choose pulsi type left");
		System.out.println("To choose pichu type right");
		System.out.println("To choose Anish type down");
		System.out.println("Choose wisely");
		thirdanswer = input.nextLine();
		switch (thirdanswer.toLowerCase()) {
		case "up" :
			System.out.println("WROOOOOOOONG");
			break;
		case "right":
			System.out.println("Good Job!");
			points++;
			break;
		case "left":
			System.out.println("WROOOOOOOONG");
			break;
		case "down":
			System.out.println("WROOOOOOOONG");
			break;
		default:
			System.out.println("next time check your spelling");
		}
		String lastanswer;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("The last question is...");
		System.out.println();
		System.out.println();
		//387
		System.out.println("What is the national pokedex entry number of turtwig?");
		lastanswer = input.nextLine();
		switch (lastanswer.toLowerCase()) {
		case "387" :
			System.out.println("well done");
			points++;
			break;
		default:
			System.out.println("NOPE");
		}
	 System.out.println("You finished my game");
	 System.out.println();
	 System.out.println();
	 System.out.println();
	 System.out.println();
		
		
		System.out.println("Your points are: " + points + " out of 5");
		switch(points){
		case 5:
			System.out.println("Your name must be Brendan.");
			break;
		case 4:
			System.out.println("Hey, that's pretty good.");
			break;
		case 3: 
			System.out.println("You are average :(");
			break;
		case 2: 
			System.out.println("What pokemon games have you played other than pokemon go.");
			break;
		case 1: 
			System.out.println(" wow (said sarcastically)");
			break;
		case 0:
			System.out.println("DO YOU EVEN POKEMON, BRO");
			break;
		default:
			System.out.println("poop");
		}
	
	}
}
