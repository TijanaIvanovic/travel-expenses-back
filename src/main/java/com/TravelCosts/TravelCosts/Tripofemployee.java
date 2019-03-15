package com.TravelCosts.TravelCosts;

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
	@SequenceGenerator(name="toe_seq_gen", sequenceName="toe_seq", initialValue =  1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="toe_seq_gen")
	@Column(name="IDTOE")
	private int idtoe;

	@ManyToOne
	@JoinColumn(name="businesstrip2_idbt", foreignKey=@ForeignKey(name="tripofemployee_businestrip_fk"))
	private Businesstrip businesstrip;

	@ManyToOne
	@JoinColumn(name="employee_ide", foreignKey=@ForeignKey(name="tripofemployee_employee_fk"))
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
		return this.businesstrip;
	}

	public void setBusinesstrip(Businesstrip busineestrip) {
		this.businesstrip = businesstrip;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}