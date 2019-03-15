package com.TravelCosts.TravelCosts;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="emp_seq_gen", sequenceName="emp_seq", allocationSize =  1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="emp_seq_gen")
	@Column(name="IDE")
	private int ide;
	
	@Column
	private String email;

	private String firstname;

	private String lastname;

	@ManyToOne
	@JoinColumn(name="employeestatus_ides", foreignKey=@ForeignKey(name="employee_employeestatus_fk"))
	private Employeestatus employeestatus;


	@OneToMany(mappedBy="employee")
	private List<Tripofemployee> tripofemployees;

	public Employee() {
	}

	public int getIde() {
		return this.ide;
	}

	public void setIde(int ide) {
		this.ide = ide;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public List<Tripofemployee> getTripofemployees() {
		return this.tripofemployees;
	}

	public void setTripofemployees(List<Tripofemployee> tripofemployees) {
		this.tripofemployees = tripofemployees;
	}

	public Employeestatus getEmployeeStatus() {
		return employeestatus;
	}

	public void setEmployeeStatus(Employeestatus employeeStatus) {
		this.employeestatus = employeeStatus;
	}

	@Override
	public String toString() {
		return "Employee [ide=" + ide + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", employeestatus=" + employeestatus + ", tripofemployees=" + tripofemployees + "]";
	}




}