import java.util.Scanner;
class Main
{
 public static void main (String args[])
{  
 Scanner scr =new Scanner(System.in);
 int rows=0, colms=0;
 
 System.out.println("How many rows?");
 rows=scr.nextInt();

 System.out.println("How many columns?");
 colms=scr.nextInt();
 
 int x[] [] = new int[rows][colms];
 
for(int i=0; i<rows; i++)
{
 System.out.println("Enter the element of row"+(i+1));
 for(int j=0; j<colms; j++)
{
 System.out.println("Enter the element of column"+(j+1));
 x[i][j]=scr.nextInt();
}
System.out.println();
}

 for(int i=0; i<rows ;i++)
{
for(int j=0; j<colms ; j++)
{
System.out.print(x[i][j]+"   ");

}
System.out.println();
}
}
}


