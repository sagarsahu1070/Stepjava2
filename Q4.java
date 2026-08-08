
import java.util.Scanner;
public class Q4 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a phone number");
        String ph=in.next();
        if(ph.length()==10)
        {
            String s=ph.substring(6);
            StringBuilder sb=new StringBuilder();
            sb.append("XXXXXX");
            sb.append("-");
            sb.append(s);
            System.out.println("The phone number is "+sb);
        }
        else
        {
            System.out.println("Invalid phone number");
        }   
    }
}
