import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      
      String str = str1 + str1;
      boolean flag = false;
      int n = str.length();
      for(int i=0;i<(n/2);i++)
      {
        //System.out.println(str.substring(i,i+str2.length()));
        if(str.substring(i,i+str2.length()).equals((str2)))
        {
           flag = true;
           break;
        }
      }
           if(flag == true)
           	System.out.print("Yes");
           else
           	System.out.print("No");
    }
}