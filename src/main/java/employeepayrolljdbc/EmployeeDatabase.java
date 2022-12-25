package employeepayrolljdbc;

import java.util.ArrayList;

/**
 * Class containing ArrayList of EmployeePayroll Type - employeeDB. & method to return the same ArrayList.
 *
 * @author - Shubham Raj.
 */
public class EmployeeDatabase {
    /**
     * Arraylist of EmployeePayroll Type - employeeDB.
     */
    static ArrayList<EmployeePayroll> employeeDB = new ArrayList<>();

    /**
     * Method to getEmployeeDB.
     *
     * @return - employeeDB.
     */
    public static ArrayList<EmployeePayroll> getEmployeeDB() {
        return employeeDB;
    }
}

