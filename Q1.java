/*1. ATM PIN Length Validator Scenario An ATM app must check that a PIN a customer enters is exactly 4 digits long before allowing them to continue, using only the most basic checks. Task ● Accept a PIN string. ● Get its length using length(). ● If the length is not exactly 4, print "Invalid PIN — must be exactly 4 digits." ● Otherwise, print "PIN length OK." ● This one needs no loop at all — just length() and a single if / else. Suggested method signature(s) void checkPinLength(String pin) Sample Input / Output Input "482" "4820" Output Invalid PIN — must be exactly 4 digits. PIN length OK. Concepts covered: length(), if / else, comparison operators — the smallest possible building blocks. */
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();
        int pinLength = pin.length();
        if (pinLength != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");   
        }
    }
}