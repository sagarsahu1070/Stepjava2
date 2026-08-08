import java.util.Scanner;
public class Q1 {
    public static void main(String[]args)
    {
    Scanner in= new Scanner(System.in);
    String w=in.next();
    int v=0;
    int c=0;
    int l=w.length();
    for(int i=0;i<l;i++)
    {
  if(w.charAt(i)=='a'||w.charAt(i)=='e'||w.charAt(i)=='i'||w.charAt(i)=='o'||w.charAt(i)=='u'||w.charAt(i)=='A'||w.charAt(i)=='E'||w.charAt(i)=='I'||w.charAt(i)=='O'||w.charAt(i)=='U'){
    v++;
  }
else c++;


    }
System.out.println("Vowel"+v);
System.out.println("COnsonents"+c);

    }
    
}