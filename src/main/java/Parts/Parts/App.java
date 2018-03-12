package Parts.Parts;
import java.io.BufferedReader;
import java.sql.SQLException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 

{
	static Scanner s = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Connection connection = null;
	
	

    public static void main( String[] args ) throws SQLException
    {
    	/*DataAccess DA = null;
		try {
			DA = new DataAccess();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


    	String connectionUrl = "jdbc:sqlserver://localhost:8080;databaseName=JavaBootCamp7;user=sa;password=1234";
    	
*/
    	String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=JavaBootCamp7;user=sa;password=1";

		try {
			// Load SQL Server JDBC driver and establish connection.
			System.out.print("Connecting to SQL Server ... ");
			try (Connection connection = DriverManager.getConnection(connectionUrl)) {
				System.out.println("Done.");
			}
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
    	try {
			// Load SQL Server JDBC driver and establish connection.
			
			System.out.println("1-Get Suppliers with green parts ");
			System.out.println("2-Get the most expensive place that sells both green and red parts");
			System.out.println("3-Edit values");
			System.out.println("4-Update a price by five");
			System.out.println("5-Remove Supplier");
			System.out.println("5-Enter a personalized query");
			System.out.println("6-Exit");

			
			
			int input;
			
			  try {
		        	if(s.hasNextInt())
		        	{
		        		input = s.nextInt();


      	
      	
      	if(input == 1)	        		
      	{   
      		          
            String query = "Select * from first";
            try (Statement statement = connection.createStatement()) {
				statement.executeUpdate(query);
				System.out.println("Done.");
			}      	        	
      	}
      	else  if (input == 2)
      	{
      		String query = "Select * from second";
      	  try (Statement statement = connection.createStatement()) {
				statement.executeUpdate(query);
				System.out.println("Done.");
			}      	        	      		
      	}
      	
      	else if(input == 3)
      	{
      		
      			        	
  		}
      	
      	else if(input==4)
      	{
      		
      	}
      	
      	else if(input==5)
      	{
      		System.out.println("input your query");
      		String query = br.readLine();      		
      	  try (Statement statement = connection.createStatement()) {
				statement.executeUpdate(query);
				System.out.println("Done.");
			}      	        
      	}
      	
      	else if(input==6)
      	{
      		System.out.println("Goodbye!");
		
      	}
      	
      	else 
      	{
      		System.out.println("input a valid option");

      	}
		        	}
			  }
			  catch(InputMismatchException e)
			  {
		      	System.out.println("Only numbers");

			  } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	finally 
    	{
    		
    	}
    	}
    
    }

      
    
    	