import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Mariadb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		
		String drivermariadb = "org.mariadb.jdbc.Driver";// if DataBase MySQL -> drivermysql="com.mysql.jdbc.Driver";
		String username = "username";
		String password = "password";
		String dbname = "DataBasename";
		String urlmariadb = "jdbc:mariadb://localhost:3306/";//if DataBase MySQL urlMysql="jdbc:mysql://localhost:3306/";
		String sql;
		Statement stm = null;
		ResultSet rs = null;
		Class.forName(drivermariadb);
		Connection con = DriverManager.getConnection(urlmariadb + dbname, username, password);
		stm = con.createStatement();
		sql = "SHOW DATABASES;";
		rs = stm.executeQuery(sql); //Read DataBase
		while (rs.next()) {
		System.out.println(rs.getString("DATABASE"));
		 }
		rs.close();
		stm.close();
		con.close();
	}
}

