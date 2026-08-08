import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the reference:");
        String reference = sc.nextLine();

        
        reference = reference.trim();

        
        StringBuilder sb = new StringBuilder(reference);

        
        for (int i = 0; i < 3; i++) {
            char temp = Character.toUpperCase(sb.charAt(i));
            sb.setCharAt(i, temp);
        }

        if (sb.length() != 14) {
            System.out.println("Invalid: wrong length");
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(sb.charAt(i))) {
                System.out.println("Invalid: bank code must be 3 letters");
                return;
            }
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(sb.charAt(i))) {
                System.out.println("Invalid: body must contain only digits");
                return;
            }
        }

        System.out.println(
            "[" + sb.substring(0, 3) + "] DATE: " +
            sb.substring(3, 5) + "/" +
            sb.substring(5, 7) + "/" +
            sb.substring(7, 9) +
            " | SEQ: " +
            sb.substring(9, 14)
        );
    }
}