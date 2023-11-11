import java.util.Scanner;

public class ThreeAs {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        // Counter to keep track of consecutive 'a's
        int aCounter = 0;

        // Flag to determine if the input has three or more consecutive 'a's
        boolean hasThreeAs = false;

        // Index variable for iterating through the input string
        int i = 0;

        // Get the length of the input string
        int len = input.length();

        // Iterate through each character in the input string
        while (i < len) {
            // Check if the current character is 'a'
            if (input.substring(i, i + 1).equals("a")) {
                aCounter++; // Increment the counter for each 'a'

                // Check if three or more consecutive 'a's are found
                if (aCounter == 3) {
                    hasThreeAs = true;
                }
            } else {
                // Reset the counter if the current character is not 'a'
                aCounter = 0;
            }

            i++; // Increment for the loop
        }

        // Check the flag and print the result
        if (hasThreeAs) {
            System.out.println("Your input contained three or more consecutive \"a\"s");
        } else {
            System.out.println("Your input did not contain three or more consecutive \"a\"s");
        }
    }
}
