import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i;
      
      for(i=1;i<=2*n;i+=2)
      {
        System.out.println(i);
      }
	}
}