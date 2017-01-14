import java.util.Scanner;

public class start {

	private static Scanner input;

	public static void main(String[] args) {
		int points = 0;
		input = new Scanner(System.in);

		//start game with name 
		System.out.println("Hello! Welcome to my game. What is your name?");
		String playername = input.nextLine();
		System.out.println("You entered: " + playername + ". Is this correct? If not too bad.");
		
		input = new Scanner(System.in);
		//introducing controls
		input = new Scanner(System.in);
		System.out.println("Type up, down, right, or left to chose/move. Type up to continue");
		String startgame = input.nextLine();
		
		if (startgame == "up") {
			
			//first question
			System.out.println("Let's get started. You will need to choose a pokemon stronger than the opponents."); 
			input = new Scanner(System.in);
            System.out.println("You are going against a Piplup. To choose turtwig go up. To choose chimchar go left. To choose lilipup go right. Choose wisely ");
            String firstanswer= input.nextLine();
            if(firstanswer == "turtwig"){
            	points = points++;
            }
            else{
            	
            }
		}
	
	}
}
