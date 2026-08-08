/*5. The Movie Review Word Length Profiler Scenario A movie-review platform's moderation tool scans newly submitted reviews and profiles the length of the words used in them — reviews stuffed with unusually many very short or very long words are more likely to be spam or bot-generated, so moderators want a quick word-length breakdown before a review is allowed to go live. Task • Accept a movie review as a single string input. • Split the review into individual words. • Classify each word as Short (1–4 letters), Medium (5–8 letters), or Long (9+ letters). • Count how many words fall into each category. • Print the final counts for Short, Medium, and Long words. Suggested method signature(s): void classifyWordLengths(String review) Sample Input / Output Input "This movie was absolutely fantastic and thrilling" Output Short: 3 | Medium: 1 | Long: 3 Concepts covered: String splitting (split()), loops, conditional logic, counting/categorization. 
*/
import java.util.Scanner;
public class Q5 {
    public static void classifyWordLengths(String review) {
        String[] words = review.split("\\s+");
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {
            int length = word.length();
            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the movie review: ");
        String review = scanner.nextLine();
        classifyWordLengths(review);
    }
}