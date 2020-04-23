import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      int gcd_ab = gcd(a,b);
      int gcd_abc = gcd(gcd_ab, c);
      
      System.out.println(gcd_abc);
	}
  
  public static int gcd(int a, int b)
  {
    int i, gcd_val=1, count;
    if(a>b)
      count = b;
    else
      count = a;
    
    for(i=1;i<=count;i++)
    {
      if(a%i==0 && b%i==0)
        gcd_val = i;
    }
    return gcd_val;
  }
}