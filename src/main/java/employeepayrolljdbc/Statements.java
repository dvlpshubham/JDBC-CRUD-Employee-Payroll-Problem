package employeepayrolljdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Class containing methods to run specific statements.
 *
 * @author - Shubham Raj.
 */
public class Statements {
    /**
     * RETRIEVE_QUERY - String containing query  to retrieve table rows.
     * UPDATE_QUERY - String containing query to update salary.
     * connection - Instance of Connection Interface.
     * payrollArrayList - ArrayList of EmployeePayroll Type.
     */
    public final static String RETRIEVE_QUERY = "SELECT * from employee_payroll";
    public final static String UPDATE_QUERY = "UPDATE employee_payroll SET Salary = 3000000 WHERE name = 'Shubham'";
    Connection connection;
    ArrayList<EmployeePayroll> payrollArrayList;

    /**
     * Constructor
     *
     * @param connection - connection object.
     */
    public Statements(Connection connection) {
        this.connection = connection;
    }

    /**
     * Method to read the database and display in console.
     * Initialized payrollArrayList using getEmployeeDB method from EmployeeDatabase Class.
     * created a Statement object and initialized in try block using createStatement method - statement.
     * Defined ResultSet object using executeQuery on statement.
     * While resultSet.next has value. employeePayroll object will have all column values for each row.
     * Adding the employeePayroll object to payrollArrayList.
     * Printing the arrayList.
     */
    public void retrievePayroll() {

        payrollArrayList = EmployeeDatabase.getEmployeeDB();
        Statement statement;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(RETRIEVE_QUERY);

            while (resultSet.next()) {
                EmployeePayroll employeePayroll = new EmployeePayroll(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7), resultSet.getString(8), resultSet.getDouble(9), resultSet.getDouble(10), resultSet.getDouble(11), resultSet.getDouble(12), resultSet.getDouble(13));
                payrollArrayList.add(employeePayroll);
                System.out.println(employeePayroll);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to read the database and display in console.
     * Initialized payrollArrayList using getEmployeeDB method from EmployeeDatabase Class.
     * created a Statement object and initialized in try block using createStatement method - statement.
     * executing statement using execute method with UPDATE_QUERY as param.
     */
    public void updatePayroll() {

        payrollArrayList = EmployeeDatabase.getEmployeeDB();
        Statement statement;

        try {
            statement = connection.createStatement();
            statement.execute(UPDATE_QUERY);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}