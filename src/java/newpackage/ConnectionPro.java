package newpackage;

import java.sql.*;


public class ConnectionPro {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nyoba_c","root",""); //create connection
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}

/*
package newpackage;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionPro {
    
    public static Connection getConnection()throws ClassNotFoundException, SQLException{
        // Note: Change the connection parameters accordingly.
     String hostName = "localhost";
     String dbName = "nyoba_c";
     String userName = "root";
     String password = "";
     return getConnection(hostName, dbName, userName, password);
     }
     
      public static Connection getConnection(String hostName, String dbName,
         String userName, String password) throws SQLException,
         ClassNotFoundException {
    
     Class.forName("com.mysql.jdbc.Driver");
  
     // URL Connection for MySQL:
     // Example: 
     // jdbc:mysql://localhost:3306/simplehr
     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
  
     Connection conn = DriverManager.getConnection(connectionURL, userName,
             password);
     return conn;
 }
}
*/