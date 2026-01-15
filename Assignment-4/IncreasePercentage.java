import java.sql.*;

public class IncreasePercentage {
    public static void main(String[] args)throws Exception{
        Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "password"
        );
        Statement st=con.createStatement();
        st.executeUpdate(
            "UPDATE Students SET percentage=percentage+5 WHERE branch='CSE'"
        );
        System.out.println("Updated");
    }
}
