import java.util.Scanner;
class Main
{
  public static int sum(int n)
  {
    int i,s=0;
    for(i=1;i<=n;i++)
      s=s+i;
    return s;
  }
  
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int num_sum = sum(num);
    System.out.println(num_sum);
  }
}