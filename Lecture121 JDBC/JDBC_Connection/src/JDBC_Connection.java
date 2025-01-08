import org.w3c.dom.Text;

import java.sql.*;

public class JDBC_Connection {
    public static void main(String[] args) throws Exception {
        /*
         import package
         load Driver
         Register Driver
         Create Connection
         Create Statement
         execute statment
         process the result
         close
         */

        String url = "jdbc:postgresql://localhost:5432/Student120Last";
        String uname = "postgres";
        String pass = "Satara@123";
//        String sql = "insert into student values (?,?,?)";
        String sql = "select sname from student where sid = 1";



        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        Integer id = rs.getInt("sid");
        String name = rs.getString("sname");
//        int markr = rs.getInt("marks");
        System.out.println(id);
        System.out.println(name);



        con.close();

        System.out.println("Connection ");
    }
}
