package Model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class EmployeeStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ides;

	private String name;

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

}