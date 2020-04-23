import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    int key = sc.nextInt();
    int n = ch;
    int num = ch - key;
    if(ch>=97 && num<97)
      num = num + 26;
    if(ch>=65 && num<65)
      num = num + 26;
  
    System.out.print((char)num);
  }
}