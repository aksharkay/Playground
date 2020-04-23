import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i,s=0;
      for(i=1;i<=n;i++)
      {
        s+=i;
      }
      System.out.println(s);
	}
}