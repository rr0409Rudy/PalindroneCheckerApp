import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Normalize input: remove spaces and lowercase
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        // Palindrome check
        if (cleanedInput.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}