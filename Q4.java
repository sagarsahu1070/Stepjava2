/*4. The Warehouse Inventory Balancer Scenario A retail warehouse stores the same product categories across two storage sections, Section A and Section B. Before the monthly stock report is generated, the inventory team wants to confirm both sections hold matching total quantities (to catch data-entry mismatches) and also identify the single highest-quantity item across the whole warehouse. Task • Accept two integer arrays of equal length representing item quantities in Section A and Section B. • Compute the total quantity held in each section. • Compare the two totals and print whether the sections are "Balanced" or "Not Balanced". • Scan both arrays to find the single highest quantity value and report which section and index it was found at. Suggested method signature(s): void analyzeInventory(int[] sectionA, int[] sectionB) Sample Input / Output Input sectionA={20,15,30}, sectionB={25,10,30} Output Section A Total: 65 | Section B Total: 65 | Status: Balanced | Highest Quantity: 30 (Section A, Item 3) Concepts covered: Arrays, loops, sum accumulation, conditional comparison, tracking maximum with its index.
*/
import java.util.Scanner;
public class Q4 {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            System.out.println("Error: Both sections must have the same number of items.");
            return;
        }

        int totalA = 0;
        int totalB = 0;
        int highestQuantity = Integer.MIN_VALUE;
        String highestSection = "";
        int highestIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];

            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestIndex = i + 1; // +1 for 1-based index
            }
            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestIndex = i + 1; // +1 for 1-based index
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status);
        System.out.println("Highest Quantity: " + highestQuantity + " (" + highestSection + ", Item " + highestIndex + ")");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in each section: ");
        int n = scanner.nextInt();
        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = scanner.nextInt();
        }

        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = scanner.nextInt();
        }

        analyzeInventory(sectionA, sectionB);
    }
}