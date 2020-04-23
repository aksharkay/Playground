import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i,zero=0,j=0;
      int arr[] = new int[n];
      int array[] = new int[n];
      
      for(i=0;i<n;i++)
        arr[i] = sc.nextInt();
      
      for(i=0;i<n;i++)
      {
        if(arr[i]==0)
            zero++;
      }
      
      int zeros[] = new int[zero];
      int nonzero[] = new int[n-zero];
      
      for(i=0;i<n;i++)
      {
          if(arr[i]!=0)
          {
            array[j] = arr[i];
            j++;
          }
      }
      
      for(i=0;i<n;i++)
        System.out.print(array[i]+" ");
    }
}