package Parts.Parts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccess {
	private java.sql.Connection con;
	
    public DataAccess() throws ClassNotFoundException, SQLException
    {
		String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=JavaBootCamp7;user=sa;password=1234";

    	try {
    		// Load SQL Server JDBC driver and establish connection.
    		System.out.print("Connecting to SQL Server ... ");
    		try (Connection connection = DriverManager.getConnection(connectionString)) {
    			System.out.println("Done.");
    		}
    	} catch (Exception e) {
    		System.out.println();
    		e.printStackTrace();
    }
    
            
    }
    public ResultSet query(String query) throws SQLException {
        ResultSet rs;
        Statement stmt = con.createStatement();
        rs = stmt.executeQuery(query);
        return rs;
    }
    
    }
    
