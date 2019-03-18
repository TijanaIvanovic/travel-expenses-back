package com.TravelCosts.Model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "idtoe")
@Entity
public class Tripofemployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="toe_seq_gen", sequenceName="toe_seq", allocationSize =  1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="toe_seq_gen")
	@Column(name="IDTOE")
	private int idtoe;

	@ManyToOne
	@JoinColumn(name="BUSINESSTRIP_IDBT", foreignKey=@ForeignKey(name="tripofemployee_businesstrip_fk"))
	private Businesstrip businesstrip;

	@ManyToOne
	@JoinColumn(name="EMPLOYEE_IDE")
	private Employee employee;

	public Tripofemployee() {
	}

	public int getIdtoe() {
		return this.idtoe;
	}

	public void setIdtoe(int idtoe) {
		this.idtoe = idtoe;
	}

	public Businesstrip getBusinesstrip() {
		return businesstrip;
	}

	public void setBusinesstrip(Businesstrip businesstrip) {
		this.businesstrip = businesstrip;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	
	

}