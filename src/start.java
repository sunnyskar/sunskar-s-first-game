import java.util.Scanner;

public class start
{
	private static Scanner input;

	public static void main(String[] args)
    {
		int points = 0;
		input = new Scanner(System.in);

		//start game with name 
		System.out.println("Hello! Welcome to my game.");
		while (true)
		{
			System.out.println("What's your name? ");
			String playername = input.nextLine();
			System.out.println("You entered: " + playername + ". Is this correct? ");
			String namecorrect = input.nextLine();
			if (namecorrect.equalsIgnoreCase("yes"))
			{
				break;
			}
		}

		//introducing controls
		System.out.println("Type up, down, right, or left to choose/move. Type \"up\" to continue... ");
		String startgame = input.nextLine();
		
		if (startgame.equalsIgnoreCase("up"))
		{
			
			//first question
			System.out.println("Let's get started. You will need to choose a Pokémon stronger than the opponents.");
			System.out.println("You are going against a Piplup. To choose Turtwig, go up. To choose Chimchar, go left. To choose Lilipup, go right. Choose wisely... ");
			String firstanswer = input.nextLine();
			if (firstanswer.equalsIgnoreCase("turtwig"))
			{
				points++;
			}
			else
			{
				System.out.println("Nope, it was a Turtwig.");
			}
		}
		System.out.println("You have "+ points +" points thus far.");
	}
}
