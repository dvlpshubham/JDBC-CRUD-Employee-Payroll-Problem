package employeepayrolljdbc;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JDBCTest {
    Connection connection;
    Configuration config;
    Statements statement;

    @Before
    public void initialization() {
        Configuration configuration = new Configuration();
        Statements statements = new Statements(configuration.establishConnection());
    }

    /**
     * Test method to check if update by statement is successful.
     */
    @Test
    public void whenUpdatedUsingStatement_shouldReturnTrue() {
        statement.retrievePayroll();
        statement.updatePayroll();

        Assertions.assertEquals(statement.updatePayroll(), true);
    }

    /**
     * Test method to check if update by prepared statement is successful.
     */
    @Test
    public void whenUpdatedUsingPreparedStatement_shouldReturnTrue() {
        statement.retrievePayroll();
        statement.updatePayroll();

        Assertions.assertEquals(statement.updateByPreparedStatement(), true);
    }
}
