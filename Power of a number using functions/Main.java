import java.util.Scanner;
class Main
{
  
  public static int power(int base, int exp)
  {
    int i,ans = 1;
    for(i=1;i<=exp;i++)
      ans = ans * base;
    return ans;
  }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int exp = sc.nextInt();

    int ans = power(base,exp);
    System.out.println(ans);
  }
}
