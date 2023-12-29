/**
 * Step 1 -> import (java.sql.*)
 */
import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /**
         * 7-STEPS in JDBC:
         * Step 1 -> import package -> (java.sql.*)
         * Step 2 -> load and register -> (Not needed on or after JDBC 4 version)
         * Step 3 -> create connection
         * Step 4 -> create statement
         * Step 5 -> execute statement
         * Step 6 -> precess the results
         * Step 7 -> close
         */

        /**
         * Step 2 -> load and register -> NOT NEEDED -> Internally it's done automatically.
         */
        Class.forName("org.postgresql.Driver");

        // SQL Connection Parameters
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "0000";

        /**
         * Step 3 -> Create a Connection
         */
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("DB Connection Established!");

        /**
         * Step 4 -> Create a Statement
         */
//        String sql = "SELECT * FROM student"; // SELECT QUERY
//        String sql = "INSERT INTO student VALUES (5, 'Monkey D. Luffy', 48)"; // INSERT QUERY
//        String sql = "UPDATE student SET sname = 'Goku' WHERE sid = 5"; // UPDATE QUERY
//        String sql = "DELETE FROM student WHERE sid = 5"; // DELETE QUERY
        /**
         * Step 5 -> Execute a Statement
         * Step 6 -> Process the results
         */
        //ResultSet rs = st.executeQuery(sql);
        /**
         * Step[5, 6] -> Test-1
         * (Fetch-Data)
         */
        /**
         * Below one line of code will show if the query gives any value or not.
         */
//        System.out.println(rs.next());
        /**
         * Step[5, 6] -> Test-2
         * (Fetch-Data)
         */
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of the studnet : " + name);
        /**
         * Step[5, 6] -> Test-3
         * (Fetch-Data)
         */
//         while (rs.next()) {
//             System.out.print(rs.getInt(1) + " - ");
//             System.out.print(rs.getString(2) + " - ");
//             System.out.println(rs.getInt(3));
//         }
        /**
         * Prepared-Statement
         * How to declare a Prepared-Statement
         */
        int sid = 5;
        String sname = "Goku";
        int marks = 99;
        String sql = "INSERT INTO student VALUES (?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, sid);
        pst.setString(2, sname);
        pst.setInt(3, marks);


        /**
         * Step[5, 6] -> Test-1
         * (INSERT DATA)
         * SQL Statement for Insert data has been provided in step-4.
         */
//        boolean status  = st.execute(sql);
        pst.execute();
        /**
         * Step 7 -> Close
         */
        con.close();
        System.out.println("DB Connection CLOSED!");
    }
}
