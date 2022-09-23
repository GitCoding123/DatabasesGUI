import java.sql.*;
/**
 * @author bgerk
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		MyFrame main = new MyFrame();
		
		
//		 DriverManager.registerDriver(new Hearing_Clinic.Driver());
		    // Connect to the database

//		    try {
//		    	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hearing_Clinic", "root", "Bmgerkens102094!");
//		    	System.out.println("Connected to database successfully.");
//		    
//		    	Statement stmt = conn.createStatement();
//		    	//String sql = "INSERT INTO Patient (First_Name, Last_Name, Street_Address, DOB, Gender) VALUES ()"
//		    	
//		    	String input = "INSERT INTO Patient (First_Name, Last_Name, Street_Address, DOB, Gender) VALUES ("
//		    										 + q.getfName() + ", " + q.getlName() + ", " + q.getStreet() + ", " + q.getDob() + ", " + q.getGen() + ");";
//		    	
//		    	//stmt.executeUpdate(INSERT INTO Patient (First_Name, Last_Name, Street_Address, DOB, Gender) VALUES (q.getfName(), ));
//		    	ResultSet rset = stmt.executeQuery("SHOW TABLES");
//		    	while (rset.next ()){
//		    		System.out.println(rset.getString(1));
//		    	}
//		    	
//		    }
//		    catch(SQLException e) {
//		    	System.out.println("Oops, ERROR!!!");
//		    	e.printStackTrace();
//		    }
		
		    	//MyFrame main = new MyFrame();
	}

}
