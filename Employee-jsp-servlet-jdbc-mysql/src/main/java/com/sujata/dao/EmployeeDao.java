package com.sujata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.pojo.Employee;

public class EmployeeDao implements AutoCloseable {
	private Connection connection;

	public List<Employee> getEmployees() throws Exception {
		String sql = "SELECT id, name, address, gender, salary, birth from employees";
		List<Employee> employees = new ArrayList<Employee>();
		try (PreparedStatement selectStatement = connection.prepareStatement(sql)) {
			try (ResultSet rs = selectStatement.executeQuery()) {
				while (rs.next()) {
					employees.add(new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("address"),
							rs.getInt("gender"), rs.getDouble("salary"), rs.getDate("birth")));
				}
			}
		}
		return employees;
	}

	@Override
	public void close() throws Exception {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException cause) {
			throw new RuntimeException(cause);
		}
	}

}
