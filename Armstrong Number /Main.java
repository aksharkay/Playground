import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i,s=0,a,num=n;
      
      while(n>0)
      {
        a=n%10;
        s=s+(a*a*a);
        n=n/10;
      }
      
      if(num==s)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
}