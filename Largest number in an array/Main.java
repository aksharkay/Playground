import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int max=0,i;
    for(i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
      if(arr[i]>arr[max])
        max=i;
    }
    System.out.println(arr[max]);
  }
}