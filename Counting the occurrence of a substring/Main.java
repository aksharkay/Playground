import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    s1 = s1 + " ";
    int i,count=0;
    int n1 = s1.length();
    int n2 = s2.length();
    for(i=0;i<n1-n2;i++)
    {
      //System.out.println(s1.substring(i,i+n2));
      if(s1.substring(i,i+n2).equals(s2))
         count++;
    }
    
    System.out.println(count);
  }
}      
    
/*    
    for(i=0;i<n1;i++)
    {
      if(s1.charAt(i) == s2.charAt(pos))
      {
        count++;
        pos++;
      }
      else
      {
        pos = 0;
      }
      
      if(count == n2)
      {
        val++;
        count = 0;
        pos = 0;
      }      
    }
    
    System.out.println(val);
  }
}
*/