package com.example.boot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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

	@Size(max = 15)
	@NotBlank
	@Column(name = "name")
	private String name;

	@Size(max = 25)
	@NotBlank
	@Column(name = "surname")
	private String surname;

	@Size(max = 20)
	@NotBlank
	@Column(name = "department")
	private String department;

	@Max(999999999)
	@Column(name = "salary")
	private int salary;

	public Employee(String name, String surname, String department, int salary) {
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.salary = salary;
	}
}
