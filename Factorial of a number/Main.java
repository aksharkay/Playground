import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i,f=1;
      
      for(i=1;i<=num;i++)
      {
        f=f*i;
      }
      
      System.out.println(f);
      
	}
}