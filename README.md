# WordPlay
These files are from my AP CSA class that involve determining whether words are anagrams of each other, imitate dsylexic text, remove vowels, etc

#Anagram
This Java program, Anagram, allows users to input two strings and determines whether they are anagrams. Anagrams are words or phrases formed by rearranging the letters of another, using all the original letters exactly once. The program accounts for spaces and case sensitivity.
#Usage
Run the program.
Enter the first string without punctuation or capitals when prompted.
Enter the second string without punctuation or capitals when prompted.
The program will evaluate if the two strings are anagrams and display the result.
#Implementation
The program removes spaces from both input strings to ensure accurate evaluations.
It compares the lengths of the processed strings and checks if the characters in the first string also appear in the second string.
If the lengths match and all characters are present in both strings, the program declares the input as anagrams.

#Dyslexia
Dyslexia is a Java program designed to simulate dyslexic text input by replacing certain letters (b, d, p, q) with randomly chosen alternatives. Users can input a string, and the program will output a modified version with shuffled characters for the specified letters.
#Usage
Run the program.
Enter a string when prompted.
The program will replace occurrences of 'b', 'd', 'p', and 'q' with randomly chosen alternatives, providing a dyslexic-like representation of the input.
#Implementation
The program utilizes the Math.random() function to generate a random index for the replacement of 'b', 'd', 'p', and 'q'.
It then iterates through the input string, replacing the specified letters with randomly chosen alternatives, and preserving the rest of the characters.

#RemoveDoubleSpace
RemoveDoubleSpace is a Java program designed to eliminate consecutive double spaces from an input string. Users can input a string containing multiple spaces, and the program will output a modified version with consecutive double spaces reduced to a single space.
#Usage
Run the program.
Enter a string when prompted.
The program will remove consecutive double spaces from the input, providing a cleaned version of the string.
#Implementation
The program iterates through the input string, identifying consecutive double spaces.
It replaces consecutive double spaces with a single space, preserving the rest of the characters.
The result is a string with reduced consecutive spaces.
Feel free to explore, modify, and use the code for your purposes. Experiment with different input strings to observe the removal of double spaces!

#RemoveVowels
RemoveVowels is a Java program designed to eliminate vowels from an input string. Users can input a string, and the program will output a modified version with all vowels removed.
#Usage
Run the program.
Enter a string when prompted.
The program will remove all vowels from the input, providing a version of the string without vowels.
#Implementation
The program iterates through the input string, identifying vowels.
It excludes vowels from the output, preserving the rest of the characters.
The result is a string with all vowels removed.
Feel free to explore, modify, and use the code for your purposes. Experiment with different input strings to observe the removal of vowels!

#ThreeAsTM
ThreeAsTM is a Java program designed to check if an input string contains three or more consecutive occurrences of the letter "a". Users can input a string, and the program will determine if it contains the specified consecutive "a"s.
#Usage
Run the program.
Enter a string when prompted.
The program will check if the input contains three or more consecutive occurrences of the letter "a" and provide the result.
#Implementation
The program utilizes a loop to iterate through the input string, counting consecutive "a"s.
It sets a boolean flag, hasThreeAs, to true if three or more consecutive "a"s are found.
The result is displayed based on the presence or absence of three or more consecutive "a"s.
Feel free to explore, modify, and use the code for your purposes. Experiment with different input strings to observe the detection of consecutive "a"s!
