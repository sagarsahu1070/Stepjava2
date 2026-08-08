import java.util.*;
public class Q2 {
    public static void main(String[]args)
    {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the line");
  String details=in.next();
  String[] feild=details.split(",");
  int l=feild.length;
  if(l!=3)
  {
    System.out.println("INVALID record");
  }
  else {
System.out.println("Name "+feild[0]);
System.out.println("Roll no."+feild[1]);
System.out.println("Dept"+feild[2]);

  }



    }
    
}