import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionTest {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );
            if(con!=null)
                System.out.println("Connection Successful");
        }catch(Exception e){
            System.out.println("Unable to connect");
        }
    }
}
