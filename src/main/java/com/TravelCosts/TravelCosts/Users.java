package com.TravelCosts.TravelCosts;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

@Entity
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@SequenceGenerator(name="users_seq_gen", sequenceName="users_seq", initialValue = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="users_seq_gen")
	@Column(name="IDU")
	private int idu;

	private String username;
	
	private String password;

	@ManyToOne
	@JoinColumn(name="role_idr", foreignKey=@ForeignKey(name="users_role_fk"))
	private Role role;

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


	
	


}