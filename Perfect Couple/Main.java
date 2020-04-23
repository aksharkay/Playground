import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int i,j;
      for(i=0;i<n;i++)
        arr[i] = sc.nextInt();
      
      int val = sc.nextInt();
      
      for(i=0;i<n;i++)
      {
        for(j=i;j<n;j++)
        {
            if(arr[i]+arr[j] == val)
            {
              System.out.print(arr[i]+", "+arr[j]);
              System.out.print("\n");
            }
          }
        }
    }
}