import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i,j,num=1;
      
      for(i=1;i<=n;i++)
      {
        for(j=n-i;j>0;j--)
          System.out.print(" ");
        for(j=1;j<=i;j++)
        {
          System.out.print(num+" ");
          num++;
        }
        System.out.print("\n");
      }
    }
}