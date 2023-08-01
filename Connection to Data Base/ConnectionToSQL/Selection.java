package ConnectionToSQL;
import java.sql.*;
public class Selection {
    static final String DataBaseURL = "jdbc:mysql://localhost";
    static final String username = "root";
    static final String password = "denis123denis123";

    public static void Execute(String query) {
        try (java.sql.Connection conn = DriverManager.getConnection(DataBaseURL, username, password)) {
            Statement statement = ((java.sql.Connection) conn).createStatement();
            ResultSet rs = statement.executeQuery(query);
            System.out.println("*******************");
            while (rs.next()) {
                System.out.println("ID: "+ rs.getInt("Course Number"));
                System.out.println("First Name: " + rs.getString("First Name"));
                System.out.println("SurName: " + rs.getString("SurName"));
                double mathGrade = rs.getDouble("Math Grade");
                double physicsGrade = rs.getDouble("Phycics Grade");
                double biologyGrade = rs.getDouble("Biology Grade");
                System.out.println("Average Grade: " + (mathGrade + physicsGrade + biologyGrade) / 3);
                System.out.println("*******************");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}