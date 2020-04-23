import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int nlast = n%10;
      int nfirst = 0;
      
      while(n>0)
      {
        nfirst = n % 10;
        n = n / 10;        
	  }
      
      int sum = nfirst + nlast;
      System.out.println(sum);
    }
}