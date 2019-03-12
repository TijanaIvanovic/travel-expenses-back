package Model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="IDE")
	private int ide;

	private String email;

	private String firstname;

	private String lastname;

	@ManyToOne
	@JoinColumn(name="employeestatus_ides")
	private EmployeeStatus employeeStatus;


	@OneToMany(mappedBy="employee")
	private List<TripOfEmployee> tripofemployees;

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


	public List<TripOfEmployee> getTripofemployees() {
		return this.tripofemployees;
	}

	public void setTripofemployees(List<TripOfEmployee> tripofemployees) {
		this.tripofemployees = tripofemployees;
	}

	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(EmployeeStatus employeeStatus) {
		this.employeeStatus = employeeStatus;
	}




}