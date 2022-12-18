package com.sujata.beans;

import java.util.List;

import com.sujata.dao.EmployeeDao;
import com.sujata.pojo.Employee;

public class EmployeeListBean {
	private List<Employee> employeeList;

	public EmployeeListBean(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public void fetchEmployees() {
		try (EmployeeDao dao = new EmployeeDao()) {
			this.employeeList = dao.getEmployees();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
