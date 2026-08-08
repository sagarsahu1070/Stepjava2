import java.util.Scanner;
public class Q3 {
    public static void main(String[]args)
    {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter a string");
    String w=in.nextLine();
    if(w.endsWith("docx")||w.endsWith("pdf")||w.endsWith("zip"))
    {
        System.out.println("Valid file");
    }
    else
    {
        System.out.println("Invalid file");
    }
    }
}