package com.sujata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.pojo.Employee;
import com.sujata.util.DBUtil;

public class EmployeeDao implements AutoCloseable {
	private Connection connection;

	public EmployeeDao() throws Exception {
		this.connection = DBUtil.getConnection();
	}

//	SELECT
	public List<Employee> getEmployees() throws Exception {
		System.out.println("EmployeeDao : getEmployees()");
		String sql = "SELECT EmployeeId, Name, Address, Gender, Salary, BirthDate from Employee";
		List<Employee> employees = new ArrayList<Employee>();
		try (PreparedStatement selectStatement = connection.prepareStatement(sql)) {
			try (ResultSet rs = selectStatement.executeQuery()) {
				while (rs.next()) {
					employees.add(new Employee(rs.getInt("EmployeeId"), rs.getString("Name"), rs.getString("Address"),
							rs.getInt("Gender"), rs.getDouble("Salary"), rs.getDate("BirthDate")));
				}
			}
		}
		return employees;
	}

//	DELETE
	public int delete(int id) throws Exception {
		System.out.println("EmployeeDao : delete()");
		String sql = "DELETE FROM Employee WHERE EmployeeId = ?";
		try (PreparedStatement updateStatement = connection.prepareStatement(sql)) {
			updateStatement.setInt(1, id);
			return updateStatement.executeUpdate();
		}
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
