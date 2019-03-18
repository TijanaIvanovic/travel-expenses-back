package com.TravelCosts.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "idu")
@Entity
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@SequenceGenerator(name="users_seq_gen", sequenceName="users_seq", allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="users_seq_gen")
	@Column(name="IDU")
	private int idu;

	private String username;
	
	private String password;

	@ManyToOne
	@JoinColumn(name="ROLE_IDR", foreignKey=@ForeignKey(name="users_role_fk"))
	private Role role;
	
	@OneToOne
	@JoinColumn(name="EMPLOYEE_IDE")
	private Employee employee;
	
	public int getIdu() {
		return idu;
	}

	public void setIdu(int idu) {
		this.idu = idu;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	
	


}