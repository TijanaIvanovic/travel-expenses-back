package Model;

import java.io.Serializable;
import javax.persistence.*;

public class TripOfEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idtoe;

	private BusinessTrip busineestrip;

	private Employee employee;

	public TripOfEmployee() {
	}

	public int getIdtoe() {
		return this.idtoe;
	}

	public void setIdtoe(int idtoe) {
		this.idtoe = idtoe;
	}

	public BusinessTrip getBusineestrip() {
		return this.busineestrip;
	}

	public void setBusineestrip(BusinessTrip busineestrip) {
		this.busineestrip = busineestrip;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}