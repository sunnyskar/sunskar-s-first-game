import java.util.Scanner;

public class start {

	private static Scanner input;

	public static void main(String[] args) {
		int points = 0;
		//Introduction to game
		input = new Scanner(System.in);
		System.out.println("Hello! Welcome to my game. What is your name?");
		String playername = input.nextLine();

		//"checking" if name is right
		String namecorrect;
		do {
			System.out.println("You entered: " + playername + ". Is this correct? If not too bad.");
		namecorrect = input.nextLine();
		}
		while (namecorrect != "yes");
		// introducing controls
		String startgame;
		do {System.out.println("Type up, down, right, or left to chose/move. Type up to continue");
		startgame = input.nextLine();
				} 
		while (startgame != "up");

			// first question
			System.out.println("Let's get started. You will need to choose a pokemon stronger than the opponents.");
			System.out.println("You are going against a Piplup. To choose turtwig go up. To choose chimchar go left. To choose lilipup go right. Choose wisely ");
			String firstanswer = input.nextLine();
			switch(firstanswer) {
			
			case "up" :
				points= points+2;
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
		}

	}

