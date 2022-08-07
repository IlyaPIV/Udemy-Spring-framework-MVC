package com.udemy.spring.mvc.beans;

import com.udemy.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, max = 30, message = "2 <= name size <= 30")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 300, message = "must be greater than 299")
    @Max(value = 2000, message = "must be less that 2001")
    private int salary;
    private String department;
    /*
    * option
     */
    private Map<String, String> departments;

    private String carBrand;
    /*
     * option
     */
    private Map<String, String> carBrands;

    private String[] languages;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please user pattern XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "abc.com", message = "email should be ended with abc.com")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("MB", "Mercedes-Benz");
        carBrands.put("Audi", "Audi");
        carBrands.put("BMW", "BMW");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    /*
    * option
     */
    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
