import java.sql.*;

class Main 
{
  public static void main(String args[]) 
  {
   int count=0;

   try
   {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?useSSL=false","root","nnnn");
      PreparedStatement pstmt=con.prepareStatement("UPDATE emp SET sal=? WHERE empno=?");
      pstmt.setDouble(1,85000.0);
      pstmt.setInt(2,7934);
      count=pstmt.executeUpdate();
      con.close();
      pstmt.close();
    }
    catch(ClassNotFoundException cne)
    {
         cne.printStackTrace(); 
    }
    catch(SQLException sqe)
    {
        sqe.printStackTrace(); 
    }

    System.out.println(count + " record/s updated!!!");
   }
}