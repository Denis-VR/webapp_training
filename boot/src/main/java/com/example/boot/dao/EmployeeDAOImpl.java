package com.example.boot.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.boot.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> getAllEmployees() {
		Query query = entityManager.createQuery("from Employee");

		return (List<Employee>) query.getResultList();
	}

	@Override
	public void saveEmployee(Employee employee) {
		Employee newEmployee = entityManager.merge(employee);
		employee.setId(newEmployee.getId());
	}

	@Override
	public Employee getEmployee(int id) {
		return entityManager.find(Employee.class, id);
	}

	@Override
	public void deleteEmployee(int id) {
		Query query = entityManager.createQuery("delete from Employee where id =:employeeId");
		query.setParameter("employeeId", id);
		query.executeUpdate();
	}
}
