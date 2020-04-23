import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i,j;
      
      for(i=1;i<=n;i++)
      {
        for(j=n-i;j>0;j--)
        {
            System.out.print(" ");
        }
        for(j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
      }
      
	}
}