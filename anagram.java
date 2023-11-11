import java.util.Scanner;

public class Anagram { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, no punctuation or capitals: ");
        String input = sc.nextLine();
        System.out.println("Enter a second String, no punctuation or capitals: ");
        String inputTwo = sc.nextLine();
        String space = " ";
        String output = "";
        String outputTwo = "";
        boolean isAnagram = true;

        /** These loops take for account spaces in both inputs */

         for (int i = 0; i < input.length(); i++) { 
            if (space.equals(input.substring(i, i + 1)) == false) {
                output += input.substring(i, i + 1);
            }
        }

        //DEBUG System.out.println(output);

        for (int i = 0; i < inputTwo.length(); i++) {
            if (space.equals(inputTwo.substring(i, i + 1)) == false) {
                outputTwo += inputTwo.substring(i, i + 1);
            }
        } 

        // DEBUG System.out.println(outputTwo);

        /** This next loop determines if both evaluated strings are the same length
         *  If they are not the same length then they cannot contain the same
         * letters with the same frequency. If they are the same length, it evaluates
         * if the characters in the first input also appear in the second input. 
         */

        if (outputTwo.length() == output.length()) {
            for (int i = 0; i < output.length() - 1; i++) {
                if (outputTwo.contains(output.substring(i, i + 1)) == false) {
                    isAnagram = false;
                }
            }
        } else {
            isAnagram = false;
        }

        /** This gives the final evaluation */

        if (isAnagram) {
            System.out.println("The two strings are anagrams!");
        } else {
            System.out.println("The two strings are not anagrams!");
        }
    }
}
