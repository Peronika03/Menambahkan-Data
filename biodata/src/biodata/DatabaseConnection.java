package biodata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biodata", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            // Handle any errors
            ex.printStackTrace();
        }

        return connection;
    }
}
