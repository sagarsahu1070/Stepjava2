import java.util.Scanner;
public class Q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int l,i;
        System.out.println("Enter a string");
        str = sc.nextLine();
        String [] arr = str.split(" ");
         l = arr.length;
        String min = arr[0];
        String max = arr[0];
        for( i=0; i<l; i++)
        {
            if(arr[i].length() < min.length())
            {
                min = arr[i];
            }
            if(arr[i].length() > max.length())
            {
                max = arr[i];
            }
        }
        System.out.println("Longest word is: " + max);
        System.out.println("Shortest word is: " + min);
    }
}