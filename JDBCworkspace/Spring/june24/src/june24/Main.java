package june24;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
		public static void main(String[] args) throws Exception
		{
			String url="jdbc:mysql://localhost:3306/db3";
			String un="root";
			String pwd="root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded sucess");
			//DriverManager.re
			 DriverManager.getConnection(url,un,pwd);
				System.out.println("connection is esterblished");

		}
}
     