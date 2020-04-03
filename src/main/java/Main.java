import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        String url= "jdcb:mysql://localhost:3306/rentcar?autoReconnect=true&useSSl=false";
        String user = "root";
        String password = "myroot";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement myStmt = conn.createStatement();
            String sql = "select * from renctar.user";
            ResultSet rs = myStmt.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getString("nome"));
            }
        } catch(SQLException s){
            s.printStackTrace();
        }
    }
}
