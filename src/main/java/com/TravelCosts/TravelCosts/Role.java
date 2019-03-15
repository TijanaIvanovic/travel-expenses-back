package com.TravelCosts.TravelCosts;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "role_seq_gen", sequenceName="role_seq", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="role_seq_gen")
	@Column(name="IDR")
	private int idr;
	
	@OneToMany(mappedBy="role")
	private List<Users> users;

	private String name;

	public Role() {
	}

	public int getIdr() {
		return this.idr;
	}

	public void setIdr(int idr) {
		this.idr = idr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}



}