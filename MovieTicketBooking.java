import java.util.Scanner;

public class MovieTicketBooking {

    
    static String[] movies = {"1. Oppenheimer", "2. Dune 2", "3. Kalki 2898 AD", "4. Inside Out 2"};
    static int ticketPrice = 150;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Movie Ticket Booking System");
        System.out.println("------------------------------------------");
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        
        System.out.print("\nEnter movie number (1-4): ");
        int movieChoice = sc.nextInt();
        if (movieChoice < 1 || movieChoice > movies.length) {
            System.out.println("Invalid choice. Please restart the program.");
            return;
        }

        
        System.out.print("Enter number of tickets: ");
        int numTickets = sc.nextInt();
        if (numTickets <= 0) {
            System.out.println("Invalid ticket count.");
            return;
        }

        
        int totalCost = ticketPrice * numTickets;

        
        System.out.println("\n Booking Confirmed!");
        System.out.println("Movie: " + movies[movieChoice - 1].substring(3));
        System.out.println("Tickets: " + numTickets);
        System.out.println("Total Cost: ₹" + totalCost);
        System.out.println("Enjoy your movie! ");

        sc.close();
    }
}
