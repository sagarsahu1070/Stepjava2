/*2. The Typing Speed Test Accuracy Checker Scenario An online typing-practice website shows users a fixed passage and asks them to retype it as quickly and accurately as they can. Once the user submits their attempt, the system must compare it character by character against the original passage and report exactly how accurate the attempt was — along with the position of the very first mistake — so the user can see precisely where their typing went wrong. Task • Accept two strings of equal length: the original passage and the user's typed text. • Compare the two strings character by character using their positions. • Count how many characters match at the same position. • Calculate the accuracy percentage: (matched characters ÷ total characters) × 100. • Print the accuracy percentage and the position of the first mismatch (or a message confirming there were no mismatches). Suggested method signature(s): void checkTypingAccuracy(String original, String typed) Sample Input / Output Input original="hello world", typed="hello worlt" Output Matched: 10/11 | Accuracy: 90.91% | First Mismatch at position 11 ('d' vs 't') original="coding", typed="coding" Matched: 6/6 | Accuracy: 100.00% | No Mismatches Concepts covered: String traversal, charAt(), loops, conditional logic, percentage calculation.
*/
import java.util.Scanner;

public class Q2 {

    public static void checkTypingAccuracy(String original, String typed) {

        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = (matched * 100.0) / original.length();

        System.out.println("Matched: " + matched + "/" + original.length());
        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println("First Mismatch at position "
                    + (firstMismatch + 1)
                    + " ('" + original.charAt(firstMismatch)
                    + "' vs '" + typed.charAt(firstMismatch) + "')");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String original = sc.nextLine();

        System.out.print("Enter typed string: ");
        String typed = sc.nextLine();

        if (original.length() != typed.length()) {
            System.out.println("Error: Both strings must have the same length.");
        } else {
            checkTypingAccuracy(original, typed);
        }

        sc.close();
    }
}