package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DB {
    private static Connection conn = null;
    private static Statement stmt = null;
    private static String dbURL;
    
    static void create() {
        try
        {
            dbURL = "jdbc:derby://localhost:1527/nsbm;user=nsbm;password=nsbm";
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn = DriverManager.getConnection(dbURL);
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    static int saveUpdateDelete(String query){
        int rows;
        try
        {
            create();
            stmt = conn.createStatement();
            rows=stmt.executeUpdate(query);
            stmt.close();
            return rows;
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
            return 0;
        }
        catch (Exception except)
        {
            except.printStackTrace();
            return 0;
        }
    }
    
    static ResultSet viewData(String query){
        ResultSet rs=null;
        try
        {
            create();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            return rs;
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
            return rs;
        }
        catch (Exception except)
        {
            except.printStackTrace();
            return rs;
        }
    }
}
