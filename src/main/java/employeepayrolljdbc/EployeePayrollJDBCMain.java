package employeepayrolljdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class containing logic to establish mysql database connection.
 */
public class EployeePayrollJDBCMain {



    /**
     * Main method.
     * Created Configuration object - configuration.
     * Created Statements object using configuration.establishConnection method(returns connection) - statements
     * Calling retrievePayroll method for statements object. To print Table rows to console.
     */
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        Statements statements = new Statements(configuration.establishConnection());
        statements.retrievePayroll();

    }
}