/*1. The Exam Hall Seat Duplication Checker Scenario The Examination Cell manages seat allocation across a large exam hall for hundreds of students. Before an exam begins, invigilators must confirm that no seat number has been assigned to two different students by mistake — a data-entry slip in the seating spreadsheet could otherwise seat two students in the same chair. The system needs to scan the full list of assigned seat numbers and flag any duplicates before the exam starts. Task • Accept an array of seat numbers (integers) assigned to students in a hall. • Compare every seat number against every other seat number to check for duplicates (do not use any Collections class — arrays and loops only). • If one or more duplicates are found, print the duplicated seat number(s). • If no duplicates exist, print a clear confirmation message. Suggested method signature(s): void checkDuplicateSeats(int[] seatNumbers) Sample Input / Output Input {101, 102, 103, 102, 105} Output Duplicate Seat Number Found: 102 {101, 102, 103, 104, 105} No Duplicate Seats Found Concepts covered: Arrays, nested loops, conditional logic, basic output formatting. 
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seat numbers: ");
        int n = scanner.nextInt();
        int[] seatNumbers = new int[n];
        
        System.out.println("Enter the seat numbers:");
        for (int i = 0; i < n; i++) {
            seatNumbers[i] = scanner.nextInt();
        }
        
        checkDuplicateSeats(seatNumbers);
    }

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;
        
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                }
            }
        }
        
        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }
}