import java.util.Scanner;
class Main
{
  
  public static void prime(int n)
  {
    int i, j, c=0;
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
      {
        if(i%j==0)
          c++;
      }
      if(c==2)
        System.out.println(i);
      c=0;
    }
  }
  
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    prime(n);
  }
}