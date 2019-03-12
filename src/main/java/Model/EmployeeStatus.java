package Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
public class EmployeeStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="IDES")
	private int ides;

	private String name;
	
	@OneToMany
	private List<Employee> employees;

	public EmployeeStatus() {
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