
// import the java.sql package to use JDBC
import java.sql.*;

public class JDBC
{
  public static void main (String args [])
       throws SQLException
  {
    // Load the JDBC driver
	  
	 
   DriverManager.registerDriver(new Hearing_Clinic.Driver());
    // Connect to the database

    try {
    	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hearing_Clinic", "username", "password");
    	System.out.println("Connected to database successfully.");
    
    	Statement stmt = conn.createStatement();
    
    	ResultSet rset = stmt.executeQuery("SHOW TABLES");
    	while (rset.next ()){
    		System.out.println(rset.getString(1));
    	}
    	
    }
    catch(SQLException e) {
    	System.out.println("Oops, ERROR!!!");
    	e.printStackTrace();
    }

        
//Uncomment below if you are using MySQL, provide 
//name of your database, username and password

//("jdbc:mysql://localhost:3306/hearing_clinic","username", "password"); 
    // Create a Statement

    // Select the table names from the user_tables
  
  //Uncomment below if you are using MySQL
    
    //Iterate through the result and print out the table names
//    while (rset.next ()){
//      System.out.println(rset.getString(1));
//  }
  }
  
// public void savePatientInfo() throws SQLException {
//	 try {
//	    	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hearing_Clinic", "root", "Bmgerkens102094!");
//	    	System.out.println("Connected to database successfully.");
//	    
//	    	Statement stmt = conn.createStatement();
//	    
//	    	ResultSet rset = stmt.executeQuery("SHOW TABLES");
//	    	while (rset.next ()){
//	    		System.out.println(rset.getString(1));
//	    	}
//	    	
//	    }
//	    catch(SQLException e) {
//	    	System.out.println("Oops, ERROR!!!");
//	    	e.printStackTrace();
//	    }
// }
// 
// public void editPatientInfo() throws SQLException {
//	 try {
//	    	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hearing_Clinic", "root", "Bmgerkens102094!");
//	    	System.out.println("Connected to database successfully.");
//	    
//	    	Statement stmt = conn.createStatement();
//	    
//	    	ResultSet rset = stmt.executeQuery("SHOW * FROM Patients");
//	    	while (rset.next ()){
//	    		System.out.println(rset.getString(1));
//	    	}
//	    	
//	    }
//	    catch(SQLException e) {
//	    	System.out.println("Oops, ERROR!!!");
//	    	e.printStackTrace();
//	    }
// }
}