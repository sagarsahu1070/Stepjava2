/* Product Inventory CSV Parser Scenario The warehouse team receives inventory updates as CSV lines and needs a quick parser to split each line into fields and print a formatted record. Task ● Accept a CSV line in the form "ProductName,SKU,Quantity". ● Use split(",") to break it into fields. ● Validate that exactly 3 fields are present; if not, print "Invalid Record". ● Print a formatted record: "Product: ... | SKU: ... | Qty: ...". Suggested method signature(s) void parseInventoryRecord(String csvLine) Sample Input / Output Input Output "Wireless Mouse,WM-2201,150" "Wireless Mouse,150" Product: Wireless Mouse | SKU: WM-2201 | Qty: 150 Invalid Record Concepts covered: split(), array length validation, string concatenation, formatted output.*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a CSV line (ProductName,SKU,Quantity): ");
        String csvLine = scanner.nextLine();
        parseInventoryRecord(csvLine);
    }
    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            String productName = fields[0];
            String sku = fields[1];
            String quantity = fields[2];
            System.out.println("Product: " + productName + " | SKU: " + sku + " | Qty: " + quantity);
        }
    }
}