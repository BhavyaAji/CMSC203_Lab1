import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String continueLoop = ""; 

		do {
			Movie movie = new Movie();

			System.out.println("Enter the title of the movie:");
			String title = keyboard.nextLine();
			movie.setTitle(title);

			System.out.println("Enter the movie's rating:");
			String rating = keyboard.nextLine();
			movie.setRating(rating);

			System.out.println("Enter the number of tickets sold:");
			int tickets = keyboard.nextInt();
			movie.setSoldTickets(tickets);
			
			System.out.println("\n*** Movie Information ***");
			System.out.println(movie.toString());

			
			do {
				System.out.println("\nDo you want to enter another movie? (y/n)");
				continueLoop = keyboard.nextLine();
				
				if (!continueLoop.equalsIgnoreCase("y") && !continueLoop.equalsIgnoreCase("n")) {
					System.out.println("Invalid input. Please enter 'y' to continue or 'n' to stop.");
				}
				
			} while (!continueLoop.equalsIgnoreCase("y") && !continueLoop.equalsIgnoreCase("n"));
			
		} while (continueLoop.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		keyboard.close();
	}
}
