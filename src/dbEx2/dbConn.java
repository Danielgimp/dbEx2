package dbEx2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConn {
 	
	 		static String url = "jdbc:mysql://127.0.0.1" + "?useSSL=false";        
	 		static String username = "root";
	 		static String password = "k7f9h5d6";        
	 		static String sql = "CREATE DATABASE IF NOT EXISTS DoctorQueue";

	 		private static Connection dbConnect() throws SQLException
	 		{
	 			Connection conn = DriverManager.getConnection(url, username, password);
	 			try (PreparedStatement stmt = conn.prepareStatement(sql))
	 			{
	 			stmt.execute();
	 			}
	 			catch (Exception e) 
	 			{	 				
	 				e.printStackTrace();
	 			}
				return conn;
	 		}
	 		
	 		public static void createDoctorTable(Doctor arr[])
	 		{
	 			String CREATE_TABLE_SQL="CREATE TABLE IF NOT EXISTS DoctorQueue.doctors ("
	                    + "doctor_id INT NOT NULL,"
	                    + "doctor_type VARCHAR(255) NOT NULL,"
	                    + "doctor_name VARCHAR(255) NOT NULL,"
	                    + "salary REAL NOT NULL,"
	                    + "PRIMARY KEY (doctor_id))"; 			
	 			
 		 		
	 			try {				 
	 				Connection conn = dbConnect();
	 				Statement stmt = conn.createStatement();
	 				stmt.executeUpdate(CREATE_TABLE_SQL);
	 	 			}
	 					catch (SQLException e)
	 					{
	 						e.printStackTrace();
	 					}
	 			
	 		for(int i=0;i<arr.length;i++)
	 		{
	 			String querry="INSERT INTO doctors " + "VALUES(?,?,?,?)";
	 			
	 			try (
	 	                Connection conn = dbConnect();
	 	                PreparedStatement statement = conn.prepareStatement(querry);)
	 				{        
	 	           	 	statement.setLong(i+1, arr[i].doctor_id);
	 	                statement.setString(i+2, arr[i].doctor_type);
	 	                statement.setString(i+3, arr[i].doctor_name);
	 	                statement.setDouble(i+4, arr[i].salary);
	 	                statement.addBatch();     
	 	        	}
	 					catch (SQLException ex) 
	 					{
	 	        				System.out.println(ex.getMessage());
	 					}
	 		}
	 		
	 	
	 		}

		
	 		
}
