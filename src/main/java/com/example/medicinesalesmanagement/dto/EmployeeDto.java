package com.example.medicinesalesmanagement.dto;

import java.time.LocalDateTime;

public class EmployeeDto {
    private Integer id_employee;
    private String name;
    private boolean gender;
    private String phoneNumber;
    private String address;
    private String userName;
    private String password;
    private double salary;
    private LocalDateTime dayOfWork;
    private int role;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer id_employee, String name, boolean gender, String phoneNumber, String address, String userName, String password, double salary, LocalDateTime dayOfWork, int role) {
        this.id_employee = id_employee;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.salary = salary;
        this.dayOfWork = dayOfWork;
        this.role = role;
    }

    public Integer getId_employee() {
        return id_employee;
    }

    public void setId_employee(Integer id_employee) {
        this.id_employee = id_employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDateTime getDayOfWork() {
        return dayOfWork;
    }

    public void setDayOfWork(LocalDateTime dayOfWork) {
        this.dayOfWork = dayOfWork;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
