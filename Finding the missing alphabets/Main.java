import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      	str = str.toLowerCase();
        
        int i,j,n,pos=97,count=0;
        n = str.length();
        int arr[] = new int[26];
        char let[] = new char[26];
        
        for(i=0;i<26;i++)
        {
            arr[i] = 0;
            let[i] = (char)pos;
          	//System.out.print(let[i]+" ");
            pos++;
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<26;j++)
            {
                if(str.charAt(i) == let[j])
                {
                    arr[j]++;
                    break;
                }
            }
        }
        
        for(i=0;i<26;i++)
        {
            if(arr[i] == 0)
                System.out.print((char)(i+97)+" ");
        }
        
    }
}