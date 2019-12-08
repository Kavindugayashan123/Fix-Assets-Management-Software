
package MyClasses;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Database {
    
    
    Connection con;
    Statement st;
    ResultSet rs;
    public void connection()
    {
        String dbpath = "jdbc:mysql://localhost:3306/fixed_asset?useSSL=false";
        
        try{            
            con = DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR! Can not connect to database");   
        } 
    }
    
    public ResultSet selectQuery(String sql)
    {
        try{         
          st = con.createStatement();
          rs = st.executeQuery(sql);
          
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR! query not successful " + e.getMessage() );   
        }        
        return rs;
    }
    
    public int updateQuery(String sql)
    {
        int i = 0;
     
        try{    
          st = con.createStatement();
          i = st.executeUpdate(sql);
         
          
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"SQL ERROR! Action not successful " + e.getMessage());   
        }  
        return i;
        
        
    }
    
    public void closeConnection()
    {
        try
        {
            con.close();
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"SQL ERROR! close connection not successful");    
        }
    }
    
}
