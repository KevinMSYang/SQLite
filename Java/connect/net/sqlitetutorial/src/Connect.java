import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect 
{
	public static void connect()
	{
		Connection connect = null;
		try
		{
			String url = "jdbc:sqlite:/Users/kevinyang/Programming/SQLite/db/contacts.db";
			connect = DriverManager.getConnection(url);
			System.out.println("Connection to SQLite has been established");
		} catch (SQLException e)
		{
			System.out.println(e.getMessage());
		} finally
		{
			try
			{
				if (connect != null)
				{
					connect.close();
				}
			} catch (SQLException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
	public static void createNewTable()
	{
		
	}
	public static void main(String args[])
	{
		connect();
	}
}
