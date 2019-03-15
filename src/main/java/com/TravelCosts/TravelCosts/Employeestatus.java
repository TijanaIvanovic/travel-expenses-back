package com.TravelCosts.TravelCosts;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
public class Employeestatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@SequenceGenerator(name="empst_seq_gen", sequenceName="empst_seq", initialValue = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="empst_seq_gen")
	@Column(name="IDES")
	private int ides;

	private String name;
	
	@OneToMany
	private List<Employee> employees;

	public Employeestatus() {
	}

	public int getIdes() {
		return this.ides;
	}

	public void setIdes(int ides) {
		this.ides = ides;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	

}