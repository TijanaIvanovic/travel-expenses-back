package com.TravelCosts.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "iddw")
@Entity
public class Destinationwage implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@SequenceGenerator(name="dwage_seq_gen", sequenceName="dwage_seq", allocationSize =  1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="dwage_seq_gen")
	@Column(name="IDDW")
	private int iddw;
	
	@Temporal(TemporalType.DATE)
	private Date startdate;
	
	@Temporal(TemporalType.DATE)
	private Date enddate;
	
	
	@ManyToOne
	@JoinColumn(name="destination_idd", foreignKey=@ForeignKey(name="destinationwage_destination_fk"))	
	private Destination destination;
	
	@ManyToOne
	@JoinColumn(name="wage_idw", foreignKey=@ForeignKey(name="destinationwage_wage_fk"))	
	private Wage idw;
	
	
	public int getIddw() {
		return iddw;
	}
	public void setIddw(int iddw) {
		this.iddw = iddw;
	}
	public Date getStartDate() {
		return startdate;
	}
	public void setStartDate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEndDate() {
		return enddate;
	}
	public void setEndDate(Date enddate) {
		this.enddate = enddate;
	}
	public Destination getIdd() {
		return destination;
	}
	public void setIdd(Destination destination) {
		this.destination = destination;
	}
	public Wage getIdw() {
		return idw;
	}
	public void setIdw(Wage idw) {
		this.idw = idw;
	}
	
	

}
