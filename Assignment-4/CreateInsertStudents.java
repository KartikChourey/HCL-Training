import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateInsertStudents {
    public static void main(String[] args)throws Exception{
        Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "password"
        );
        Statement st=con.createStatement();

        String table="CREATE TABLE IF NOT EXISTS Students("+
                "id INT PRIMARY KEY,"+
                "name VARCHAR(50),"+
                "branch VARCHAR(20),"+
                "percentage DOUBLE,"+
                "semester INT,"+
                "year_of_passing INT)";

        st.execute(table);

        String insert="INSERT INTO Students VALUES"+
                "(1,'Amit','CSE',75,7,2025),"+
                "(2,'Ravi','Civil',70,6,2024),"+
                "(3,'Neha','EC',80,7,2025)";

        st.executeUpdate(insert);
        System.out.println("Records Inserted");
    }
}
