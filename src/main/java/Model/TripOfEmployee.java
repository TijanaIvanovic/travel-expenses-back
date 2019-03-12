package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class TripOfEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="IDTOE")
	private int idtoe;

	@ManyToOne
	@JoinColumn(name="businesstrip_idbt")
	private BusinessTrip businesstrip;

	@ManyToOne
	@JoinColumn(name="employee_ide")
	private Employee employee;

	public TripOfEmployee() {
	}

	public int getIdtoe() {
		return this.idtoe;
	}

	public void setIdtoe(int idtoe) {
		this.idtoe = idtoe;
	}

	public BusinessTrip getBusinesstrip() {
		return this.businesstrip;
	}

	public void setBusinesstrip(BusinessTrip busineestrip) {
		this.businesstrip = businesstrip;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}