package com.example.data_jpa.dao;


import com.example.data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> findAllByName(String name);

//	public List<Employee> findAllBySalaryBetween(int start, int end);
//
//	public List<Employee> findAllBySalaryBetweenAnd(int start, int end);
}
