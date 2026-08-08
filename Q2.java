import java.util.Scanner;
public class Q2 {
    public static void main(String[]args)
    {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the woard");
  String woard=in.next();
  boolean palindrome=true;
  for(int i=0;i<woard.length()/2;i++)
  {
 if(woard.charAt(i)!=woard.charAt(woard.length()-1-i))
 {
    palindrome=false;
    break;

 }

  }
if(palindrome)
{
    System.out.println("Woard is palindrome");

}
else{
    System.out.println("Woard is not palindrome");
}
    }
    
}