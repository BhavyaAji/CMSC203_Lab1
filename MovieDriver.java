import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String continueLoop = ""; 
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


		System.out.println("\nGoodbye!");
		keyboard.close();
	}
}
