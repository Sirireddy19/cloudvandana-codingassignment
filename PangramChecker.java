import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:hii siri ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();

        // Convert the input to lowercase for case-insensitive checking
        input = input.toLowerCase();

        // Iterate through each character in the input
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetSet.add(ch);
            }
        }

        // Check if the set contains all 26 letters of the English alphabet
        return alphabetSet.size() == 26;
    }
}
