import java.sql.*;

class Main
{
    public static void main(String args[])
     {
         try
             {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?useSSL=false","root","nnnn");
              Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

              ResultSetMetaData rsmd = rs.getMetaData();
              int numColumns = rsmd.getColumnCount();

              for(int i=1; i<=numColumns;i++)
              {
               String columnName = rsmd.getColumnName(i);
               System.out.println("columnName "+columnName);
              }
         }
         catch(ClassNotFoundException e)
         {
            System.out.println(e);
         }
         catch(SQLException e)
         {
            System.out.println(e);
         }
     }
}