import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int col_size = sc.nextInt();
	int mat1[][] = new int[row_size][col_size];
    int mat2[][] = new int[col_size][row_size];
    int i,j;
    
    for(i=0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        mat1[i][j] = sc.nextInt();
      }
    }
    
    for(i=0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        mat2[i][j] = mat1[j][i];
      }
    }
    
    for(i=0;i<row_size;i++)
    {
      for(j=0;j<col_size;j++)
      {
        System.out.print(mat2[i][j] + " ");
      }
      System.out.println();
    }
  }
}