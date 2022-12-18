package com.sujata.pojo;

import java.util.Date;

public class Employee {
	private int employee_Id;
	private String name;
	private String address;
	private int gender;
	private double salary;
	private Date birthDate;

	public Employee(int employee_Id, String name, String address, int gender, double salary, Date birthDate) {
		this.employee_Id = employee_Id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.salary = salary;
		this.birthDate = birthDate;
	}

	public Employee() {
	}

	public int getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
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
		return "Employee [employee_Id=" + employee_Id + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", salary=" + salary + ", birthDate=" + birthDate + "]";
	}

}
