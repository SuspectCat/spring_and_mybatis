package com.pojo;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_id
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    private Integer departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_name
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    private String departmentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_description
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    private String departmentDescription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_id
     *
     * @return the value of department.department_id
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_id
     *
     * @param departmentId the value for department.department_id
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_name
     *
     * @return the value of department.department_name
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_name
     *
     * @param departmentName the value for department.department_name
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_description
     *
     * @return the value of department.department_description
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public String getDepartmentDescription() {
        return departmentDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_description
     *
     * @param departmentDescription the value for department.department_description
     *
     * @mbg.generated Thu Nov 11 11:37:17 CST 2021
     */
    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription == null ? null : departmentDescription.trim();
    }
}