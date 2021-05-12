package com.example.data_jpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee { //TODO добавить валидацию

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;

	@Column(name = "department")
	private String department;

	@Column(name = "salary")
	private int salary;

	public Employee(String name, String surname, String department, int salary) {
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.salary = salary;
	}
}
