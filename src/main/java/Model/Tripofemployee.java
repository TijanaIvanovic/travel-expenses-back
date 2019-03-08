package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TRIPOFEMPLOYEE database table.
 * 
 */
@Entity
@NamedQuery(name="Tripofemployee.findAll", query="SELECT t FROM Tripofemployee t")
public class Tripofemployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idtoe;

	//bi-directional many-to-one association to Busineestrip
	@ManyToOne
	private Busineestrip busineestrip;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	private Employee employee;

	public Tripofemployee() {
	}

	public long getIdtoe() {
		return this.idtoe;
	}

	public void setIdtoe(long idtoe) {
		this.idtoe = idtoe;
	}

	public Busineestrip getBusineestrip() {
		return this.busineestrip;
	}

	public void setBusineestrip(Busineestrip busineestrip) {
		this.busineestrip = busineestrip;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}