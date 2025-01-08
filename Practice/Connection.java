import java.sql.*;

public class Connection {
    public static void main(String[] args) {

        String url = "";
        String uname = "";
        String pass = "";
        String sql = "";
        Class.forName(org.postgresql.Driver);
        Connection conn = DriverManager.getConnection(url, uname, pass);

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);

    }
}
