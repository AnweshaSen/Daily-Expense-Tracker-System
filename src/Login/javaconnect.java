package Login;
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    Connection con;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","raja1997");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        return null;
            
    }
}