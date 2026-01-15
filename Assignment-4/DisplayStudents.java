import java.sql.*;

public class DisplayStudents {
    public static void main(String[] args)throws Exception{
        Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "password"
        );
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(
            "SELECT * FROM Students WHERE semester=7 AND branch='EC'"
        );

        while(rs.next()){
            System.out.println(
                rs.getInt("id")+" "+
                rs.getString("name")+" "+
                rs.getDouble("percentage")
            );
        }
    }
}
