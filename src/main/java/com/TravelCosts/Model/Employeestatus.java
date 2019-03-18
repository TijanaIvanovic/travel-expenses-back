package com.TravelCosts.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "ides")
@Entity
public class Employeestatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@SequenceGenerator(name="empst_seq_gen", sequenceName="empst_seq", allocationSize =  1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="empst_seq_gen")
	@Column(name="IDES")
	private int ides;

	private String name;
	
	@Autowired
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="employeestatus")
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

//	public List<Employee> getEmployees() {
//		return employees;
//	}
//
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
	
	

}