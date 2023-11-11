import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        // Initialize an empty string to store the modified output
        String output = "";

        // Define a string representing vowels
        String vowels = "aeiou";

        // Get the length of the input string
        int len = input.length();

        // Iterate through each character in the input string
        for (int i = 0; i < len; i++) {
            // Check if the current character is not a vowel
            if (!(vowels.substring(i, i + 1).equals(input.substring(i, i + 1)))) {
                // Add the non-vowel character to the output
                output += input.substring(i, i + 1);
            }
        }

        // Print the modified output string without vowels
        System.out.println(output);
    }
}
