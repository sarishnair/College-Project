package Login;
import java.sql.*;
import javax.swing.*;

public class connection {
	Connection con=null;
	public static Connection dbconnector(){
		try{
			Class.forName("org.sqlite.JDBC");
			Connection con =DriverManager.getConnection("jdbc:sqlite:C:\\AST\\Employee.sqlite");
			
			return con;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	

}
