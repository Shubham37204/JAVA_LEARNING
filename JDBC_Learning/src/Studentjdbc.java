import java.sql.*;

//basic way to connect to DB
class Studentjdbc {

    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/jdbc_learning";
    String username = "root";
    String password = "S@10hubham";

    public void executeQuery(String sql) {
        try {
            conn = DriverManager.getConnection(url, username, password);

            Statement st = conn.createStatement();

            int res = st.executeUpdate(sql);

            if (res == 1) {
                System.out.println("success");
            } else {
                System.out.println("failed");
            }

            conn.close();

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public void CreateUser() {
        String sql = "INSERT INTO studentInfo VALUES (1, 'Shubham', 24, 'Ranchi')";
        executeQuery(sql);
    }

    public void UpdateUser() {
        String sql = "UPDATE studentInfo SET scity='Pune' WHERE id=1";
        executeQuery(sql);
    }

    public void DeleteUser() {
        String sql = "DELETE FROM studentInfo WHERE id=1";
        executeQuery(sql);
    }

    public void GetUserBasic() {

        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String username = "root";
        String password = "S@10hubham";

        try {
            Connection conn =
                    DriverManager.getConnection(url, username, password);

            Statement st = conn.createStatement();

            String sql = "SELECT id,sname,age,scity FROM studentInfo";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("sname");
                int age = rs.getInt("age");
                String city = rs.getString("scity");
                System.out.println(
                        id + " " + name + " " + age + " " + city
                );
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}


