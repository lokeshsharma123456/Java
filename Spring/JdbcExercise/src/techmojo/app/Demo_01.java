package techmojo.app;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:derby:memory:demoDb;create=true";
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con = DriverManager.getConnection(url);
			String sql1 = "create table student("
					+ "id int, "
					+ "name varchar(40), "
					+ "email varchar(40))";
			String sql2 = "insert into student values(101, "
					+ "'Lokesh', "
					+ "'lokesh@gmail.com')";
			
			java.sql.Statement st = con.createStatement();
			st.execute(sql1);System.out.println("Table created susssfully");
			st.execute(sql2);
			System.out.println("Inserted sussessfully:");
					
			con.close();
					
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}


}
}
