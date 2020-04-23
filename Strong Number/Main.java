import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i,s=0,n=num,a,f=1;
      
      while(n>0)
      {
        a=n%10;
        for(i=1;i<=a;i++)
        {
          f=f*i;
        }
        s=s+f;
        f=1;
        n=n/10;
      }
      
      if(num==s)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}