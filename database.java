package electricity.biling.system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    Connection connection;
    Statement statement;

    database() {
        try {
            String url = "jdbc:mysql://localhost:3306/bille_system";
            String username = "root";
            String password = "24March2003";

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
