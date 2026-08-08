import java.util.Scanner;
public class Q4
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String text;
        int l,i,j,c=0;
        System.out.println("Enter a string");
        text=in.nextLine();
        l=text.length();
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(text.charAt(i)==text.charAt(j))
                {
                    c++;
                    break;
                }
            }
            if(c==1)
            {
                System.out.println("First non-repeating character is: "+text.charAt(i));
                break;
            }
            if(c==0)
            {
                System.out.println("No non-repeating character found.");
            }
        }
    }
}