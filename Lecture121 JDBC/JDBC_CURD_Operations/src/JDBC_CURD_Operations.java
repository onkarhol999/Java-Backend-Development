import java.sql.*;

public class JDBC_CURD_Operations {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/Student120Last";
        String uname = "postgres";
        String pass = "Satara@123";
//        Insert
//        String sql = "insert into student values(5,'Prajwal',89)";
//         Update
//        String sql = "UPDATE student SET sname = 'Jolly' WHERE sid = 5";
//        Delete
//        String sql = "delete from student where sid=5";
        // Load the PostgreSQL driver
        Class.forName("org.postgresql.Driver");
        // Establish the connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");
        // Execute the query
        Statement st = con.createStatement();
//        Insert in Database
        boolean status = st.execute(sql);
        System.out.println(status);




//        ResultSet rs = st.executeQuery(sql);
        // Get metadata to dynamically handle columns
//        ResultSetMetaData metaData = rs.getMetaData();
//        int columnCount = metaData.getColumnCount();
//        System.out.println("Number of columns: " + columnCount);
        // Print column names
//        for (int i = 1; i <= columnCount; i++) {
//            System.out.print(metaData.getColumnName(i) + "\t");
//        }
//        System.out.println();
        // Print all rows dynamically
//        while (rs.next()) {
//            for (int i = 1; i <= columnCount; i++) {
//                System.out.print(rs.getObject(i) + "\t");
//            }
//            System.out.println();
//        }

        // Close the connection
        con.close();
        System.out.println("Connection Closed");
    }
}
