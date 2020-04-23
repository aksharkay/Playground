import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,j;
    
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
      {
        if(i%2==1)
        {
          if(j!=n)
            System.out.print(i);
          else
          	System.out.print(i+1);
        }
        else
        {
          if(j!=1)
            System.out.print(i);
          else
            System.out.print(i+1);
        }
      }
      System.out.print("\n");
    }
  }
}
         
          