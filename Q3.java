/*3. The Traffic Signal Streak Analyzer Scenario The city traffic control department logs the color shown by a signal every minute using single letters — 'R' for red, 'Y' for yellow, 'G' for green. Engineers suspect a malfunctioning signal at one junction might be getting "stuck" on one color for unusually long stretches. They need a tool that scans a day's log and reports the longest continuous streak of the same color, so they know exactly which signal to inspect first. Task • Accept a string representing a sequence of signal readings (e.g., "RRGGGYRR"). • Scan through the string and track the length of each streak of consecutive identical characters. • Keep a running record of the longest streak found so far — both its color and its length. • Print the color and length of the longest streak. Suggested method signature(s): void findLongestStreak(String signalLog) Sample Input / Output Input "RRGGGYRR" Output Longest Streak: 'G' repeated 3 times "RRRRYYGG" Longest Streak: 'R' repeated 4 times Concepts covered: String traversal, character comparison, loops, tracking a running maximum.
*/
import java.util.Scanner;
 public class Q3{
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("No signal data provided.");
            return;
        }

        char longestColor = signalLog.charAt(0);
        int longestLength = 1;

        char currentColor = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestColor = currentColor;
                }
                currentColor = signalLog.charAt(i);
                currentLength = 1;
            }
        }

        // Final check at the end of the loop
        if (currentLength > longestLength) {
            longestLength = currentLength;
            longestColor = currentColor;
        }

        System.out.println("Longest Streak: '" + longestColor + "' repeated " + longestLength + " times");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the signal log: ");
        String signalLog = scanner.nextLine();
        findLongestStreak(signalLog);
    }
 }