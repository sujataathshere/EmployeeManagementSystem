package com.employees.pojo;

import java.util.Date;

public class Employee {
	private int employeeId;
	private String name;
	private String address;
	private int gender;
	private double salary;
	private Date birthDate;
	public Employee() {
		
	}
	public Employee(int employeeId, String name, String address, int gender, double salary, Date birthDate) {

		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", salary=" + salary + ", birthDate=" + birthDate + "]";
	}
}
