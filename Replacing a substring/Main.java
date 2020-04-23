import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String s = "";
    int i;
    int n1 = str1.length();
    int n2 = str2.length();
	
    str = str.replace(str1,str2);
    System.out.print(str);
  }
}
    