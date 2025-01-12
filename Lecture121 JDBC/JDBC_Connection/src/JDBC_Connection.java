import org.w3c.dom.Text;

//Step 1 Import Package
import java.sql.*;

public class JDBC_Connection {
        public static void main(String[] args) throws Exception {
                /*
                 * import package
                 * load Driver
                 * Register Driver
                 * Create Connection
                 * Create Statement
                 * execute statment
                 * process the result
                 * close
                 */
                String url = "jdbc:postgresql://localhost:5432/Student120Last";
                String uname = "postgres";
                String pass = "Satara@123";
                String sql = "select sname from student where sid = 1";
                // Step 2 = Load Driver Step 3 = Register Driver
                Class.forName("org.postgresql.Driver");
                // Step 4 = Create Connection
                Connection con = DriverManager.getConnection(url, uname, pass);
                System.out.println("Connection Establish");
                // Step 5 = Create Statement
                Statement st = con.createStatement();
                // Step 6 = Execute Statement
                ResultSet rs = st.executeQuery(sql);
                rs.next();
                String name = rs.getString("sname");
                System.out.println(name);
                // Step 7 = Close
                con.close();
                System.out.println("Connection Closed");
        }
}
