import java.sql.*;
import java.util.Scanner;
class main{
public static void main(String args[])
{
int eno=0;
int count=0;
 Scanner in=new Scanner(System.in);
System.out.println("Enter the employee id:");
eno=in.nextInt();

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:musql://localhost:3306/db3","root","root");
PreparedStatement pstmt=con.prepareStatement("DELETE FROM student WHERE rno=? ");
pstmt.setInt(1,rno);
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

if(count>0)
{
System.out.println(count+"record deleted successfully");
}
else
{
System.out.println("record not found");
}
}
}
