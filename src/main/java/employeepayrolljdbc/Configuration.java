package employeepayrolljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {
    /**
     * Final static Strings defined for Database URL, userName and Password.
     *
     * @author - Shubham Raj.
     */
    final static String URL = "jdbc:mysql://localhost:3306/EmployeePayroll?characterEncoding=utf8";
    final static String USER_NAME = "root";
    final static String PASSWORD = "root";

    /**
     * Method to establish connection to database.
     * Using Class.forName to load Database Driver for mysql.(Try catch to handle {@link ClassNotFoundException})
     * Created {@link Connection} object - connection.
     * Assigning value to connection using getConnection method from DriverManager Class by passing URL, USER_NAME and PASSWORD as arguments.
     * Try catch to handle run time exception interacting mySql Database
     *
     * @return - connection object to be used while trying to run different Statements.
     */
    public Connection establishConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
