import java.util.Scanner;

public class start
{
	private static Scanner input;

	// There isn't really any reason to keep all these in separate Strings unless we plan on using them more than once.
    // I'm keeping all of these for the sake of easier-to-read code.
	private static String playerName;
	private static String nameCorrect;
	private static String startGame;

	/**
     * This represents the number of questions in the quiz.
     *
     * If you plan to make all questions multiple choice, we can just make the whole quiz into a loop.
     * An iterator will cycle through this loop [QUESTIONS] times.
     * Then there would have to be an array for questions' text, and another for possible answer choices.
     * We can access a specific question's text given the question # using array indices. Don't forget that they start at 0.
     * For answer choices, we'd have a 2-dimensional array.
    */
    private final static int QUESTIONS = 1;

	// An array to keep the users' answers to questions.
	private static String[] answers = new String[QUESTIONS];

	private static boolean validAnswer;

	public static void main(String[] args)
    {
		int points = 0;
		//Introduction to game
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
		// When comparing Strings you have to use some variant of the Object.equals(Object) method. Because Java.

		// introducing controls
		do {
		    // Note the backslashes before the quotation marks. This is to "escape" them so that Java doesn't think we're ending the string.
            // When the program is executed these \"\" appear like this "".
            // But what if you want to print a \ ? You can escape that too. \\
            // https://xkcd.com/1638/
		    System.out.println("Type up, down, right, or left to choose/move. Type \"up\" to continue");
            startGame = input.nextLine();
        } while (!startGame.equalsIgnoreCase("up"));

        // first question
        do
        {
            validAnswer = true;
            System.out.println("Let's get started. You will need to choose a pokémon stronger than the opponents.");
            System.out.println("You are going against a Piplup. To choose turtwig go up. To choose chimchar go left. To choose lilipup go right. Choose wisely ");
            // Changing it to lowercase because that's what we're using in our switch statements.
            // So "LEFT", "Left", and "left" will all become "left" and will go to that case in the switch statement.
            answers[0] = input.nextLine().toLowerCase();

            // Remember the equals() function from before? We don't need it in a switch statement. Because Java.
            switch (answers[0])
            {
                // This could be better done with an if-else block but this is something cool you can do with cases.
                // It's also the reason why you need to break; them otherwise.
                case "up":
                case "left":
                case "right":
                    validAnswer = true;
                default:
                    ;
            }

            switch (answers[0])
            {
                case "up":
                    points += 2;
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
                    validAnswer = false;
                    // "\n" = newline.
                    System.out.println("next time check your spelling\n");
            }
        } while (!validAnswer);
    }
}
