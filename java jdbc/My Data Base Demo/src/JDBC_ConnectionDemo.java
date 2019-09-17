import java.sql.*;


// http://www.ntu.edu.sg/home/ehchua/programming/sql/sampledatabases.html

//https://o7planning.org/en/10235/sample-mysql-database-for-learning-sql

public class JDBC_ConnectionDemo {
    public static void main(String[] args) throws SQLException {
        String url = "";
        String uName = "";
        String pass = "";
        String query = "";
        
        Statement st = null;
        ResultSet rs = null;
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("url","uName", "pass");
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(7));
            }
        } catch(Exception e){
            System.out.println("e");
        } finally{
             st.close();
             conn.close();
        }
        
    }
}
