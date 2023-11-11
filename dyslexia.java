import java.util.Scanner;
import java.lang.Math;

public class Dyslexia { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String letters = "bdpq";
        String output = "";

        double random = Math.random() * 4;//has to be multiplied bc random only goes up to 1
        int rand = (int) random;

        for (int i = 0; i < input.length(); i++) {

            if (letters.substring(i, i+1).equals(input.substring(i, i + 1))) { 
                 //loop will replace b, p, d or q with random letter
                output += letters.substring(rand, rand + 1);
            } else {
                output += input.substring(i, i + 1);
            }

        }

        System.out.println(output);

    }
}
