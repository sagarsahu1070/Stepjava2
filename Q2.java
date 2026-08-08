/*2 . Word Reversal Encoder Scenario The coding club's "mirror text" mini-game reverses every word in a sentence individually while keeping the word order the same, so "hello club" becomes "olleh bulc". Task ● Accept a sentence (words separated by single spaces). ● Split it into words using split(" "). ● For each word, build its reverse using a loop and StringBuilder. ● Join the reversed words back together with spaces and print the result. Suggested method signature(s) String reverseEachWord(String sentence) Sample Input / Output Input "hello club" Output olleh bulc Concepts covered: split(), StringBuilder / reverse(), loops, string joining. */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String reversedSentence = reverseEachWord(sentence);
        System.out.println(reversedSentence);
    }
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}