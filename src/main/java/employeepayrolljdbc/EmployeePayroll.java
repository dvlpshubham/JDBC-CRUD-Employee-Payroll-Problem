package employeepayrolljdbc;

/**
 * POJO Class for EmployeePayroll Entity.
 *
 * @author - Shubham Raj
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getTaxablePay() {
        return taxablePay;
    }

    public void setTaxablePay(double taxablePay) {
        this.taxablePay = taxablePay;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
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