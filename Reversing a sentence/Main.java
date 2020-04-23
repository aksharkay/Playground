import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
      s1 = s1 + " ";
      String s = "";
      int n1 = s1.length();
      int i,count=0,words=0;
      
      for(i=0;i<n1;i++)
      {
          if(s1.charAt(i) == ' ')
          {
              words++;
          }
      }
      
      String[] str_arr = new String[words];
      
      for(i=0;i<n1;i++)
      {
          if(s1.charAt(i) == ' ')
          {
              str_arr[count] = s;
              s = "";
              count++;
          }
          else
          {
              s = s + s1.charAt(i);
          }
      }

      /*for(i=0;i<n;i++)
      {
          System.out.println(str_arr[i]);
      }*/
       
       reverse_string(str_arr,words);
       
       for(i=0;i<words;i++)
       {
         if(i == words-1)
         {
           System.out.print(str_arr[i]);
         }
         else
         {
           System.out.print(str_arr[i]+" ");
         }
       }
  }
  
  public static void reverse_string(String[] str_arr, int words)
  {
      int i;
      String temp;
      
      for(i=0;i<words/2;i++)
      {
          temp = str_arr[i];
          str_arr[i] = str_arr[words-i-1];
          str_arr[words-i-1] = temp;
      }
  }
}



/*


    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      StringBuilder sb
    }
}*/