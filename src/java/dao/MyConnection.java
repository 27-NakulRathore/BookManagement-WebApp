package dao;
import model.*;
import java.sql.*;
public class MyConnection 
{
    
    static 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        }
    }
   public static Connection MygetConnection() throws SQLException
   {
       Connection con=null;
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online", "root", "root");
        return con;
   }
}   