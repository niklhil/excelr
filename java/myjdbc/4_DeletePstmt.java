import java.sql.*;
import java.util.Scanner;

class Main 
{
   public static void main (String args[]) 
   {
       int eno=0;
       int count=0;

       Scanner in = new Scanner(System.in);
              
       System.out.println("Enter the employee Id : ");
       eno = in.nextInt();
      
       try 
       {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","nnnn");
             PreparedStatement pstmt= con.prepareStatement("DELETE FROM emp WHERE empno=?");
             pstmt.setInt(1,eno);
             count=pstmt.executeUpdate();
             con.close();  
             pstmt.close();
        }
        catch(ClassNotFoundException e)
        {
           e.printStackTrace();
        }
        catch(SQLException e)
        {
          e.printStackTrace();   
        }

        if(count > 0)
        {
           System.out.println(count + " record deleted successfully");
        }
        else
        {
           System.out.println(" Record not found!!");
        }
    }
}