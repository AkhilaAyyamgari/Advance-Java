package prepared;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Prepared {
	 static Connection connection=null;
	
public static void main(String[] args) {
	getDatabaseConnection();
	//insertUser();
	deleteUser();
}

static void getDatabaseConnection(){
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform", "root", "Password@123");  
	}
catch(Exception e) {
	System.out.println(e);	
}
}
static void insertUser() {
	try {
	PreparedStatement pstmt = connection.prepareStatement("insert into users values(?,?,?)");	
	pstmt.setInt(1, 8);
	pstmt.setString(2, "Dhriti");
	pstmt.setString(3, "driti123");
	pstmt.executeUpdate();
	System.out.println("done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
static void deleteUser() {
	try {
		   PreparedStatement pstmt1 = connection.prepareStatement("delete from users where userId=?");
		   pstmt1.setInt(1, 6);
		   pstmt1.executeUpdate();
		System.out.println("Deletion done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}

