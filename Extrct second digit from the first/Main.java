import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rev_n = 0;
      int i = 0;
      int dig = 0;
      int num = n;
      while(n>0)
      {
        i = i + 1;
        n = n / 10;
      }
      
      int c = 1;
      n = num;
      
      while(n>0)
      {
        dig = n % 10;
        rev_n = rev_n*10 + dig;
        n = n / 10;
        c = c + 1;
      }      
      int n2 = (rev_n/10)%10;     

      System.out.println(n2);
    }
}