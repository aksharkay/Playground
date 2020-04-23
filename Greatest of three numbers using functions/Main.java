import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int max_ab = max(a,b);
    int max_abc = max(max_ab,c);;
    
    System.out.println(max_abc);
  }
  
  public static int max(int a, int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
}