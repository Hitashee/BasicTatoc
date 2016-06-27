package basicTatoc;

import java.sql.Connection;
import java.sql.DriverManager;

class Database {
	static Connection con = null;
    public static String DB_URL = "jdbc:mysql://10.0.1.86:3306/tatoc";
    public static String DB_USER = "tatocuser";
    public static String DB_PASSWORD = "tatoc01";

	public void dbConnection() {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	        System.out.println("Database Coonection successful");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
