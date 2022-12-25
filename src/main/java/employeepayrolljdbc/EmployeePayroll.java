package employeepayrolljdbc;

/**
 * POJO Class for EmployeePayroll Entity.
 *
 * @author - Shubham Raj.
 */
public class EmployeePayroll {
    int id;
    String name;
    String startDate;
    String gender;
    int phone;
    String address;
    String department;
    double salary;
    double basicPay;
    double deductions;
    double taxablePay;
    double incomeTax;
    double netPay;

    /**
     * Constructor
     *
     * @param id         - Employee ID.
     * @param name       - Employee Name.
     * @param salary     - Employee Salary.
     * @param startDate  - Employee StartDate.
     * @param gender     - Employee Gender.
     * @param phone      - Employee Phone Number.
     * @param address    - Employee Address.
     * @param department - Employee Department.
     * @param basicPay   - Employee Basic Pay.
     * @param deductions - Deductions in salary.
     * @param taxablePay - Taxable Pay.
     * @param incomeTax  - Income Tax.
     * @param netPay     - Net Pay.
     */
    public EmployeePayroll(int id, String name, double salary, String startDate, String gender, int phone, String address, String department, double basicPay, double deductions, double taxablePay, double incomeTax, double netPay) {
        super();
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.department = department;
        this.salary = salary;
        this.basicPay = basicPay;
        this.deductions = deductions;
        this.taxablePay = taxablePay;
        this.incomeTax = incomeTax;
        this.netPay = netPay;
    }

    /**
     * To String method to return ArrayList to Strings.
     */
    @Override
    public String toString() {
        return "EmployeePayroll{" + "id=" + id + ", name='" + name + '\'' + ", startDate='" + startDate + '\'' + ", gender='" + gender + '\'' + ", phone=" + phone + ", address='" + address + '\'' + ", department='" + department + '\'' + ", salary=" + salary + ", basicPay=" + basicPay + ", deductions=" + deductions + ", taxablePay=" + taxablePay + ", incomeTax=" + incomeTax + ", netPay=" + netPay + '}';
    }
}
