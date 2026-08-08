/* Library ISBN Normalizer & Validator Scenario A library system's book-intake scanner needs to both normalize and validate ISBN-style codes. A valid code is exactly 13 characters: 3 letters (publisher code) + 4 digits (year) + 6 digits (catalog number). Scanned codes sometimes have stray spaces or a mixed-case publisher code. Task ● Accept a raw code string that may contain leading/trailing spaces. ● Normalize it: trim() the spaces, then uppercase only the first 3 characters using substring() + concatenation — leave the rest untouched. ● Validate: exactly 13 characters after normalization; the first 3 characters are letters; the remaining 10 are digits (use Character.isLetter() / isDigit() in a loop — no regex). ● If valid, build a formatted display line with StringBuilder: "[PUBCODE] YEAR: 20XX | CATALOG: 123456". ● If invalid, print the specific reason: wrong length, non-letter publisher code, or non-digit body. Suggested method signature(s) String normalizeCode(String raw) + String validateAndFormat(String code) Sample Input / Output Input Output " pen2026004251 " [PEN] YEAR: 2026 | CATALOG: 004251 Input Output "12N2026004251" Invalid: publisher code must be 3 letters Concepts covered: trim(), substring(), string concatenation, Character.isLetter()/isDigit(), StringBuilder, multi-stage validation*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a raw ISBN code: ");
        String rawCode = scanner.nextLine();
        String normalizedCode = normalizeCode(rawCode);
        String validationResult = validateAndFormat(normalizedCode);
        System.out.println(validationResult);
    }
    public static String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase(); // If less than 3 characters, just uppercase whatever is there
        }
        String pubCode = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        return pubCode + rest;
    }
    public static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }
        String pubCode = code.substring(0, 3);
        String yearAndCatalog = code.substring(3);
        for (char c : pubCode.toCharArray()) {
            if (!Character.isLetter(c)) {
                return "Invalid: publisher code must be 3 letters";
            }
        }
        for (char c : yearAndCatalog.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "Invalid: year and catalog must be digits";
            }
        }
        String year = yearAndCatalog.substring(0, 4);
        String catalog = yearAndCatalog.substring(4);
        StringBuilder formatted = new StringBuilder();
        formatted.append("[").append(pubCode).append("] YEAR: ").append(year).append(" | CATALOG: ").append(catalog);
        return formatted.toString();
    }
}