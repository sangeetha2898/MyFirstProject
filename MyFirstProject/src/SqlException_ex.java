
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class SqlException_ex {
 
public static void main(String[] args) throws ClassNotFoundException {

         
String update_query = "update employee_details set email='martinL@gmail.com' where empNum1 = 10011"; 

Class.forName("oracle.jdbc.driver.OracleDriver");  
try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/pass123@localhost:1521:XE"))
{
Statement statemnt1 = conn.createStatement();
ResultSet rs1 =null;
statemnt1 = conn.createStatement();

}
catch(SQLException sqe)
{
System.out.println("Error Code = " + sqe.getErrorCode());
System.out.println("SQL state = " + sqe.getSQLState());
System.out.println("Message = " + sqe.getMessage());
System.out.println("printTrace /n");
sqe.printStackTrace();
}
}
}