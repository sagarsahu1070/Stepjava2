import java.util.*;
public class Q3 {
    public static void main(String[]args)
    {
Scanner in=new Scanner(System.in);
System.out.println("Enter the custumer id");
String id=in.next();
if(id.startsWith("VIP"))
{
    System.out.println("VIP custumer");
}
else{
    System.out.println("Regular custumer");
}

    }
}