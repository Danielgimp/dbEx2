package dbEx2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbConn {
 	
	 		String url = "jdbc:mysql://127.0.0.1" + "?useSSL=false";        
	 		String username = "root";
	 		String password = "k7f9h5d6";        
	 		String sql = "CREATE DATABASE IF NOT EXISTS DoctorQueue";

	 		dbConn()
	 		{
	 			try (Connection conn = DriverManager.getConnection(url, username, password);
	 					PreparedStatement stmt = conn.prepareStatement(sql))
	 			{
	 			stmt.execute();
	 			}
	 			catch (Exception e) 
	 			{	 				
	 				e.printStackTrace();
	 			}
	 		}
	 		
	 		
	 	
}
