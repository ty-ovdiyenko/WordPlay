import java.util.Scanner;

public class RemoveDoubleSpace {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        // Define a string representing a space
        String space = " ";

        // Initialize an empty string to store the modified output
        String output = "";

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Check if the current character is a space
            if (space.equals(input.substring(i, i + 1))) {
                // Add the first space to the output
                output += input.substring(i, i + 1);
                i++; // Increment i to skip the next character

                // Check if the next character is also a space
                if (space.equals(input.substring(i, i + 1))) {
                    i++; // Increment i again to skip the extra space
                } else {
                    // If the next character is not a space, add it to the output
                    output += input.substring(i, i + 1);
                }
            } else {
                // If the current character is not a space, add it to the output
                output += input.substring(i, i + 1);
            }
        }

        // Print the modified output string without consecutive double spaces
        System.out.println(output);
    }
}
