package com.pojo;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_id
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    private Integer employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_name
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    private String employeeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_telephone
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    private String employeeTelephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_department
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    private Integer employeeDepartment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_id
     *
     * @return the value of employee.employee_id
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_id
     *
     * @param employeeId the value for employee.employee_id
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_name
     *
     * @return the value of employee.employee_name
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_name
     *
     * @param employeeName the value for employee.employee_name
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_telephone
     *
     * @return the value of employee.employee_telephone
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public String getEmployeeTelephone() {
        return employeeTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_telephone
     *
     * @param employeeTelephone the value for employee.employee_telephone
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public void setEmployeeTelephone(String employeeTelephone) {
        this.employeeTelephone = employeeTelephone == null ? null : employeeTelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_department
     *
     * @return the value of employee.employee_department
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public Integer getEmployeeDepartment() {
        return employeeDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_department
     *
     * @param employeeDepartment the value for employee.employee_department
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public void setEmployeeDepartment(Integer employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }
}