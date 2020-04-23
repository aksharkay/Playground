import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int sum[] = new int[n/3];
    int i,j=0,s=0,ans=0;
    
    for(i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
      s = s + arr[i];
      if((i+1)%3==0)
      {
        sum[j] = s;
        s = 0;
        j++;
      }
    }
    
    for(i=0;i<n/3 - 1;i++)
    {
      if(sum[i]!=sum[i+1])
        ans++;
    }
    
    if(ans == 0)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}