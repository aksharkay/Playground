import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String str = "";
    int i;
    int n=s.length();
    
    for(i=n-1;i>=0;i--)
    {
      str = str + s.charAt(i);
    }
    
    if(str.equals(s))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}