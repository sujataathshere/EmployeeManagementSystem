package com.sujata.beans;

import java.util.ArrayList;
import java.util.List;

import com.sujata.dao.EmployeeDao;
import com.sujata.pojo.Employee;

public class EmployeeListBean {
	private List<Employee> employeeList;
	private int id;
	private boolean success;

	public EmployeeListBean() {
		this.employeeList = new ArrayList<Employee>();
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void fetchEmployees() {
		System.out.println("EmployeeListBean : fetchEmployees()");
		try (EmployeeDao dao = new EmployeeDao()) {

			this.employeeList = dao.getEmployees();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void delete() {
		System.out.println("EmployeeListBean : delete()");
		try (EmployeeDao dao = new EmployeeDao()) {
			int count = dao.delete(this.id);
			this.success = (count == 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
