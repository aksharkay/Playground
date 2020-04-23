import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,ei1=-1,ei2=-1;
    int arr[] = new int[n];
    for(i=0;i<n;i++)
      arr[i] = sc.nextInt();
    int ele1 = sc.nextInt();
    int ele2 = sc.nextInt();
    
    for(i=0;i<n;i++)
    {
      if(arr[i] == ele1)
        ei1 = i;
      if(arr[i] == ele2)
        ei2 = i;
     }
    
  System.out.println(ei1);
  System.out.println(ei2);
  }
}