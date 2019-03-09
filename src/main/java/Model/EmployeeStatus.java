package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EMPLOYEESTATUS database table.
 * 
 */
@Entity
@NamedQuery(name="Employeestatus.findAll", query="SELECT e FROM Employeestatus e")
public class Employeestatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long ides;

	private String name;

	public Employeestatus() {
	}

	public long getIdes() {
		return this.ides;
	}

	public void setIdes(long ides) {
		this.ides = ides;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}