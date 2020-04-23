import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int s = n*n;
    return s;
  }
  
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      
      int sqr = square(num);
      System.out.print(sqr);
	} 
}