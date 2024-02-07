
import java.util.Scanner;

public class Onlinevotingmachine{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner dp = new Scanner(System.in);

        // Initialize variables
        int candidate1Votes = 0;
        int candidate2Votes = 0;

        // Get the user's name
        System.out.print("Please enter your name: ");
        String userName = dp.nextLine();

        // Get the user's age
        System.out.print("Please enter your age: ");
        int userAge = dp.nextInt();

        // Check if the user is eligible to vote
        if (userAge >= 18) {
            // Present the user with a list of candidates to vote
            System.out.println("Please select a candidate to vote for:");
            System.out.println("1. Candidate Dipti S");
            System.out.println("2. Candidate Abhi S");

            // Get the user's selection
            int userSelection = dp.nextInt();

            // Increment the vote count for the selected candidate
            if (userSelection == 1) {
                candidate1Votes++;
            } else if (userSelection == 2) {
                candidate2Votes++;
            }

            // Display a message to the user
            System.out.println("Thank you for voting, " + userName + "!");
        } else {
            // Display a message to the user if they are not eligible to vote
            System.out.println("You are not eligible to vote.");
        }

        // Display the final vote count
        System.out.println("Candidate Dipti S: " + candidate1Votes + " votes");
        System.out.println("Candidate Abhi S: " + candidate2Votes + " votes");
        dp.close();
    }
}
