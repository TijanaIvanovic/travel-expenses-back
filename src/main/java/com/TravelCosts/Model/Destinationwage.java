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
	@JoinColumn(name="DESTINATION_IDD" )//, foreignKey=@ForeignKey(name="destinationwage_destination_fk"))	
	private Destination destination;
	
	@ManyToOne
	@JoinColumn(name="WAGE_IDW", foreignKey=@ForeignKey(name="destinationwage_wage_fk"))
	private Wage wage;
	
	
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
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public Wage getWage() {
		return wage;
	}
	public void setWage(Wage wage) {
		this.wage = wage;
	}
	
	

}
