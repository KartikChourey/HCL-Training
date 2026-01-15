import java.sql.*;

public class DeleteStudents {
    public static void main(String[] args)throws Exception{
        Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "password"
        );
        Statement st=con.createStatement();
        st.executeUpdate(
            "DELETE FROM Students WHERE year_of_passing=2024 AND branch='Civil'"
        );
        System.out.println("Deleted");
    }
}
