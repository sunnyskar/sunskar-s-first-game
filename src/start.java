import java.util.Scanner;

public class start {

	private static Scanner input;

	public static void main(String[] args) {
		int points = 0;
		// Introduction to game
		input = new Scanner(System.in);
		System.out.println("Hello! Welcome to my game. What is your name?");
		String playername = input.nextLine();

		// "checking" if name is right
		String namecorrect;
		do {
			System.out.println("You entered: " + playername + ". Is this correct? If not too bad.");
			System.out.println("Type yes or no");
			namecorrect = input.nextLine();
		} while (!namecorrect.equalsIgnoreCase("yes"));
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

