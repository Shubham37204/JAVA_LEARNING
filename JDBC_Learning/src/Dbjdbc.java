import java.sql.*;

class dbjdbc {

    String url = "jdbc:mysql://localhost:3306/jdbc_learning";
    String username = "root";
    String password = "S@10hubham";


    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }


    public void CreateUser(Student student) {

        String sql =
                "INSERT INTO studentInfo (sname, age, scity) VALUES (?, ?, ?)";
        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCity());
            int res = ps.executeUpdate();
            if (res == 1) {
                System.out.println("User created successfully");
            } else {
                System.out.println("User creation failed");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }


    public void UpdateUser(Student student,int id) {

        String sql =
                "UPDATE studentInfo SET sname = ?, age = ?, scity = ? WHERE id = ?";
        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCity());
            ps.setInt(4, id);
            int res = ps.executeUpdate();
            if (res == 1) {
                System.out.println("User updated successfully");
            } else {
                System.out.println("User update failed");
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }


    public void DeleteUser(int id) {

        String sql =
                "DELETE FROM studentInfo WHERE id = ?";

        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            int res = ps.executeUpdate();

            if (res == 1) {
                System.out.println("User deleted successfully");
            } else {
                System.out.println("User deletion failed");
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }


    public void getUserById(int id) {

        String sql =
                "SELECT id, sname, age, scity FROM studentInfo WHERE id = ?";

        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    Student student = mapRow(rs);

                    System.out.println(student);

                } else {

                    System.out.println("Student not found");
                }
            }

        } catch (SQLException ex) {

            System.out.println("Database error: " + ex.getMessage());
        }
    }


    public void getUsers() {

        String sql =
                "SELECT id, sname, age, scity FROM studentInfo";
        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            while (rs.next()) {
                Student student = mapRow(rs);
                System.out.println(student);
            }
        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }
    }


    //public List<Student> getStudents() {
    //
    //    String sql = "SELECT id, sname, age, scity FROM studentInfo";
    //
    //    List<Student> studentList = new ArrayList<>();
    //
    //    try (
    //            Connection connection = getConnection();
    //            PreparedStatement preparedStatement =
    //                    connection.prepareStatement(sql);
    //            ResultSet resultSet =
    //                    preparedStatement.executeQuery()
    //    ) {
    //
    //        while (resultSet.next()) {
    //
    //            Student student = mapRow(resultSet);
    //
    //            studentList.add(student);
    //        }
    //
    //    } catch (SQLException ex) {
    //        System.out.println("Database error: " + ex.getMessage());
    //    }
    //
    //    return studentList;
    //}

    private Student mapRow(ResultSet rs) throws SQLException {

        Student student = new Student();

        student.setId(rs.getInt("id"));
        student.setName(rs.getString("sname"));
        student.setAge(rs.getInt("age"));
        student.setCity(rs.getString("scity"));

        return student;
    }
}